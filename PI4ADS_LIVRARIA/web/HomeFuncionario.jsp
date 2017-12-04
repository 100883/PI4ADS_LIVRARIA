<%-- 
    Document   : Home
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
        <title>Home Funcionario</title>
    </head>

    <body class="w3-content" style="max-width:1200px">

        <nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-top" style="z-index:3;width:250px" id="mySidebar">
            <div class="w3-container w3-display-container w3-padding-16">
                <i onclick="w3_close()" class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
                <img id="profile-img"  src="Resource/imagem/TreebuLogo.jpeg" width="150" />
            </div>
            <div class="w3-padding-64 w3-large w3-text-grey" style="font-weight:bold">
                <a href="Livros/EcommerceLivro.jsp" class="w3-bar-item w3-button">Livros</a>
                <a href="Cadastros/CadastrarPesquisaSI.jsp" class="w3-bar-item w3-button">Indicação</a>
                <a href="Diretorio/Downloads.jsp" class="w3-bar-item w3-button">Downloads</a>

                <a onclick="myAccFunc()" href="javascript:void(0)" 
                   class="w3-button w3-block w3-white w3-left-align"
                   id="myBtn"> Cadastros 
                    <i class="fa fa-caret-down"></i></a>

                <div id="demoAcc" class="w3-bar-block w3-hide w3-padding-large w3-medium">
                    <a href="AutorServlet?action=insert" class="w3-bar-item w3-button w3-light-grey">
                        <i class="fa fa-caret-right w3-margin-right"></i>Autor</a>
                    <a href="ClienteServlet?action=insert" class="w3-bar-item w3-button">Cliente</a>
                    <a href="FuncionarioServlet?action=insert" class="w3-bar-item w3-button">Funcionario</a>
                    <a href="EditoraServlet?action=insert" class="w3-bar-item w3-button">Editora</a>
                    <a href="GeneroServlet?action=insert" class="w3-bar-item w3-button">Genero</a>
                    <a href="IdiomaServlet?action=insert" class="w3-bar-item w3-button">Idioma</a>
                     <a href="LivroServlet?action=insert" class="w3-bar-item w3-button">Livro</a>
                    <a href="PedidoServlet?action=insert" class="w3-bar-item w3-button">Pedido</a>
                    <a href="Cadastros/CadastrarPesquisaSI.jsp" class="w3-bar-item w3-button">Pesquisa</a>
                    <a href="HomeFuncionario.jsp" class="w3-bar-item w3-button">Home Funcionario</a>
                    <a href="LoginFuncionario.jsp" class="w3-bar-item w3-button">login</a>
                </div>

                <a onclick="myAccFunc1()" href="javascript:void(0)" 
                   class="w3-button w3-block w3-white w3-left-align"
                   id="myBtn"> Listagem 
                    <i class="fa fa-caret-down"></i></a>

                <div id="demoAcc1" class="w3-bar-block w3-hide w3-padding-large w3-medium">
                    <a href="AutorServlet?action=ListaAutores" class="w3-bar-item w3-button w3-light-grey">
                        <i class="fa fa-caret-right w3-margin-right"></i>Lista Autores</a>
                        <a href="GeneroServlet?action=ListaGeneros" class="w3-bar-item w3-button">Lista Generos</a>
                        <a href="ClienteServlet?action=ListaClientes" class="w3-bar-item w3-button"> Lista Cliente</a>
                    <a href="FuncionarioServlet?action=ListaFuncionarios" class="w3-bar-item w3-button">Lista Funcionario</a>
                    <a href="EditoraServlet?action=ListaEditoras" class="w3-bar-item w3-button">Lista Editora</a>
                    <a href="IdiomaServlet?action=ListaIdiomas" class="w3-bar-item w3-button">Lista Idioma</a>
                    <a href="PedidoServlet?action=ListaPedidos" class="w3-bar-item w3-button">Lista Pedido</a>
                    <a href="LivroServlet?action=ListaLivros" class="w3-bar-item w3-button">Lista Livro</a>
                    <a href="HomeFuncionario.jsp" class="w3-bar-item w3-button">Home Funcionario</a>
                    <a href="LoginFuncionario.jsp" class="w3-bar-item w3-button">Login Funcionario</a>
                </div>

                <a href="Diretorio/EmManutencao.jsp" class="w3-bar-item w3-button">Relatorios</a>
                <a href="Diretorio/AreaCliente.jsp" class="w3-bar-item w3-button">Área Cliente</a>
                <a href="Diretorio/AreaFuncionario.jsp" class="w3-bar-item w3-button">Área Funcionario</a>
                <a href="Diretorio/Equipe.jsp" class="w3-bar-item w3-button">Equipe</a>
            </div>
            <a href="#footer" class="w3-bar-item w3-button w3-padding">Contato</a> 
            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding" 
               onclick="document.getElementById('newsletter').style.display = 'block'">NOTÍCIAS</a> 
            <a href="#footer"  class="w3-bar-item w3-button w3-padding">Se inscrever</a>
        </nav>

        <header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
            <div class="w3-bar-item w3-padding-24 w3-wide">LOGO</div>
            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding-24 w3-right"
               onclick="w3_open()"><i class="fa fa-bars"></i></a>
        </header>

        <div class="w3-overlay w3-hide-large" onclick="w3_close()"
             style="cursor:pointer" title="close side menu" id="myOverlay"></div>

        <div class="w3-main" style="margin-left:250px">

            <div class="w3-hide-large" style="margin-top:83px"></div>

            <header class="w3-container w3-xlarge">
                <p class="w3-left">Sua Livraria TreeBu - Seja Bem Vindo Funcionario <tagsTreebu:StatusLogado/> </p>
                <p class="w3-right">
                    <i class="fa fa-shopping-cart w3-margin-right"></i>
                    <i class="fa fa-search"></i>
                </p>
            </header>

            <div class="w3-display-container w3-container">

                <div class="container">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="item active"><img src="Resource/imagem/livro5.jpg"  width="80%"></div>
                            <div class="item"><img src="Resource/imagem/propagandadestaque.jpg" width="80%"></div>
                            <div class="item"><img src="Resource/imagem/livro6.jpg" width="80%"></div>
                            <div class="item"><img src="Resource/imagem/fatesg.jpg" width="80%"></div>
                        </div>
                    </div>
                </div>  
            </div>
            <div class="w3-container w3-text-grey" id="xxxx">
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
                            <p><input class="w3-input w3-border" type="text" placeholder="Mensagem" name="Message" required></p>
                            <button type="submit" class="w3-button w3-block w3-black">Enviar</button>
                        </form>
                    </div>

                    <div class="w3-col s4">
                        <h4>Sobre TreeBU</h4>
                        <p><a href="Diretorio/EmManutencao.jsp">Sobre nós</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Suporte</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Encontre loja</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Envio</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Forma de pagamento</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Cartão Presente</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Retorna</a></p>
                        <p><a href="Diretorio/EmManutencao.jsp">Ajuda</a></p>
                    </div>

                    <div class="w3-col s4 w3-justify">
                        <h4>TreeBU</h4>
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
            </footer>
        </div>

        <div id="newsletter" class="w3-modal">
            <div class="w3-modal-content w3-animate-zoom" style="padding:32px">
                <div class="w3-container w3-white w3-center">
                    <i onclick="document.getElementById('newsletter').style.display = 'none'" class="fa fa-remove w3-right w3-button w3-transparent w3-xxlarge"></i>
                    <h2 class="w3-wide">BOLETIM DE NOTÍCIAS</h2>
                    <p>Junte-se à nossa lista de correspondência para receber atualizações sobre novas chegadas e ofertas especiais.</p>
                    <p><input class="w3-input w3-border" type="text" placeholder="Enter e-mail"></p>
                    <button type="button" class="w3-button w3-padding-large w3-red w3-margin-bottom" onclick="document.getElementById('newsletter').style.display = 'none'">Subscribe</button>
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
        // Accordion 
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
