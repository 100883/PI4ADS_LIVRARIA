<%-- 
    Document   : Editora
    Created on : 24/11/2017, 00:34:40
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
        <script src="../Resource/Interno/js/Editora.js" type="text/javascript"></script>
        <title>Adicionando Editora</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container"> <!-- Teste Informacao Principal Pagin-->   
            </div> <!-- Teste Informacao Principal Pagin-->   
            <div class="container-fluid center-block">   <!-- Teste Imagem-->

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/editora.jpg">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/editora.jpg">
                    </div>
                    <div class="card-info"> <span class="card-title">Formulário de Editora</span>

                    </div>
                </div>
            </div> <!-- Teste Imagem-->   

            <div  class="col-md-7 cadastro">
                <fieldset>
                    <legend>Informe os dados da Editora</legend>
                    <!--Inicio Form -->
                    <form 
                        name="FormEditora"
                        class="container-fluid center-block"
                        method="POST"
                        id="cpf_form"   
                        action='EditoraServlet'
                        onsubmit="return confirmacao()">

                        <div class="form-group">
                            <label>Codigo</label>
                            <input 
                                type="number" 
                                name="codigo"
                                id="codigo"
                                class="form-control"  
                                readonly="readonly" 
                                placeholder="000"
                                value="<c:out value="${editora.codigo}" />" />
                        </div>

                        <div 
                            class="form-group has-feedback">
                            <label>Razao Social</label>
                            <input 
                                type="text"
                                name="razaoSocial"
                                id="razaoSocial" 
                                class="form-control"
                                placeholder="Razao Social"
                                autofocus
                                required="true" 
                                maxlength="30" 
                                value="<c:out value="${editora.razaoSocial}" />"/>
                        </div>

                        <div 
                            class="form-group has-feedback">
                            <label>CNPJ</label>
                            <input 
                                type="text"
                                name="cnpj"
                                id="cnpj" 
                                class="form-control"
                                placeholder="00.000.000/0000-00"
                                required="true" 
                                maxlength="14"  
                                value="<c:out value="${editora.cnpj}" />"/>
                        </div> 

                        <div class="form-group has-feedback">
                            <label>Telefone</label>
                            <input 
                                type="tel"
                                name="telefone"
                                id="telefone" 
                                class="form-control"
                                placeholder="(00)0000-0000"
                                required="true" 
                                maxlength="11"  
                                value="<c:out value="${editora.telefone}" />"/>
                        </div>   

                        <div class="form-group has-feedback">
                            <label>Email</label>
                            <input 
                                type="email"
                                name="email"
                                id="email" 
                                class="form-control"
                                placeholder="xxx@xxx"
                                required="true" 
                                maxlength="11"  
                                value="<c:out value="${editora.email}" />"/>
                        </div> 

                        <div class="form-group has-feedback">
                            <label>Representante</label>
                            <input 
                                type="text"
                                name="representante"
                                id="representante" 
                                class="form-control"
                                placeholder="Nome do Representante"
                                required="true" 
                                maxlength="11"  
                                value="<c:out value="${editora.representante}" />"/>
                        </div> 

                        <!--  Endereco -->
                        <legend>Formulario Endereco</legend>

                        <div 
                            class="form-group">
                            <label>Logradouro :</label>
                            <input 
                                type="text"
                                name="logradouro"
                                id="logradouro" 
                                class="form-control"
                                placeholder="Logradouro"
                                required
                                maxlength="50"  
                                value="<c:out value="${editora.logradouro}" />"/>
                        </div>

                        <div 
                            class="form-group">
                            <label>Complemento :</label>
                            <input 
                                type="text"
                                name="complemento"
                                id="complemento" 
                                class="form-control"
                                placeholder="Complemento"
                                required="true" 
                                maxlength="50"   
                                value="<c:out value="${editora.complemento}" />"/>
                        </div>

                        <div 
                            class="form-group">
                            <label>Bairro :</label>
                            <input 
                                type="text"
                                name="bairro"
                                id="bairro" 
                                class="form-control"
                                placeholder="Bairro"
                                required="true" 
                                maxlength="30"   
                                value="<c:out value="${editora.bairro}" />"/>
                        </div>

                        <div 
                            class="form-group">
                            <label>Cidade :</label>
                            <input 
                                type="text"
                                name="cidade"
                                id="cidade" 
                                class="form-control"
                                placeholder="Cidade"
                                required
                                maxlength="25"   
                                value="<c:out value="${editora.cidade}" />"/>
                        </div>

                        <div 
                            class="form-group">
                            <label>Estado :</label>
                            <input 
                                type="text"
                                name="estado"
                                id="estado" 
                                class="form-control"
                                placeholder="Estado"
                                required="true" 
                                maxlength="20"  
                                value="<c:out value="${editora.estado}" />"/>
                        </div>

                        <div 
                            class="form-group">
                            <label> Cep :</label>
                            <input 
                                data-toggle="tooltip"
                                title="Preencha o CEP"
                                type="text"
                                name="cep"
                                id="cep" 
                                class="form-control"
                                placeholder="00000-000"
                                onkeypress=" return formatar('##.###-###', this);"
                                required="true" 
                                maxlength="10"  
                                value="<c:out value="${editora.cep}" />"/>
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
                        <!-- Botoes  -->
                    </form> <!-- Formulario  -->
                </fieldset>
            </div> 

        </div><!--Div Mestre - Conteudo Pagina -->
        <br><br>
        <jsp:include page = "../Source/Footer.jsp" />  
    </body>
</html>