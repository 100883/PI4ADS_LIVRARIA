<%-- 
    Document   : Erro
    Created on : 24/11/2017, 03:45:56
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "Source/HeadCssJS.jsp" />
        <link href="Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <link href="Resource/Interno/css/Error.css" rel="stylesheet" type="text/css"/>
        <title>Error</title>
    </head>
    <body>
        <div class="background">
            <div class="err">
                <h1 style="text-align: center;"> Error 404. Oops</h1>
                <h2 style="text-align: center;">
                    A página que você esta procurando <b>Esta com Problemas ou Não Existe</b></h2>
                <h2 style="text-align: center;">Entre em contato com a equipe</h2>

                <a href="Diretorio/Equipe.jsp"> <button type="button" class="btn btn-primary btn-lg btn3d">Equipe TreeBu</button> </a> 
                <a href="Principal.jsp"> <button type="button" class="btn btn-primary btn-lg btn3d">Pagina Principal</button> </a> 
            </div>
        </div>
        <br><br>
        <jsp:include page = "Source/Footer.jsp" />
    </body>
</html>
