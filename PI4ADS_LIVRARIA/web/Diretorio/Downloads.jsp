<%-- 
    Document   : Downloads
    Created on : 25/11/2017, 15:43:21
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <link href="../Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <title>Downloads</title>
    </head>
    <body>
         <jsp:include page = "../Diretorio/MenuCliente.jsp" />
        <header>
            <marquee behavior=alternative  width=100%>
                <h1>Livraria Treebu disponibiliza alguns livros em PDF para efetuar o Download. 
                    Clique e tenha o seu livro em seu disposito.</h1>
            </marquee>
        </header>
       
        <div>
            <div  class="container"></div> 
            <div class="container-fluid center-block">
                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/download1.gif">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/download1.gif">
                    </div>
                    <div class="card-info"> <span class="card-title">Downloads</span></div>
                </div>
            </div>
            <br> <br>    
            <section>
                <img src="../Resource/imagem/indice.jpg" width="200">
                <h4>Origem - Dan Brown</h4>
                <a target="_blank" href="../Arquivo/Exemplo.pdf"
                   class="btn btn-lg btn-primary">
                    <span class="glyphicon glyphicon-cloud-download"></span> Download Livro</a>
            </section>
            <br>
            <section>
                <img src="../Resource/imagem/indice.jpg" width="200">
                <h4>Origem - Dan Brown</h4>
                <a target="_blank" href="../Arquivo/Exemplo.pdf"
                   class="btn btn-lg btn-primary">
                    <span class="glyphicon glyphicon-cloud-download"></span> Download Livro</a>
            </section>  
            <br> <br>
        </div>
        <jsp:include page = "../Source/Footer.jsp" />
    </body>
</html>
