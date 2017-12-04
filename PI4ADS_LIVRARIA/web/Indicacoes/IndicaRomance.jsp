<%-- 
    Document   : IndicaRomance
    Created on : 29/11/2017, 21:18:54
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Resource/Interno/css/indicacao.css" rel="stylesheet" type="text/css"/>
        <title>Indicacao SI</title>
    </head>
    <body>
        <aside class="profile-card">
            <header>
                <a target="_blank" href="#">
                    <img src="../Resource/imagem/tablet2.jpg" class="hoverZoomLink">
                </a>
                <h1>Sua Indicação é </h1>

                <h2>Romance</h2>
            </header>

            <div class="profile-bio">
                <p>
                    Parabens por ter utilizado a nossa pesquisa inteligente, 
                   pelos dados que você informou a indicacao é Romance
                </p>
                <a href="../Livros/EcommerceLivro.jsp"><button> Voltar</button></a>
            </div>
        </aside>
        <jsp:include page = "../Source/Footer.jsp" />
    </body>
</html>