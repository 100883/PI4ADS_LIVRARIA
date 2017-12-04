<%-- 
    Document   : Home1
    Created on : 27/11/2017, 14:36:59
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsTreebu" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Resource/Interno/css/Home1.css" rel="stylesheet" type="text/css"/>
        <script src="Resource//Interno/js/Home1.js" type="text/javascript"></script>
        <jsp:include page = "Source/HeadCssJS.jsp" />

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Home Principal</title>
    </head>
    <body id="page-top" name="page-top" class="active">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">

                <div class="collapse navbar-collapse js-navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <a class="navbar-brand" href="HomeFuncionario.jsp">
                            <img height="20" width="20" 
                                 src="Resource/imagem/TreebuLogo.jpeg" 
                                 class="img-responsive pull-left">Livraria TreeBU</a>


                        <li><a href="Livros/EcommerceLivro.jsp">Ecommerce Livro</a></li>
                        <li><a href="MainControlSI?action=SalvarPesquisaSI">Pesquisa</a></li>
                        <li><a href="PesquisaSI.jsp">Pesquisa Teste</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Cliente<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="LoginCliente.jsp">Login</a></li>
                                <li><a href="SairServlet?action=doGet">Logout</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Funcionario<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="LoginFuncionario.jsp">Login</a></li>
                                <li><a href="SairServlet?action=doGet">Logout</a></li>
                            </ul>
                        </li>
                        <li style="color: #ffffff">
                            Usuario : <tagsTreebu:StatusLogado/>
                        </li>
                        <br>
                        <li style="color: #ffffff">
                            Data : <tagsTreebu:dataHoje/>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <aside id="accordion" class="social text-vertical-center">
            <div class="accordion-social">
                <ul class="panel-collapse collapse in nav nav-stacked" role="tabpanel" aria-labelledby="social-collapse" id="collapseOne">
                    <li><a href="https://www.facebook.com/treebu.treebu.3" target="_blank"><i class="fa fa-lg fa-facebook"></i></a></li>
                    <li><a href="https://twitter.com/LivrariaTreebu" target="_blank"><i class="fa fa-lg fa-twitter"></i></a></li>
                    <li><a href="https://plus.google.com/u/0/103962213840785742760" target="_blank"><i class="fa fa-lg fa-google-plus"></i></a></li>
                    <li><a href="https://github.com/100883" target="_blank"><i class="fa fa-lg fa-github"></i></a></li>
                    <li><a href="skype:live:livrariatreebu?call"><i class="fa fa-lg fa-skype" target="_blank"></i></a></li>
                    <li><a href="http://www.google.com.br" target="_blank"><i class="fa fa-lg fa-stack-exchange"></i></a></li>
                </ul>
            </div>
        </aside>

        <div class="masthead">
            <div class="carousel fade-carousel slide" data-ride="carousel" data-interval="4000" id="bs-carousel">

                <ol class="carousel-indicators">
                    <li data-target="#bs-carousel" data-slide-to="0" class="active"></li>
                    <li data-target="#bs-carousel" data-slide-to="1"></li>
                    <li data-target="#bs-carousel" data-slide-to="2"></li>
                    <li data-target="#bs-carousel" data-slide-to="3"></li>
                </ol>

                <div class="carousel-inner">

                    <div class="item slides active">
                        <div class="slide-1"></div>
                        <div class="hero">
                            <hgroup>
                                <h1>Criatividade e Conhecimento </h1>        
                                <h3>Estamos aqui para ajuda-lo</h3>
                            </hgroup>
                            <button class="btn btn-hero btn-lg" role="button">Pagina Inicial</button>
                        </div>
                    </div>

                    <div class="item slides">
                        <div class="slide-2"></div>
                        <div class="hero">        
                            <hgroup>
                                <h1>Faculdade Fatesg Senai</h1>        
                                <h3>Faculdade Senai e mais de 2 anos nos Apoiando no Conhecimento</h3>
                            </hgroup>       
                            <button class="btn btn-hero btn-lg" role="button">Faculdade Senai</button>
                        </div>
                    </div>

                    <div class="item slides">
                        <div class="slide-3"></div>
                        <div class="hero">        
                            <hgroup>
                                <h1>TreeBu Company</h1>        
                                <h3>Pensou em Tecnologia , Pensou Treebu Company</h3>
                            </hgroup>
                            <button class="btn btn-hero btn-lg" role="button">Treebu Company</button>
                        </div>
                    </div>

                    <div class="item slides">
                        <div class="slide-4"></div>
                        <div class="hero">        
                            <hgroup>
                                <h1>Livro Gratis</h1>        
                                <h3>Treebu Company, disponibiliza livro gratis</h3>
                            </hgroup>
                            <button class="btn btn-hero btn-lg" role="button">Downloads</button>
                        </div>
                    </div>

                </div> 
            </div>
        </div>
    </div>
</div>

