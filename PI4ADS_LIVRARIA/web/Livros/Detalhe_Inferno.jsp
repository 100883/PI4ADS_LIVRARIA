<%-- 
    Document   : DetalheLivro_Um
    Created on : 30/11/2017, 02:01:41
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
                    <img style="max-width:100%;" src="../Resource/imagem/índice1.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">
                    <h3>Inferno. Uma Nova Aventura de Robert Langdon</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#">Dan Brown</a> </h5>

                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 49,99</h3>

                    <div class="section" style="padding-bottom:20px;">
                        <h6 class="title-attr"><small>Quantidade</small></h6>                    
                        <div>
                            <div class="btn-minus"><span class="glyphicon glyphicon-minus"></span></div>
                            <input value="1" />
                            <div class="btn-plus"><span class="glyphicon glyphicon-plus"></span></div>
                        </div>
                    </div>                

                    <div class="section" style="padding-bottom:20px;">
                        <button class="btn btn-success"><span style="margin-right:20px" 
                                class="glyphicon glyphicon-shopping-cart" 
                                aria-hidden="true"></span> Adicionar ao Carrinho
                        </button>
                    </div>                                        
                </div>                              

                <div class="col-xs-9">
                    <ul class="menu-items">
                        <li class="active">Descrição do Livro</li>
                    </ul>
                    <div style="width:100%;border-top:1px solid silver">
                        <p style="padding:15px;">
                            <small>
                                No meio da noite, o renomado simbologista Robert Langdon acorda de um pesadelo, num hospital. 
                                Desorientado e com um ferimento à bala na cabeça, ele não tem a menor ideia de como foi parar ali. 
                                Ao olhar pela janela e reconhecer a silhueta do Palazzo Vecchio, em Florença, Langdon tem um choque. 
                                Ele nem se lembra de ter deixado os Estados Unidos. Na verdade, não tem nenhuma recordação das últimas 36 horas.
                                Quando um novo atentado contra a sua vida acontece dentro do hospital, Langdon se vê obrigado a fugir e, para isso, 
                                conta apenas com a ajuda da jovem médica Sienna Brooks. De posse de um macabro objeto que Sienna encontrou no paletó 
                                de Langdon, os dois têm que seguir uma série inquietante de códigos criada por uma mente brilhante, obcecada tanto
                                pelo fim do mundo quanto por uma das maiores obras-primas literárias de todos os tempos: A Divina Comédia, de Dante 
                                Alighieri. Mais uma vez superando as expectativas, Dan Brown nos leva por uma viagem pela cultura, pela arte e pela 
                                literatura italianas – passando por lugares como a Galleria degli Uffizi, o Duomo de Florença e a Basílica de São
                                Marcos. Inferno é uma leitura eletrizante e um convite a pensarmos no papel da ciência para o futuro da humanidade.
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Arqueiro</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 8580411521</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>