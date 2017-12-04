<%-- 
    Document   : DetalheLivro_Dois
    Created on : 30/11/2017, 02:02:48
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
                    <img style="max-width:100%;" src="../Resource/imagem/meninaroubavalivro.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">
                    <h3>A Menina que Roubava Livros - Volume 1</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#"> Markus Zusak </a> </h5>

                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 38,42</h3>

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
                                Markus Zusak nasceu em 1975 e é autor de cinco livros, incluindo A garota 
                                que eu quero e Eu sou o mensageiro , acolhidos com críticas radiosas nas revistas Publishers Weekly ,
                                School Library Journal , KLIATT , The Bulletin e Booklist , e recebeu o Prêmio Livro do Ano para 
                                Leitores Mais Velhos , concedido pelo Conselho Australiano de Livros Infantis .

                                Ao falar de suas razões para escrever A menina que roubava livros — 
                                que foi traduzido para mais de quarenta idiomas —, ele explica: 
                                “Eu queria escrever algo muito diferente do que tinha escrito antes.
                                A ideia de um ladrão de livros estava em minha cabeça quando escrevi Eu sou o 
                                mensageiro, mas não estava pronta para ser escrita. A ideia original ambientava-se
                                no presente, em Sydney, e isso não parecia muito certo. Depois, pensei em escrever 
                                sobre as coisas que meus pais tinham visto, ao crescerem na Alemanha nazista e na Áustria,
                                e quando juntei as duas ideias, pareceu funcionar, especialmente quando pensei na importância
                                das palavras naquela época, e naquilo que elas conseguiram levar as pessoas a acreditar,
                                assim como levá-las a fazer.”

                                - Ele mora em Sydney, na Austrália, com a esposa e os dois filhos. 
                                “Uma narrativa sobre o amor à literatura.” Segundo Caderno, O Globo
                                - “Brilhante e altamente ambicioso. É o tipo de livro que pode mudar uma vida.” The New York Times
                                - “A menina que roubava livros merece um lugar na mesma prateleira de O diário de Anne Frank e de A noite, 
                                de Elie Wiesel . Parece destinado a se tornar um clássico.” USA Today
                                - “O amor pelos livros conduz e sustenta a engenhosa estrutura do romance.” Prosa e Verso, O Globo
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Intrínseca; Edição: 1ª (27 de janeiro de 2015)</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 858057451X</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>