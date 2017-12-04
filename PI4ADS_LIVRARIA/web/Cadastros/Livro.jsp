<%-- 
    Document   : Livro
    Created on : 24/11/2017, 00:35:29
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
        <link href="../Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <script src="../Resource/Interno/js/Livro.js" type="text/javascript"></script>
        <title>Adicionando Livro</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container">
            </div>
            <div class="container-fluid center-block">

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/livro2.jpg">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/livro2.jpg">
                    </div>
                    <div class="card-info"> <span class="card-title">Formulário de Livro</span>

                    </div>
                </div>
            </div>

            <div  class="col-md-7 cadastro">
                <fieldset>
                    <legend>Informe os dados do Livro</legend>
                    <form 
                        name="FormLivro"
                        class="container-fluid center-block"
                        method="POST"
                        id="cpf_form"
                        onsubmit="return confirmacao()"
                        action='LivroServlet'>

                        <div class="form-group has-feedback">
                            <label>Codigo</label>
                            <input 
                                type="number" 
                                name="codigo"
                                id="codigo"
                                class="form-control"
                                readonly="readonly" 
                                placeholder="000"
                                value="<c:out value="${livro.codigo}" />" />
                        </div>

                        <div class="form-group">
                            <label>Editora :</label>
                            <select class="form-control" name="cod_editora">
                                <c:forEach items="${editoraList}" var="editora">
                                    <option value="<c:out value="${editora.codigo}"/>" 
                                            ${editora.codigo ==  livro.editora.codigo ? 'selected' : ''}>
                                        <c:out value="${editora.razaoSocial}"/>
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Autor :</label>
                            <select class="form-control" name="cod_autor">
                                <c:forEach items="${autorList}" var="autor">
                                    <option value="<c:out value="${autor.codigo}"/>" 
                                            ${autor.codigo ==  livro.autor.codigo ? 'selected' : ''}>
                                        <c:out value="${autor.nome}"/>
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Genêro :</label>
                            <select class="form-control" name="cod_genero">
                                <c:forEach items="${generoList}" var="genero">
                                    <option value="<c:out value="${genero.codigo}"/>" 
                                            ${genero.codigo ==  livro.genero.codigo ? 'selected' : ''}>
                                        <c:out value="${genero.nome}"/>
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Idioma :</label>
                            <select class="form-control" name="cod_idioma">
                                <c:forEach items="${idiomaList}" var="idioma">
                                    <option value="<c:out value="${idioma.codigo}"/>" 
                                            ${idioma.codigo ==  livro.idioma.codigo ? 'selected' : ''}>
                                        <c:out value="${idioma.nome}"/>
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Data Publicação</label>
                            <input 
                                type="date"
                                name="dataPublicacao"
                                id="dataPublicacao" 
                                class="form-control"
                                placeholder="0000-00-00"
                                maxlength="10"  
                                value="<fmt:formatDate pattern="yyyy-MM-dd" value="${livro.dataPublicacao}" />" />
                        </div> 

                        <div class="form-group has-feedback">
                            <label>Nome</label>
                            <input 
                                type="text"
                                name="nome"
                                id="nome" 
                                class="form-control"
                                placeholder="Nome"
                                required="true" 
                                maxlength="50"  
                                value="<c:out value="${livro.nome}" />"/>
                        </div>  

                        <div class="form-group has-feedback">
                            <label>Descrição</label>
                            <input 
                                type="text"
                                name="descricao"
                                id="descricao" 
                                class="form-control"
                                placeholder="Descrição do Livro"
                                required="true" 
                                maxlength="50"  
                                value="<c:out value="${livro.descricao}" />"/>
                        </div>   

                        <div class="form-group has-feedback">
                            <label>Numero de Paginas</label>
                            <input 
                                type="number"
                                name="numPaginas"
                                id="numPaginas" 
                                class="form-control"
                                placeholder="00000"
                                required="true" 
                                maxlength="5" 
                                autofocus
                                value="<c:out value="${livro.numPaginas}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Ano</label>
                            <input 
                                type="text"
                                name="ano"
                                id="ano" 
                                class="form-control"
                                placeholder="0000"
                                required="true" 
                                maxlength="4"  
                                value="<c:out value="${livro.ano}" />"/>
                        </div>   

                        <div class="form-group has-feedback">
                            <label>Preço</label>
                            <input 
                                type="text"
                                name="preco"
                                id="preco" 
                                class="form-control"
                                placeholder="R$ 0,00"
                                required="true" 
                                value="<c:out value="${livro.preco}" />"/>
                        </div> 

                        <div class="form-group has-feedback">
                            <label>ISBN :</label>
                            <input 
                                type="text"
                                name="isbn"
                                id="isbn" 
                                class="form-control"
                                placeholder="00000-00000-00"
                                required
                                maxlength="14"  
                                value="<c:out value="${livro.isbn}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Capa :</label>
                            <input 
                                type="file"
                                name="capa"
                                id="capa" 
                                class="form-control" 
                                value="<c:out value="${livro.capa}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Quantidade Livro :</label>
                            <input 
                                type="number"
                                name="qdtLivro"
                                id="qdtLivro" 
                                class="form-control"
                                placeholder="000000"
                                required="true" 
                                maxlength="6"   
                                value="<c:out value="${livro.qdtLivro}" />"/>
                        </div>
                        <!-- Botoes  -->
                        <button class="btn btn-large btn btn-info" type="reset" value="Limpar"
                                data-toggle="tooltip"  title="Clique para Limpar Campos">
                            <span class=" glyphicon glyphicon-erase"></span>
                            Limpar
                        </button>

                        <button class="btn btn-large btn btn-success" data-toggle="tooltip" type="submit" 
                                title="Clique para Salvar" value="Salvar">
                            <span class=" glyphicon glyphicon-send"></span>
                            Salvar
                        </button>
                    </form>
                </fieldset>
            </div> 
        </div><!--Div Mestre - Conteudo Pagina -->
        <br><br>
        <jsp:include page = "../Source/Footer.jsp" />
    </body>
</html>
