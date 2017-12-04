<%-- 
    Document   : ListaClientes
    Created on : 24/11/2017, 00:36:54
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
        <script src="../Resource/Interno/js/Cliente.js" type="text/javascript"></script>
        <title>Lista de Cliente</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de Cliente  </h2>
                    <div class="table-responsive"> 

                    <div class="form-group has-feedback">
                        <label>Pesquisa na Lista Cliente</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div>

                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Email</th>
                        <th class="text-center">Senha</th>
                        <th class="text-center">Nome</th>
                        <th class="text-center">Telefone</th>
                        <th class="text-center">CPF</th>
                        <th class="text-center">DataNascimento</th>
                        <th class="text-center" >DataCadastro</th>
                        <th class="text-center" >Logradouro</th>
                        <th class="text-center" >Complemento</th>
                        <th class="text-center" >Bairro</th>
                        <th class="text-center" >Cidade</th>
                        <th class="text-center" >Estado</th>
                        <th class="text-center" >Cep</th>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${clienteList}" var="cliente">
                                <tr>
                                    <td><c:out value="${cliente.codigo}"/> </td>
                                    <td><c:out value="${cliente.email}"/> </td>
                                    <td><c:out value="${cliente.senha}"/> </td>
                                    <td><c:out value="${cliente.nome}"/> </td>
                                    <td><c:out value="${cliente.telefone}"/> </td>
                                    <td><c:out value="${cliente.cpf}"/> </td>
                                    <td><fmt:formatDate pattern="yyyy/MM/dd" value="${cliente.dataNascimento}" /></td>
                                    <td><fmt:formatDate pattern="yyyy/MM/dd" value="${cliente.dataCadastro}" /></td>
                                    <td><c:out value="${cliente.logradouro}"/> </td>
                                    <td><c:out value="${cliente.complemento}"/> </td>
                                    <td><c:out value="${cliente.bairro}"/> </td>
                                    <td><c:out value="${cliente.cidade}"/> </td>
                                    <td><c:out value="${cliente.estado}"/> </td>
                                    <td><c:out value="${cliente.cep}"/> </td>

                                    <td> <a class="btn btn-warning" 
                                           href="ClienteServlet?action=edit&codigo=<c:out value="${cliente.codigo}"/>" 
                                           data-toggle="tooltip"
                                           title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td> <a class="btn btn-danger" 
                                           href="ClienteServlet?action=delete&codigo=<c:out value="${cliente.codigo}"/>" 
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
               href="ClienteServlet?action=insert">
                <span class=" glyphicon glyphicon-saved">
                </span> Adicionar</a>

        </div>     
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