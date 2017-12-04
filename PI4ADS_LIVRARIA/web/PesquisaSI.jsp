<%-- 
    Document   : CadastrarPesquisaSICommand
    Created on : 30/11/2017, 05:07:50
    Author     : vinicius caetano
--%>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page = "Source/HeadCssJS.jsp" />
        <link href="Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <script src="Resource/Interno/js/PesquisaInteligente.js" type="text/javascript"></script>
        <title>Pesquisa Inteligente Teste</title>
    </head>
    <body>
         <jsp:include page = "Diretorio/MenuCliente.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container"> 
           
            <div class="container-fluid center-block">

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="Resource/imagem/tablet2.jpg">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="Resource/imagem/tablet2.jpg">
                    </div>
                    <div class="card-info"> <span class="card-title">Pesquisa Inteligente Teste</span>

                    </div>
                </div>
                 <br> <br> <br> <br>
                 <form action="#" name="FormPesquisa" method="POST"  onsubmit="indicacao();" >
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve Herois?</label>
                            <input 
                                type="text"
                                name="herois"
                                id="herois" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>                  
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve para melhorar sua auto estima?</label>
                            <input 
                                type="text"
                                name="confianca"
                                id="confianca" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve Sentimento / Amor?</label>
                            <input 
                                type="text"
                                name="amor"
                                id="amor" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve Alimento / Culinarias?</label>
                            <input 
                                type="text"
                                name="comida"
                                id="comida" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve com curiosidade / Medo?</label>
                            <input 
                                type="text"
                                name="medo"
                                id="medo" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve com Deus / Biblico?</label>
                            <input 
                                type="text"
                                name="deus"
                                id="deus" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve com Imaginação / Algo Ficticio?</label>
                            <input 
                                type="text"
                                name="imaginario"
                                id="imaginario" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="form-group has-feedback">
                            <label>Gosta de Historia que envolve com Desenho Animado?</label>
                            <input 
                                type="text"
                                name="desenho"
                                id="desenho" 
                                class="form-control"
                                placeholder="true / false"
                                required="true" 
                                maxlength="5">
                    </div>
                    
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <button class="btn btn-large btn btn-success" data-toggle="tooltip" type="submit" 
                                    title="Clique para Enviar" value="Salvar">
                                <span class=" glyphicon glyphicon-send"></span>
                                Enviar                            
                                </button>
                                </div>
                            </div>
                        </div>
                    <br> <br>
                </form>
              </div> <!-- Formato Pagina-->   
            </div>      
       </div>   <!--Div Mestre - Conteudo Pagina -->  
     <jsp:include page = "Source/Footer.jsp" />
    </body>
</html>
