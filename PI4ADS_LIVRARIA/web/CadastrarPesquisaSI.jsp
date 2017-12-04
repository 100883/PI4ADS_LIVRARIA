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
        <style>
            #radioBtn .notActive{
                color: #3276b1;
                background-color: #fff;

                .btn-default.btn-on.active{background-color: #5BB75B;color: white;}
                .btn-default.btn-off.active{background-color: #DA4F49;color: white;}
            }
        </style>
        <script>
            $('#radioBtn a').on('click', function () {
                var sel = $(this).data('title');
                var tog = $(this).data('toggle');
                $('#' + tog).prop('value', sel);

                $('a[data-toggle="' + tog + '"]').not('[data-title="' + sel + '"]').removeClass('active').addClass('notActive');
                $('a[data-toggle="' + tog + '"][data-title="' + sel + '"]').removeClass('notActive').addClass('active');
            });
        </script>
        <title>Pesquisa Inteligente</title>
    </head>
    <body>
         <jsp:include page = "Diretorio/MenuCliente.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container"> 
                <div>
                    <h1  class="center-block  text-center">Pesquisa Inteligente</h1>
                </div>
            </div> <!-- Formato Pagina-->   
            <div class="container-fluid center-block">

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="Resource/imagem/tablet2.jpg">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="Resource/imagem/tablet2.jpg">
                    </div>
                    <div class="card-info"> <span class="card-title">Pesquisa Inteligente</span>

                    </div>
                </div>


                <form id="cpf_form" method="POST" action='MainControlSI?action=SalvarPesquisaSI'>


                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve Herois?</label><br>
                                <div class="btn-group" id="herois" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][herois]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][herois]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve para melhorar sua auto estima?</label><br>
                                <div class="btn-group" id="confianca" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][confianca]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][confianca]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve Sentimento / Amor?</label><br>
                                <div class="btn-group" id="amor" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][amor]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][amor]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve Alimento / Culinarias?</label><br>
                                <div class="btn-group" id="gastronomia" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][gastronomia]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][gastronomia]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve com curiosidade / Medo?</label><br>
                                <div class="btn-group" id="medo" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][medo]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][medo]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve com Deus / Biblico?</label><br>
                                <div class="btn-group" id="deus" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][deus]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][deus]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve com Imaginação / Algo Ficticio?</label><br>
                                <div class="btn-group" id="imaginario" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][imaginario]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][imaginario]">NÃO</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--radio btn -->
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <label>Gosta de Historia que envolve com Desenho Animado?</label><br>
                                <div class="btn-group" id="infantil" data-toggle="buttons">

                                    <label class="btn btn-default btn-on btn-xs active">
                                        <input type="radio" value="V"  name="multifeatured_module[module_id][infantil]" checked="checked">SIM</label>
                                    <label class="btn btn-default btn-off btn-xs ">
                                        <input type="radio" value="F" name="multifeatured_module[module_id][infantil]">NÃO</label>
                                </div>
                            </div>
                        </div>
                       
                    </div>
                    
                    <div class="container" style="margin-top:20px;">
                        <div class="row">
                            <div class="col-md-5">
                                <button class="btn btn-large btn btn-success" data-toggle="tooltip" type="submit" 
                                    title="Clique para Salvar" value="Salvar">
                                <span class=" glyphicon glyphicon-send"></span>
                                Salvar                            
                                </button>
                                </div>
                            </div>
                        </div>
                    <br> <br> <br>
                </form>
            </div> <!-- Formato Pagina--> 
        </div>   <!--Div Mestre - Conteudo Pagina -->  
        <jsp:include page = "Source/Footer.jsp" />
    </body>
</html>
