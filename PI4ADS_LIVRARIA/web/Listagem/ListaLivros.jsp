<%-- 
    Document   : ListaLivros
    Created on : 24/11/2017, 00:37:36
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
        <title>Lista de Livros</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de Livros  </h2>
                <div class="table-responsive"> 

                    <div class="form-group has-feedback">
                        <label>Pesquisa na Lista Livros</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div>


                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                            <tr>
                                <th>Codigo</th>
                                <th class="text-center">Codigo Editora</th>
                                <th class="text-center">Data Publicação</th>
                                <th class="text-center">Nome</th>
                                <th class="text-center">Descrição</th>
                                <th class="text-center">Numero de Paginas</th>
                                <th class="text-center">Ano</th>
                                <th class="text-center">Preço</th>
                                <th class="text-center">ISBN</th>
                                <th class="text-center">Capa</th>
                                <th class="text-center">Quantidade</th>

                                <th class="text-center" colspan="2">Acao</th>
                            </tr>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${livroList}" var="livro">
                                <tr>
                                    <td><c:out value="${livro.codigo}"/> </td>
                                    <td><c:out value="${livro.editora.razaoSocial}"/> </td>
                                    <td><c:out value="${livro.autor.nome}"/> </td>
                                    <td><c:out value="${livro.genero.nome}"/> </td>
                                    <td><c:out value="${livro.idioma.nome}"/> </td>
                                    <td><c:out value="${livro.dataPublicacao}"/> </td>
                                    <td><c:out value="${livro.nome}"/> </td>
                                    <td><c:out value="${livro.descricao}"/> </td>
                                    <td><c:out value="${livro.numPaginas}"/> </td>
                                    <td><c:out value="${livro.ano}"/> </td>
                                    <td><c:out value="${livro.preco}"/> </td>
                                    <td><c:out value="${livro.isbn}"/> </td>
                                    <td><c:out value="${livro.capa}"/> </td>
                                    <td><c:out value="${livro.qdtLivro}"/> </td>

                                    <td>
                                        <a 
                                            class="btn btn-warning" 
                                            href="LivroServlet?action=edit&codigo=<c:out value="${livro.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td>
                                        <a 
                                            class="btn btn-danger" 
                                            href="LivroServlet?action=delete&codigo=<c:out value="${livro.codigo}"/>" 
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
        </div><!-- /.container-fluid -->           
        <div> 
            <a class="btn btn-primary" 
               data-toggle="tooltip" 
               title="Clique adicionar nova Informação" 
               href="LivroServlet?action=insert">
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