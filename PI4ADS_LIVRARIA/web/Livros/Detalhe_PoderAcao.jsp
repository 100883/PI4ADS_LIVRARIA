<%-- 
    Document   : DetalheLivro_Tres
    Created on : 30/11/2017, 02:01:54
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
                    <img style="max-width:100%;" src="../Resource/imagem/livro_poderacao.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">

                    <h3>O Poder da Ação</h3>    
                    <h5 style="color:#337ab7">Escrito por  <a href="#">	Ph.D. Paulo Vieira</a> </h5>

                    <h6 class="title-price"><small>Valor</small></h6>
                    <h3 style="margin-top:0px;">R$ 18,40</h3>

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
                                "Já aconteceu a você de se olhar no espelho e não gostar daqueles quilos a mais? 
                                De observar seu momento profissional somente com frustração? De se sentir desconectado
                                dos seus familiares, dos seus amigos? Se você acha que essas são situações normais, 
                                pense de novo! Só porque isso acontece com várias pessoas não quer dizer que a vida 
                                deva ser assim. Só porque algo se torna comum, não significa que seja normal! Neste
                                livro, Paulo Vieira lhe convida a quebrar o ciclo vicioso e iniciar um caminho de 
                                realização. Para isso, ele apresenta o método responsável por impactar 250 mil pessoas
                                ao longo de sua carreira - e que pode ser a chave para o que você tanto procura.
                                No decorrer destas páginas, o autor lhe entrega uma bússola. E para conseguir se
                                guiar por ela você terá de assumir um compromisso com a mudança. Preparado? Aproveite
                                todas as provocações e os desafios propostos nesta obra para conseguir, de fato, 
                                fazer o check-up completo sobre si mesmo. Acorde, creia, comunique, tenha foco, AJA! 
                                Pare de adiar sua vida e seja quem quer ser a partir de agora. Não existe outra opção.
                                E está em suas mãos reescrever seu futuro. Argumentos de Vendas:
                                - Paulo Vieira é um dos maiores coaches do Brasil com mais de 10 mil horas em sessões.
                                - O autor desenvolveu o método CIS, de Inteligência Emocional, ajudando mais de 250 mil
                                pessoas ao longo de sua carreira
                                - Paulo Vieira é presidente da Federação Brasileira de Coaching Integral Sistêmico."
                            </small>
                        </p>
                        <small>
                            <ul>
                                <li>Editora: Gente; Edição: LANÇAMENTO (1 de junho de 2015)</li>
                                <li>Idioma: Português</li>
                                <li>ISBN-10: 854520034X</li>
                            </ul>  
                        </small>
                    </div>
                </div>		
            </div>
        </div>        
    </body>
</html>
