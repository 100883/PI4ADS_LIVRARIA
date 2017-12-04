<%-- 
    Document   : Equipe
    Created on : 21/11/2017, 14:16:53
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <link href="../Resource/Interno/css/equipe.css" rel="stylesheet" type="text/css"/>
        <title>Equipe</title>
    </head>
    <body>
       	<div class="home-doctors  clearfix">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 ">
                        <div class="slogan-section animated fadeInUp clearfix ae-animation-fadeInUp">
                            <h2> TreeBu Company <p> <span>Pensou em Tecnologia <p> Pensou em Treebu Company </p> </span></p></h2>
                            <h3>Segue as informações e contatos da equipe de desenvolvimento da nossa empresa</h3>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
                        <div class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">

                            <ul class="list-inline social-lists animate">
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            </ul>

                            <figure>
                                <img width="100%" height="500" src="../Resource/imagem/Vinicius.jpg" 
                                     class="doc-img animate attachment-gallery-post-single wp-post-image"> 
                            </figure>

                            <div class="text-content">
                                <h5>Vinicius Caetano</h5>
                                <h5><small>Analista de Sistemas Júnior</small></h5>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
                        <div class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">

                            <ul class="list-inline social-lists animate">
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            </ul>

                            <figure>
                                <img width="670" height="500" src="../Resource/imagem/Guilherme.jpeg" 
                                     class="doc-img animate attachment-gallery-post-single wp-post-image"> 
                            </figure>

                            <div class="text-content">
                                <h5>Guilherme Freitas</h5>
                                <h5><small>Gerente de Projeto</small></h5>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
                        <div class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">

                            <ul class="list-inline social-lists animate">
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            </ul>

                            <figure>
                                <img width="670" height="500" src="../Resource/imagem/Jeferson.jpeg" 
                                     class="doc-img animate attachment-gallery-post-single wp-post-image"> 
                            </figure>

                            <div class="text-content">
                                <h5>Jeferson Gustavo</h5>
                                <h5><small>Desenvolvedor Java Junior</small></h5>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-3 col-sm-6  text-center doc-item">
                        <div class="common-doctor animated fadeInUp clearfix ae-animation-fadeInUp">

                            <ul class="list-inline social-lists animate">
                                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                <li><a href="#"><i class="fa fa-phone"></i></a></li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            </ul>

                            <figure>
                                <img width="670" height="500" src="../Resource/imagem/Erique.jpeg" 
                                     class="doc-img animate attachment-gallery-post-single wp-post-image" > 
                            </figure>

                            <div class="text-content">
                                <h5>Erique Souza</h5>
                                <h5><small>Analista de Teste</small></h5>
                            </div>
                        </div>
                    </div>
                    <div class="visible-sm clearfix margin-gap"></div>
                </div>
            </div>
            <a href="../Principal.jsp"> <button type="button" class="btn btn-primary btn-lg btn3d">Pagina Principal</button> </a>
        </div>
        <br><br>
        <jsp:include page = "../Source/Footer.jsp" /> 
    </body>
</html>
