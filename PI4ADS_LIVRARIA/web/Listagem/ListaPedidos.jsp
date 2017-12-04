<%-- 
    Document   : ListaPedidos
    Created on : 24/11/2017, 00:38:18
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
        <title>Lista de Pedidos</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de Pedidos  </h2>
                <div class="table-responsive"> 

                    <div class="form-group has-feedback">
                        <label>Pesquisa na Lista Pedidos</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div>

                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">Codigo</th>
                                <th class="text-center">Codigo Cliente</th>
                                <th class="text-center">Valor Total</th>

                                <th class="text-center" colspan="2">Acao</th>
                            </tr>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${pedidoList}" var="pedido">
                                <tr>
                                    <td><c:out value="${pedido.codigo}"/> </td>
                                    <td><c:out value="${pedido.cliente.nome}"/> </td>
                                    <td><c:out value="${pedido.valortotal}"/> </td>

                                    <td> <a 
                                            class="btn btn-warning" 
                                            href="PedidoServlet?action=edit&codigo=<c:out value="${pedido.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td> <a 
                                            class="btn btn-danger" 
                                            href="PedidoServlet?action=delete&codigo=<c:out value="${pedido.codigo}"/>" 
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
               href="PedidoServlet?action=insert">
                <span class=" glyphicon glyphicon-saved">
                </span> Adicionar</a>

        </div>
        <br><br>
        <jsp:include page = "../Source/Footer.jsp" />
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