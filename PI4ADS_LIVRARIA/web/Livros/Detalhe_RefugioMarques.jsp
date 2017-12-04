<%-- 
    Document   : DetalheLivro_Cinco
    Created on : 30/11/2017, 02:02:08
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
                    <img style="max-width:100%;" src="../Resource/imagem/refugioM.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">

                    <h3>O Refugio do Marquês</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#">	Lucy Vargas</a> </h5>

   
                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 31,18</h3>

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
                                "Agora você é meu refúgio e, com certeza, o mais belo". Henrik e Caroline não poderiam ser mais 
                                diferentes. Ele, o Marquês de Bridington, é um homem selvagem e inapropriado, que vive há anos no 
                                campo, fugindo dos fantasmas do seu passado obscuro e repleto de segredos. Ela, Caroline Mooren, 
                                a Baronesa de Clarington, é uma jovem destemida, com um passado doloroso, que recebe a missão de 
                                reformar a mansão e talvez o marquês, ao menos é o que a marquesa viúva espera. Ele é um caso perdido.
                                Ela é uma mulher com um futuro incerto. Mas juntos, eles se completam e acendem a chama da paixão, 
                                que ambos acreditavam estar completamente extinguida, trazendo à tona segredos e temores que ambos 
                                escondem. Se reerguer sob o peso do passado será uma batalha que ultrapassará os limites do refúgio 
                                que o marquês pensa ter construído, mas será que o amor é capaz de ultrapassar tantas barreiras e vencer, 
                                ou eles perderão tudo outra vez?
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Charme; Edição: 1ª (26 de junho de 2015)</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 856805613X</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>