<div class="container-fluid">

    <div class="w3-container w3-text-grey" id="items">
    </div> 

    <div class="w3-col l3 s6">
        <div class="w3-container">
            <div class="w3-display-container">
                <img src="Resource/imagem/acoisa.jpg" style="width:100%">
                <span class="w3-tag w3-display-topleft">Novo</span>
                <div class="w3-display-middle w3-display-hover">
                    <a href="Livros/Detalhe_ACoisa.jsp"> <button class="w3-button w3-black">Detalhes <i class="fa fa-shopping-bag"></i></button></a>
                </div>
            </div>
            <p>A Coisa<br><b>R$ 48,99</b></p>
        </div>
    </div>

    <div class="w3-col l3 s6">
        <div class="w3-container">
            <div class="w3-display-container">
                <img src="Resource/imagem/cemiterio.jpg" style="width:100%">
                <span class="w3-tag w3-display-topleft">Novo</span>
                <div class="w3-display-middle w3-display-hover">
                    <a href="Livros/Detalhe_Cemiterio.jsp"> <button class="w3-button w3-black">Detalhes<i class="fa fa-shopping-bag"></i></button></a>
                </div>
            </div>
            <p>O Cemiterio<br><b>R$ 49,99</b></p>
        </div>
    </div>

    <div class="w3-col l3 s6">
        <div class="w3-container">
            <div class="w3-display-container">
                <img src="Resource/imagem/lanternaverde.jpg" style="width:95%">
                <span class="w3-tag w3-display-topleft">Novo</span>
                <div class="w3-display-middle w3-display-hover">
                    <a href="Livros/Detalhe_LanternaVerde.jsp"> <button class="w3-button w3-black">Detalhes<i class="fa fa-shopping-bag"></i></button></a>
                </div>
            </div>
            <p>Lanterna Verde<br><b>R$ 87,99</b></p>
        </div>
    </div>

    <div class="w3-col l3 s6">
        <div class="w3-container">
            <div class="w3-display-container">
                <img src="Resource/imagem/meninaroubavalivro.jpg" style="width:100%">
                <span class="w3-tag w3-display-topleft">Novo</span>
                <div class="w3-display-middle w3-display-hover">
                    <a href="Livros/Detalhe_MeninaRoubava.jsp"> <button class="w3-button w3-black">Detalhes<i class="fa fa-shopping-bag"></i></button></a>
                </div>
            </div>
            <p>A Menina que roubava Livros<br><b>R$ 38,42</b></p>
        </div>
    </div>


    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-offset-1 col-md-7">

            <div class="panel panel-default">
                <div class="bs-callout bs-callout-danger">
                    <h3>Nosso Endereço</h3>
                    <h4>Avenida Goias n° 8965 - Goiânia - Goías</h4>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m21!1m12!1m3!1d328.20725279447294!2d-49.258636919718086!3d-16.67450582944055!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m6!3e6!4m3!3m2!1d-16.674527899999998!2d-49.258424999999995!4m0!5e0!3m2!1spt-BR!2sbr!4v1512031476117" 
                            width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>

                </div>
            </div>
        </div>
        <div class="col-md-4 hidden-xs hidden-sm">
            <div class="panel panel-default">
                <div class="bs-callout bs-right-panel">
                    <h4>Sobre TreeBU</h4>
                    <p><a href="#">Sobre nós</a></p>
                    <p><a href="#">Suporte</a></p>
                    <p><a href="#">Encontre loja</a></p>
                    <p><a href="Diretorio/EmManutencao.jsp">Trabalhe Conosco</a></p>
                    <p><a href="#">Cartão Presente</a></p>
                    <p><a href="#">Ajuda</a></p>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="bs-callout bs-right-panel">
                    <h4>Contatos</h4>
                    <p><i class="fa fa-fw fa-map-marker"></i> Livraria TreeBu</p>
                    <p><i class="fa fa-fw fa-phone"></i> 62984595885</p>
                    <p><i class="fa fa-fw fa-envelope"></i>livrariatreebu@gmail.com</p>

                    <a href="https://www.facebook.com/treebu.treebu.3"><i class="fa fa-facebook-official w3-hover-opacity w3-large"></i></a>
                    <i class="fa fa-instagram w3-hover-opacity w3-large"></i>
                    <i class="fa fa-snapchat w3-hover-opacity w3-large"></i>
                    <i class="fa fa-pinterest-p w3-hover-opacity w3-large"></i>
                    <a href="https://twitter.com/LivrariaTreebu"><i class="fa fa-twitter w3-hover-opacity w3-large"></i></a>
                    <i class="fa fa-linkedin w3-hover-opacity w3-large"></i>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="bs-callout bs-right-panel">
                    <div class="row">
                        <h3 class="text-primary">Treebu Download</h3>
                    </div>
                    <div class="row">
                        <a type="button" class="btn btn-success btn-lg btn-block" href="Diretorio/Downloads.jsp">Click Faça seu Download</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {
        $("[rel='tooltip']").tooltip();
    });
</script>
</body>
</html>
