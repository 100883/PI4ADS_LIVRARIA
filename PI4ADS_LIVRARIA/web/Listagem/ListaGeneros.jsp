<%-- 
    Document   : ListaGeneros
    Created on : 24/11/2017, 00:37:19
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
        <title>Lista de Generos</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de Generos  </h2>
                <div class="table-responsive"> 

                    <div class="form-group has-feedback"><!-- teste pesquisa --> 
                        <label>Pesquisa na Lista Generos</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div><!-- teste pesquisa --> 


                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">Codigo</th>
                                <th class="text-center">Nome</th>
                                <th class="text-center">Descricão</th>

                                <th class="text-center" colspan="2">Acao</th>
                            </tr>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${generoList}" var="genero">
                                <tr>
                                    <td><c:out value="${genero.codigo}"/> </td>
                                    <td><c:out value="${genero.nome}"/> </td>
                                    <td><c:out value="${genero.descricao}"/> </td>
                                    <td> <a 
                                            class="btn btn-warning" 
                                            href="GeneroServlet?action=edit&codigo=<c:out value="${genero.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td> <a 
                                            class="btn btn-danger" 
                                            href="GeneroServlet?action=delete&codigo=<c:out value="${genero.codigo}"/>" 
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
            <div> 
                <a class="btn btn-primary" 
                   data-toggle="tooltip" 
                   title="Clique adicionar nova Informação" 
                   href="GeneroServlet?action=insert">
                    <span class=" glyphicon glyphicon-saved">
                    </span> Adicionar</a>
            </div> 
            <br><br>
            <jsp:include page = "../Source/Footer.jsp" />
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
            </body>
           
</html>