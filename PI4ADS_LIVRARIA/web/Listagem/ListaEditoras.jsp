<%-- 
    Document   : ListaEditoras
    Created on : 24/11/2017, 00:37:01
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
        <title>Lista de Editoras</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de Editoras </h2>
                <div class="table-responsive"> 

                    <div class="form-group has-feedback">
                        <label>Pesquisa na Lista Editoras</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div>

                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">Codigo</th>
                                <th class="text-center">Razao Social</th>
                                <th class="text-center">Cnpj</th>
                                <th class="text-center">Telefone</th>
                                <th class="text-center">Email</th>
                                <th class="text-center">Representante</th>
                                <th class="text-center">Logradouro</th>
                                <th class="text-center">Complemento</th>
                                <th class="text-center">Bairro</th>
                                <th class="text-center">Cidade</th>
                                <th class="text-center">Estado</th>
                                <th class="text-center">Cep</th>
                                <th class="text-center" colspan="2">Acao</th>
                            </tr>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${editoraList}" var="editora">
                                <tr>
                                    <td><c:out value="${editora.codigo}"/> </td>
                                    <td><c:out value="${editora.razaoSocial}"/> </td>
                                    <td><c:out value="${editora.cnpj}"/> </td>
                                    <td><c:out value="${editora.telefone}"/> </td>
                                    <td><c:out value="${editora.email}"/> </td>
                                    <td><c:out value="${editora.representante}"/> </td>
                                    <td><c:out value="${editora.logradouro}"/> </td>
                                    <td><c:out value="${editora.complemento}"/> </td>
                                    <td><c:out value="${editora.bairro}"/> </td>
                                    <td><c:out value="${editora.cidade}"/> </td>
                                    <td><c:out value="${editora.estado}"/> </td>
                                    <td><c:out value="${editora.cep}"/> </td>

                                    <td> <a 
                                            class="btn btn-warning" 
                                            href="EditoraServlet?action=edit&codigo=<c:out value="${editora.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td> <a 
                                            class="btn btn-danger" 
                                            href="EditoraServlet?action=delete&codigo=<c:out value="${editora.codigo}"/>" 
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
            </div><!-- /.container-fluid -->           
            <div> 
                <a class="btn btn-primary" 
                   data-toggle="tooltip" 
                   title="Clique adicionar nova Informação" 
                   href="EditoraServlet?action=insert">
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