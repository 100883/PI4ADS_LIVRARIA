<%-- 
    Document   : MenuFuncionario
    Created on : 30/11/2017, 02:05:05
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
                                <li class="divider"></li>
                                <li><a href="#">Voltar para a Pagina <span class="glyphicon glyphicon-chevron-right pull-right"></span></a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Cadastros</li>
                                <li><a href="../Cadastros/Cliente.jsp">Cliente</a></li>
                                <li><a href="../Cadastros/Funcionario.jsp">Funcionario</a></li>
                                <li><a href="../Cadastros/Autor.jsp">Autor</a></li>
                                <li><a href="../Cadastros/Editora.jsp">Editora</a></li>
                                <li><a href="../Cadastros/Idioma.jsp">Idioma</a></li>
                                <li><a href="../Cadastros/Genero.jsp">Genero</a></li>
                                <li><a href="LivroServlet?action=insert">Livro</a></li>
                                <li><a href="../Diretorio/">Pesquisa</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Equipe</li>
                                <li><a href="../Diretorio/Equipe.jsp">Nossa Equipe</a></li>
                                <li class="dropdown-header">Venda Livros</li>
                                <li><a href="../Livros/EcommerceLivro.jsp">Ecommerce Livro</a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Listas dos Cadastros</li>
                                <li><a href="ClienteServlet?action=ListaClientes">Lista de Clientes</a></li>
                                <li><a href="FuncinarioServlet?action=ListaFuncionarios">Lista de Funcionarios</a></li>
                                <li><a href="AutorServlet?action=ListaAutores">Lista de Autores</a></li>
                                <li><a href="EditoraServlet?action=ListaEditoras">Lista de Editoras</a></li>
                                <li><a href="IdiomaServlet?action=ListaIdiomas">Lista de Idiomas</a></li>
                                <li><a href="GeneroServlet?action=ListaGeneros">Lista de Generos</a></li>
                                <li><a href="LivroServlet?action=ListaLivros">Lista de Livros</a></li>
                                <li><a href="PesquisaServlet?action=ListaPesquisas">Lista de Pesquisa</a></li>
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
                                <li><a href="EmManutencao.jsp">Pagamento Boleto</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Area Reservada</li>
                                <li><a href="../Diretorio/AreaCliente.jsp">Area Cliente</a></li>
                                <li><a href="../Diretorio/AreaFuncionario.jsp">Area Funcinario</a></li>
                                <li><a href="EmManutencao.jsp">Area Administrador</a></li>
                            </ul>
                        </li>
                        <li class="col-sm-3">
                            <ul>
                                <li class="dropdown-header">Detalhes de Livros</li>
                                <li><a href="../Livros/Detalhe_ACoisa.jsp">Detalhes A Coisa</a></li>
                                <li><a href="../Livros/Detalhe_Cemiterio.jsp">Detalhes Cemiterio</a></li>
                                <li><a href="../Livros/Detalhe_Inferno.jsp">Detalhes Inferno</a></li>
                                <li><a href="../Livros/Detalhe_LanternaVerde.jsp">Detalhes Lanterna Verde</a></li>
                                <li><a href="../Livros/Detalhe_MeninaRoubava.jsp">Detalhes Menina que Roubava</a></li>
                                <li><a href="../Livros/Detalhe_PoderAcao.jsp">Detalhes Poder da Ação</a></li>
                                <li><a href="../Livros/Detalhe_PoderAcao.jsp">Detalhes Refugio Marques</a></li>
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
                            </ul>
                        </li>
                        <li class="divider"></li>
                        <li class="dropdown-header">Sair</li>
                        <li><a href="SairServlet?action=doGet">Sair Sistema</a></li>
                    </ul>
                </li>
            </ul>
            Usuario : <tagsTreebu:StatusLogado/>
        </div>
    </nav>    
</div>