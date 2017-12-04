<%-- 
    Document   : DetalheLivro_Seis
    Created on : 30/11/2017, 02:02:17
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
                    <img style="max-width:100%;" src="../Resource/imagem/acoisa.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">
                    <h3>A Coisa</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#">  Stephen King  </a> </h5>
                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 48,99</h3>

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
                                Durante as férias escolares de 1958, em Derry, pacata cidadezinha do Maine, Bill, Richie,
                                Stan, Mike, Eddie, Ben e Beverly aprenderam o real sentido da amizade, do amor, da confiança e... 
                                do medo. O mais profundo e tenebroso medo. Naquele verão, eles enfrentaram pela primeira vez a 
                                Coisa, um ser sobrenatural e maligno que deixou terríveis marcas de sangue em Derry.Quase 
                                trinta anos depois, os amigos voltam a se encontrar. Uma nova onda de terror tomou a pequena
                                cidade. Mike Hanlon, o único que permanece em Derry, dá o sinal. Precisam unir forças novamente.
                                A Coisa volta a atacar e eles devem cumprir a promessa selada com sangue que fizeram quando 
                                crianças. Só eles têm a chave do enigma. Só eles sabem o que se esconde nas entranhas de Derry.
                                O tempo é curto, mas somente eles podem vencer a Coisa. Em It - A Coisa, clássico de Stephen King
                                em nova edição, os amigos irão até o fim, mesmo que isso signifique ultrapassar os próprios 
                                limites.
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Suma de Letras; Edição: 1ª (1 de agosto de 2014)</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 8560280944</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div> 
        </div>        
    </body>
</html>