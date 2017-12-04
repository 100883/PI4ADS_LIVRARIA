<%-- 
    Document   : detalhesLivro
    Created on : 30/11/2017, 14:07:44
    Author     : ManaimTI
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .w3-sidebar a {font-family: "Roboto", sans-serif}
            body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
        </style>
        <title>Carrinho de Compras</title>
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //for-mobile-apps -->
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- js -->
        <script src="js/jquery-1.11.1.min.js"></script>
        <!-- //js -->
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- start-smoth-scrolling -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Noto+Sans:400,700' rel='stylesheet' type='text/css'>
        <!--- start-rate---->
        <script src="js/jstarbox.js"></script>
        <link rel="stylesheet" href="css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
        <script type="text/javascript">
            jQuery(function () {
                jQuery('.starbox').each(function () {
                    var starbox = jQuery(this);
                    starbox.starbox({
                        average: starbox.attr('data-start-value'),
                        changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
                        ghosting: starbox.hasClass('ghosting'),
                        autoUpdateAverage: starbox.hasClass('autoupdate'),
                        buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
                        stars: starbox.attr('data-star-count') || 5
                    }).bind('starbox-value-changed', function (event, value) {
                        if (starbox.hasClass('random')) {
                            var val = Math.random();
                            starbox.next().text(' ' + val);
                            return val;
                        }
                    });
                });
            });
        </script>
    </head>
    <body>
        <%@ include file = "../Diretorio/MenuCliente.jsp" %>
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Carrinho de Compras  </h2>
                <div class="table-responsive"> 
                    <table id="mytable" class="table table-bordred table-striped">
                        <tbody id="tbody">
                            <c:forEach items="${detalhesLivro}" var="home">
                                <tr>
                                    <td>
                                        <div class="w3-display-container">
                                            <img src="../Resource/imagem/livro4.jpg" width="85" height="127">

                                            <div class="w3-display-middle w3-display-hover">
                                                <a href="HomeServlet?action=detalhesLivro" class="w3-button w3-black">Adicionar Carrinho</a>
                                            </div>
                                        </div>
                                    </td>
                                    <td><c:out value="${home.nome}"/></td>                
                                    <td><c:out value="${home.descricao}"/></td>                
                                    <td><c:out value="R$ ${home.preco}"/></td>                
                                    <td><input type="number" class="campo" name="qtdLivro" size="2"/> </td>
                                    <td><a href="../Cadastros/PagamentoCartao.jsp" >Pagar com Cartão</a>
                            </c:forEach>
                   </tbody>                
           </table>
      </body>
</html>
