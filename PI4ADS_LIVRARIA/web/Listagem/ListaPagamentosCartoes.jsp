<%-- 
    Document   : ListaPagamentosCartoes
    Created on : 24/11/2017, 00:38:08
    Author     : vinicius caetano
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <title>Listagem de PagamentoCartao</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de PagamentoCartao  </h2>
                <div class="table-responsive"> 

                    <div class="form-group has-feedback">
                        <label>Pesquisa na Lista PagamentoCartao</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div>

                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">Codigo</th>
                                <th class="text-center">Nome Titular</th>
                                <th class="text-center">Numero Cartão</th>
                                <th class="text-center">Data Vencimento</th>
                                <th class="text-center">Codigo Segurança</th>
                                <th class="text-center">Quantidade de Parcelas</th>
                                <th class="text-center" colspan="2">Acao</th>
                            </tr>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${pgtCartaoList}" var="pgtCartao">
                                <tr>
                                    <td><c:out value="${pgtCartao.codigo}"/> </td>
                                    <td><c:out value="${pgtCartao.nomeTitular}"/> </td>
                                    <td><c:out value="${pgtCartao.numerosCartao}"/> </td>
                                    <td><fmt:formatDate pattern="yyyy/MM/dd" value="${pgtCartao.dataValidade}" /></td>
                                    <td><c:out value="${pgtCartao.codSeguranca}"/> </td>
                                    <td><c:out value="${pgtCartao.qtdParcelas}"/> </td>

                                    <td> <a 
                                            class="btn btn-warning" 
                                            href="PagamentoCartaoServlet?action=edit&codigo=<c:out value="${pgtCartao.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td> <a 
                                            class="btn btn-danger" 
                                            href="PagamentoCartaoServlet?action=delete&codigo=<c:out value="${pgtCartao.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Excluir/Deletar os Dados">
                                            <span class="glyphicon-remove-circle">
                                            </span> Excluir</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>      
        <div> 
            <a class="btn btn-primary" 
               data-toggle="tooltip" 
               title="Clique adicionar nova Informação" 
               href="PagamentoCartaoServlet?action=insert">
                <span class=" glyphicon glyphicon-saved">
                </span> Adicionar</a>

        </div>  
        <br><br>
        <jsp:include page = "source/Footer.jsp" />
    </body>
    <script>
        $(document).ready(function () {
            $("#myInput").on("keyup", function () {
                var value = $(this).val().toLowerCase();
                $("#tbody tr").filter(function () {
                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                });
            });
        });
    </script>
</html>