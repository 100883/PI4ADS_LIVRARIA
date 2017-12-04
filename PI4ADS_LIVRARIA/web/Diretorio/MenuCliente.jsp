<%-- 
    Document   : MenuCliente
    Created on : 30/11/2017, 02:04:55
    Author     : vinicius caetano
--%>

<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsTreebu" %>

<div class="container">
    <nav class="navbar navbar-default">
        <div class="navbar-header">
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".js-navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="Principal.jsp">TreeBu</a>

        </div>


        <div class="collapse navbar-collapse js-navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="dropdown mega-dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Menus <span class="glyphicon glyphicon-chevron-down pull-right"></span></a>

                    <ul class="dropdown-menu mega-dropdown-menu row">
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Destaques</li>
                                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                                    <div class="carousel-inner">
                                        <div class="item active">
                                            <a href="#"><img src="../Resource/imagem/índice1.jpg" class="img-responsive" alt="product 1"></a>
                                            <h4><small>Inferno</small></h4>
                                            <button class="btn btn-primary" type="button">R$ 49,99</button>
                                            <button href="#" class="btn btn-default" type="button"><span class="glyphicon glyphicon-heart"></span> Add Carrinho</button>
                                        </div>
                                        <!-- End Item -->
                                        <div class="item">
                                            <a href="#"><img src="../Resource/imagem/índice2.jpg" class="img-responsive" alt="product 2"></a>
                                            <h4><small>Anjos e Demonios</small></h4>
                                            <button class="btn btn-primary" type="button">R$ 49,99</button>
                                            <button href="#" class="btn btn-default" type="button"><span class="glyphicon glyphicon-heart"></span> Add Carrinho</button>
                                        </div>
                                        <!-- End Item -->
                                        <div class="item">
                                            <a href="#"><img src="../Resource/imagem/indice.jpg" class="img-responsive" alt="product 3"></a>
                                            <h4><small>Origem</small></h4>
                                            <button class="btn btn-primary" type="button">R$ 49,99</button>
                                            <button href="#" class="btn btn-default" type="button"><span class="glyphicon glyphicon-heart"></span> Add Carrinho</button>
                                        </div>
                                    </div>
                                </div>
                                <li class="divider"></li>
                                <li><a href="#">Voltar para a Pagina <span class="glyphicon glyphicon-chevron-right pull-right"></span></a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Equipe</li>
                                <li><a href="../Diretorio/Equipe.jsp">Nossa Equipe</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Area Reservada</li>
                                <li><a href="AreaCliente.jsp">Area Cliente</a></li>
                                <li class="dropdown-header">Venda Livros</li>
                                <li><a href="../Livros/EcommerceLivro.jsp">Ecommerce Livros</a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Detalhes de Livros</li>
                                <li><a href="../Livros/Detalhe_ACoisa.jsp">Detalhes Coisa</a></li>
                                <li><a href="../Livros/Detalhe_Cemiterio.jsp">Detalhes Cemiterio</a></li>
                                <li><a href="../Livros/Detalhe_Inferno.jsp">Detalhes Inferno</a></li>
                                <li><a href="../Livros/Detalhe_LanternaVerde.jsp">Detalhes Lanterna Verde</a></li>
                                <li><a href="../Livros/Detalhe_MeninaRoubava.jsp">Detalhes Menina Roubava</a></li>
                                <li><a href="../Livros/Detalhe_Narnia.jsp">Detalhes Narnia</a></li>
                                <li><a href="../Livros/Detalhe_PoderAcao.jsp">Detalhes Poder Acao</a></li>
                                <li><a href="../Livros/Detalhe_RefugioMarques.jsp">Detalhes Refugio Marques</a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Sistema Inteligente</li>
                                <li><a href="../Indicacoes/IndicaGibi.jsp">Indicação HQs</a></li>
                                <li><a href="../Indicacoes/IndicaAutoAjuda.jsp">Indicação Auto Ajuda</a></li>
                                <li><a href="../Indicacoes/IndicaFiccao.jsp">Indicação Ficcao</a></li>
                                <li><a href="../Indicacoes/IndicaGastronomia.jsp">Indicação Gastronomia</a></li>
                                <li><a href="../Indicacoes/IndicaInfantil.jsp">Indicação Infantil</a></li>
                                <li><a href="../Indicacoes/IndicaReligioso.jsp">Indicação Religioso</a></li>
                                <li><a href="../Indicacoes/IndicaRomance.jsp">Indicação Romance</a></li>
                                <li><a href="../Indicacoes/IndicaSuspense.jsp">Indicação Suspense</a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Pagamentos</li>
                                <li><a href="#">Tipo de Pagamento</a></li>
                                <li><a href="../Cadastros/PagamentoCartao.jsp">Pagamento Cartao</a></li>
                                <li><a href="#">Pagamento Boleto</a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Relatorios</li>
                                <li><a href="../Relatorios/RelatorioClientes.jsp">Relatorio Cliente</a></li>
                                <li><a href="../Relatorios/RelatorioFuncionarios.jsp"> Relatorio Funcionario</a></li>
                                <li><a href="../Relatorios/RelatorioAutoes.jsp">Relatorio Autor</a></li>
                                <li><a href="../Relatorios/RelatorioEditoras.jsp">Relatorio Editora</a></li>
                                <li><a href="../Relatorios/RelatorioIdiomas.jsp">Relatorio Idioma</a></li>
                                <li><a href="../Relatorios/RelatorioGeneros.jsp">Relatorio Genero</a></li>
                                <li><a href="../Relatorios/RelatorioLivros.jsp">Relatorio Livro</a></li>
                                <li><a href="../Relatorios/RelatorioPesquisas.jsp">Relatorio Pesquisa</a></li>
                                <li><a href="../Relatorios/RelatorioPgtCartao.jsp">Pagamento Cartao</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Sair</li>
                                <li><a href="SairServlet?action=doGet">Sair Sistema</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
            Usuario : <tagsTreebu:StatusLogado/>
        </div>
    </nav>
</div>
