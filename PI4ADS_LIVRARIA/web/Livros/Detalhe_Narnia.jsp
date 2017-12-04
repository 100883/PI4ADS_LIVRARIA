<%-- 
    Document   : DetalheLivro_Quatro
    Created on : 30/11/2017, 02:02:00
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <link href="../Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <link href="../Resource/Interno/css/ProdutoDetalhe.css" rel="stylesheet" type="text/css"/>
        <script src="../Resource/Interno/js/ProdutoDetalhe.js" type="text/javascript"></script>
        <title>Produto Detalhe</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuCliente.jsp" />
        <div class="container">
            <div class="row">
                <div class="col-xs-4 item-photo">
                    <img style="max-width:100%;" src="../Resource/imagem/narnia.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">

                    <h3>As Crônicas de Nárnia. Brochura</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#">	C. S. Lewis</a> </h5>

                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 28,69</h3>

                    <div class="section" style="padding-bottom:20px;">
                        <h6 class="title-attr"><small>Quantidade</small></h6>                    
                        <div>
                            <div class="btn-minus"><span class="glyphicon glyphicon-minus"></span></div>
                            <input value="1" />
                            <div class="btn-plus"><span class="glyphicon glyphicon-plus"></span></div>
                        </div>
                    </div>                

                    <div class="section" style="padding-bottom:20px;">
                        <button class="btn btn-success"><span style="margin-right:20px" class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Adicionar ao Carrinho</button>

                    </div>                                        
                </div>                              

                <div class="col-xs-9">
                    <ul class="menu-items">
                        <li class="active">Descrição do Livro</li>
                    </ul>
                    <div style="width:100%;border-top:1px solid silver">
                        <p style="padding:15px;">
                            <small>
                                Viagens ao fim do mundo, criaturas fantásticas e batalhas épicas entre o bem e o mal - o que
                                mais um leitor poderia querer de um livro? O livro que tem tudo isso é ''O leão, a feiticeira e 
                                o guarda-roupa'', escrito em 1949 por Clive Staples Lewis. MasLewis não parou por aí. 
                                Seis outros livros vieram depois e, juntos, ficaram conhecidos como ''As crônicas de Nárnia''.
                                Nos últimos cinqüenta anos, ''As crônicas de Nárnia'' transcenderam o gênero da fantasia para 
                                se tornar parte do cânone da literatura clássica. Cada um dos sete livros é uma obra-prima, 
                                atraindo o leitor para um mundo em que a magia encontra a realidade, e o resultado é um mundo 
                                ficcional que tem fascinado gerações. Esta edição apresenta todas as sete crônicas integralmente, 
                                num único volume. Os livros são apresentados de acordo com a ordem de preferência de Lewis, cada 
                                capítulo com uma ilustração do artista original, Pauline Baynes. Enganosamente simples e direta, 
                                ''As crônicas de Nárnia'' continuam cativando os leitores com aventuras, personagens e fatos que
                                falam a pessoas de todas as idades.
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: WMF Martins Fontes; Edição: 2ª (1 de janeiro de 2009)</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 857827069X</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>