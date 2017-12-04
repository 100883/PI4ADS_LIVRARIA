<%-- 
    Document   : DetalheLivro_Sete
    Created on : 30/11/2017, 02:02:23
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
            <div class="row"> <!-- Aqui -->
                <div class="col-xs-4 item-photo">
                    <img style="max-width:100%;" src="../Resource/imagem/cemiterio.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">
                    <h3>O Cemitério</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#">	Stephen King </a> </h5>

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
                                Uma das histórias mais terríveis de Stephen King, O cemitério mostra como a dor e a loucura,
                                muitas vezes, dividem a mesma estrada. Louis Creed, um jovem médico de Chicago,
                                acredita que encontrou seu lugar em uma pequena cidade do Maine. A boa casa, o trabalho 
                                na universidade e a felicidade da esposa e dos filhos lhe trazem a certeza de que fez a melhor
                                escolha. Num dos primeiros passeios pela região, conhecem um cemitério no bosque próximo à 
                                sua casa. Ali, gerações de crianças enterraram seus animais de estimação. Mas, para além dos 
                                pequenos túmulos, há um outro cemitério. Uma terra maligna que atrai pessoas com promessas 
                                sedutoras. Um universo dominado por forças estranhas capazes de tornar real o que sempre 
                                pareceu impossível. A princípio, Louis Creed se diverte com as histórias fantasmagóricas do 
                                vizinho Crandall. No entanto, quando o gato de sua filha Eillen morre atropelado e,
                                subitamente, retorna à vida, ele percebe que há coisas que nem mesmo a sua ciência pode 
                                explicar. Que mistérios esconde o cemitério dos bichos? Terá o homem o direito de interferir
                                no mundo dos mortos? Em busca das respostas, Louis Creed é levado por uma trama sobrenatural
                                em que o limite entre a vida e a morte é inexistente. E, quando descobre a verdade, percebe 
                                que ela é muito pior que seus mais terríveis pesadelos. Pior que a própria morte – e 
                                infinitamente mais poderosa. 
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Suma de Letras; Edição: Nova (1 de julho de 2013)</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 8581050395</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>