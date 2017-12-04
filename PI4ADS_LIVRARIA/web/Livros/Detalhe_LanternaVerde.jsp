<%-- 
    Document   : DetalheLivro_Oito
    Created on : 30/11/2017, 02:02:29
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
                    <img style="max-width:100%;" src="../Resource/imagem/lanternaverde.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">
                    <h3>Lanterna Verde. A Noite Mais Densa</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#"> Geoff Johns</a> </h5>

                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 87,99</h3>

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
                                O universo está em guerra e o lanterna verde Hal Jordan está lutando em todos os seus fronts!
                                Com seus anéis energéticos ardendo em chamas, sete exércitos intergalácticos controlaram o poder do 
                                Espectro Emocional e deram início ao conflito: os guerreiros vermelhos da Ira, o agente laranja da Cobiça,
                                os terroristas amarelos do Medo, os peregrinos azuis da Esperança, a tribo índigo da Compaixão, as amazonas
                                violetas do Amor e os gladiadores esmeralda da Força de Vontade. Mas agora uma escuridão impenetrável ameaça
                                extinguir todos eles, sem falar na realidade inteira! Conseguirão os líderes das tropas superar suas diferenças
                                e lutar pela sobrevivência de tudo o que existe? Ou todas as emoções estão condenadas a perecer sob o tacão frio
                                da morte infinita?
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Panini; Edição: 1ª (18 de outubro de 2017)</li>
                                <li>Capa dura: 532 páginas</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 8583681945</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>