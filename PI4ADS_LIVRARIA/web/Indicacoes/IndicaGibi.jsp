<%-- 
    Document   : IndicaGibi
    Created on : 29/11/2017, 18:34:23
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Resource/Interno/css/indicacao.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Indicacao SI</title>
    </head>
    <body>
        <aside class="profile-card">
            <header>
                <a target="_blank" href="#">
                    <img src="../Resource/imagem/tablet2.jpg" class="hoverZoomLink">
                </a>

                <h1>Sua Indicação é </h1>

                <h2>GIBI</h2>
            </header>

            <div class="profile-bio">
                <p>
                    Parabens por ter utilizado a nossa pesquisa inteligente, pelos dados que você informou a indicacao é GIBI
                </p>

                <a href="../Livros/EcommerceLivro.jsp"><button> Voltar</button></a>
            </div>
        </aside>
        <jsp:include page = "../Source/Footer.jsp" />
    </body>
</html>