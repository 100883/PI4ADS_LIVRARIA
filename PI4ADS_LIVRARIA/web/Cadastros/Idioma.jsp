<%-- 
    Document   : Idioma
    Created on : 24/11/2017, 00:35:23
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
        <title>Adicionando Idioma</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container"> 
            </div>  
            <div class="container-fluid center-block"> 
                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/idioma.jpg">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/idioma.jpg">
                    </div>
                    <div class="card-info"> <span class="card-title">Formulário de Idioma</span>
                    </div>
                </div>
            </div> 

            <div  class="col-md-7 cadastro">
                <fieldset>
                    <legend>Informe os dados do Idioma</legend>
                    <form 
                        name="FormIdioma"
                        class="container-fluid center-block"
                        method="POST"
                        id="cpf_form"
                        onsubmit="return confirmacao()"
                        action='IdiomaServlet'>

                        <div class="form-group has-feedback">
                            <label>Codigo</label>
                            <input 
                                type="number" 
                                name="codigo"
                                id="codigo"
                                class="form-control"
                                readonly="readonly" 
                                placeholder="000"
                                value="<c:out value="${idioma.codigo}" />" />
                        </div>

                        <div class="form-group has-feedback">
                            <label>Nome</label>
                            <input 
                                type="text"
                                name="nome"
                                id="nome" 
                                class="form-control"
                                placeholder="Idioma"
                                required="true" 
                                maxlength="30" 
                                autofocus
                                value="<c:out value="${idioma.nome}" />"/>
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
