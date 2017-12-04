<%-- 
    Document   : HomeCliente
    Created on : 30/10/2017, 13:27:04
    Author     : vinicius caetano
--%>

<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsTreebu" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "Source/HeadCssJS.jsp" />

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .w3-sidebar a {font-family: "Roboto", sans-serif}
            body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
        </style>
        <title>Home Cliente</title>
    </head>

    <body class="w3-content" style="max-width:1200px">

        <nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-top" 
             style="z-index:3;width:250px" id="mySidebar">
            <div class="w3-container w3-display-container w3-padding-16">
                <i onclick="w3_close()" class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
                <img id="profile-img"  src="Resource/imagem/TreebuLogo.jpeg" width="150" />

            </div>
            <div class="w3-padding-64 w3-large w3-text-grey" style="font-weight:bold">
                <a href="Diretorio/AreaCliente.jsp" class="w3-bar-item w3-button">Area Cliente</a>
                <a href="Livros/EcommerceLivro.jsp" class="w3-bar-item w3-button">Ecommerce Livro</a>
                <a href="Diretorio/Downloads.jsp" class="w3-bar-item w3-button">Downloads</a>

                <a onclick="myAccFunc()" href="javascript:void(0)" 
                   class="w3-button w3-block w3-white w3-left-align"
                   id="myBtn"> Relatorios 
                    <i class="fa fa-caret-down"></i></a>

                <div id="demoAcc" class="w3-bar-block w3-hide w3-padding-large w3-medium">
                    <a href="Relatorios/RelatorioClientes.jsp" class="w3-bar-item w3-button w3-light-grey">
                        <i class="fa fa-caret-right w3-margin-right"></i>Relatorio Clientes</a>
                    <a href="Relatorios/RelatorioAutores.jsp" class="w3-bar-item w3-button">Relatorio Autores</a>
                    <a href="Relatorios/RelatorioEditoras.jsp" class="w3-bar-item w3-button">Relatorio Editoras</a>
                    <a href="Relatorios/RelatorioFuncionarios.jsp" class="w3-bar-item w3-button">Relatorio Funcionarios</a>
                    <a href="Relatorios/RelatorioGeneros.jsp" class="w3-bar-item w3-button">Relatorio Generos</a>
                    <a href="Relatorios/RelatorioIdiomas.jsp" class="w3-bar-item w3-button">Relatorio Idiomas</a>
                    <a href="Relatorios/RelatorioLivros.jsp" class="w3-bar-item w3-button">Relatorio Livros</a>
                    <a href="Relatorios/RelatorioPagamentoCartoes.jsp" class="w3-bar-item w3-button">Pagamento Cartoes</a>
                    <a href="Relatorios/RelatorioPedidos.jsp" class="w3-bar-item w3-button">Relatorio Pedido</a>
                    <a href="Relatorios/RelatorioPesquisas.jsp" class="w3-bar-item w3-button">Relatorio Pesquisas</a>
                    <a href="HomeCliente.jsp" class="w3-bar-item w3-button">Home Cliente</a>
                    <a href="Principal.jsp" class="w3-bar-item w3-button">Principal</a>
                </div>

                <a onclick="myAccFunc1()" href="javascript:void(0)" 
                   class="w3-button w3-block w3-white w3-left-align"
                   id="myBtn"> Indicaçoes 
                    <i class="fa fa-caret-down"></i></a>

                <div id="demoAcc1" class="w3-bar-block w3-hide w3-padding-large w3-medium">
                    <a href="Indicacoes/IndicaAutoAjuda.jsp" class="w3-bar-item w3-button w3-light-grey">
                        <i class="fa fa-caret-right w3-margin-right"></i>Indicaçao Auto Ajuda</a>
                    <a href="Indicacoes/IndicaFiccao.jsp" class="w3-bar-item w3-button"> Indicaçao Ficção</a>
                    <a href="Indicacoes/IndicaGastronomia.jsp" class="w3-bar-item w3-button"> Indicaçao Gastronomia</a>
                    <a href="Indicacoes/IndicaGibi.jsp" class="w3-bar-item w3-button"> Indicaçao Gibi</a>
                    <a href="Indicacoes/IndicaInfantil.jsp" class="w3-bar-item w3-button"> Indicaçao Infantil</a>
                    <a href="Indicacoes/IndicaReligioso.jsp" class="w3-bar-item w3-button">Indicaçao Religioso</a>
                    <a href="Indicacoes/IndicaRomance.jsp" class="w3-bar-item w3-button">Indicaçao Romance</a>
                    <a href="Indicacoes/IndicaSuspense.jsp" class="w3-bar-item w3-button">Indicaçao Suspense</a>
                </div>
                <a href="Diretorio/Equipe.jsp" class="w3-bar-item w3-button">Equipe</a>
            </div>
            <a href="#footer" class="w3-bar-item w3-button w3-padding">Contato</a> 
            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding" 
               onclick="document.getElementById('newsletter').style.display = 'block'">NOTÍCIAS</a> 
            <a href="#footer"  class="w3-bar-item w3-button w3-padding">Se inscrever</a>
        </nav>

        <header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
            <div class="w3-bar-item w3-padding-24 w3-wide">LOGO</div>
            <a href="javascript:void(0)" 
               class="w3-bar-item w3-button w3-padding-24 w3-right" 
               onclick="w3_open()"><i class="fa fa-bars"></i></a>
        </header>

        <div class="w3-overlay w3-hide-large" 
             onclick="w3_close()" style="cursor:pointer" 
             title="close side menu" id="myOverlay">

        </div>

        <div class="w3-main" style="margin-left:250px">

            <div class="w3-hide-large" style="margin-top:83px"></div>

            <header class="w3-container w3-xlarge">
                <p class="w3-left">Sua Livraria TreeBu - Bem Vindo Cliente. <tagsTreebu:StatusLogado/></p>
                <p class="w3-right">
                    <i class="fa fa-shopping-cart w3-margin-right"></i>
                    <i class="fa fa-search"></i>
                </p>
            </header>

            <div class="w3-display-container w3-container">     
                <div class="container">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="item active"><img src="Resource/imagem/livro1.jpg"  width="80%"></div>
                            <div class="item"><img src="Resource/imagem/livro2.jpg" width="80%"></div>
                            <div class="item"><img src="Resource/imagem/livro3.jpg" width="80%"></div>
                            <div class="item"><img src="Resource/imagem/fatesg.jpg" width="80%"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="w3-container w3-text-grey" id="xxxx"></div>
            <br><br>
            <div class="w3-col l3 s6">
                <div class="w3-container">
                    <table id="mytable" class="table table-bordred table-striped">
                        <tbody id="tbody">
                        <c:forEach items="${homeList}" var="home">
                            <tr>
                            <div class="w3-display-container">
                                <img src="Resource/imagem/livro4.jpg" style="width:100%">
                                <span class="w3-tag w3-display-topleft">Novo</span>
                                <div class="w3-display-middle w3-display-hover">
                                    <a href="HomeServlet?action=detalhesLivro" class="w3-button w3-black">Adicionar Carrinho</a>
                                </div>
                            </div>
                            <c:out value="${home.nome}"/>
                            <br>
                            <c:out value="${home.descricao}"/>
                            <br>
                            <c:out value="R$ ${home.preco}"/>
                            </tr>
                        </c:forEach>
                        </tbody>                
                    </table>
                </div>
            </div>

            <footer class="w3-padding-64 w3-light-grey w3-small w3-center" id="footer">
                <div class="w3-row-padding">
                    <div class="w3-col s4">
                        <h4>Contato</h4>
                        <p>Questões? Continue.</p>
                        <form action="/action_page.php" target="_blank">
                            <p><input class="w3-input w3-border" type="text" placeholder="Nome" name="Name" required></p>
                            <p><input class="w3-input w3-border" type="text" placeholder="Email" name="Email" required></p>
                            <p><input class="w3-input w3-border" type="text" placeholder="Assunto" name="Subject" required></p>
                            <p><textarea rows="4" cols="50" class="w3-input w3-border" type="text" placeholder="Mensagem" name="Message" required></textarea></p>
                            <button type="submit" class="w3-button w3-block w3-black">Enviar</button>
                        </form>
                    </div>

                    <div class="w3-col s4">
                        <h4>Sobre TreeBU</h4>
                        <p><a href="Diretorio/EmManutencao.jsp">Sobre nós</a></p>
                        <p><a href="Diretorio/Equipe.jsp">Suporte</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Encontre loja</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Envio</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Forma de pagamento</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Cartão Presente</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Retorna</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Ajuda</a></p>
                    </div>

                    <div class="w3-col s4 w3-justify">
                        <h4>TreeBu</h4>
                        <p><i class="fa fa-fw fa-map-marker"></i> Livraria TreeBu</p>
                        <p><i class="fa fa-fw fa-phone"></i> 62984595885</p>
                        <p><i class="fa fa-fw fa-envelope"></i>livrariatreebu@gmail.com</p>
                        <a href="https://www.facebook.com/treebu.treebu.3"><i class="fa fa-facebook-official w3-hover-opacity w3-large"></i></a>
                        <i class="fa fa-instagram w3-hover-opacity w3-large"></i>
                        <i class="fa fa-pinterest-p w3-hover-opacity w3-large"></i>
                        <a href="https://twitter.com/LivrariaTreebu"><i class="fa fa-twitter w3-hover-opacity w3-large"></i></a>
                        <i class="fa fa-linkedin w3-hover-opacity w3-large"></i>
                    </div>
                </div>
            </footer>
        </div>

        <div id="newsletter" class="w3-modal">
            <div class="w3-modal-content w3-animate-zoom" style="padding:32px">
                <div class="w3-container w3-white w3-center">
                    <i onclick="document.getElementById('newsletter').style.display = 'none'" 
                       class="fa fa-remove w3-right w3-button w3-transparent w3-xxlarge"></i>
                    <h2 class="w3-wide">BOLETIM DE NOTÍCIAS</h2>
                    <p>Junte-se à nossa lista de correspondência para receber atualizações sobre novas
                        chegadas e ofertas especiais.</p>
                    <p><input class="w3-input w3-border" type="text" placeholder="Enter e-mail"></p>
                    <button type="button" class="w3-button w3-padding-large w3-red w3-margin-bottom" 
                            onclick="document.getElementById('newsletter').style.display = 'none'">Subscribe</button>
                </div>
            </div>
        </div>
        <jsp:include page = "Source/Footer.jsp" />
    </body>
    <script>
        function myAccFunc() {
            var x = document.getElementById("demoAcc");
            if (x.className.indexOf("w3-show") == -1) {
                x.className += " w3-show";
            } else {
                x.className = x.className.replace(" w3-show", "");
            }
        }
        document.getElementById("myBtn").click();

        function w3_open() {
            document.getElementById("mySidebar").style.display = "block";
            document.getElementById("myOverlay").style.display = "block";
        }

        function w3_close() {
            document.getElementById("mySidebar").style.display = "none";
            document.getElementById("myOverlay").style.display = "none";
        }
    </script>
    <script>
        function myAccFunc1() {
            var x = document.getElementById("demoAcc1");
            if (x.className.indexOf("w3-show") == -1) {
                x.className += " w3-show";
            } else {
                x.className = x.className.replace(" w3-show", "");
            }
        }
        document.getElementById("myBtn").click();

        function w3_open() {
            document.getElementById("mySidebar").style.display = "block";
            document.getElementById("myOverlay").style.display = "block";
        }

        function w3_close() {
            document.getElementById("mySidebar").style.display = "none";
            document.getElementById("myOverlay").style.display = "none";
        }
    </script>
</html>
