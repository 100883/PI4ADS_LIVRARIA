<%-- 
    Document   : AreaCliente
    Created on : 21/11/2017, 15:48:15
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <script src="../Resource/Interno/js/areaCliente.js" type="text/javascript"></script>

        <title>Area Cliente</title>
    </head>
    <body>

        <div class="col-lg-6 col-sm-6">
            <div class="card hovercard">
                <div class="card-background">
                    <img class="card-bkimg" alt="" src="../Resource/imagem/TreebuLogo.jpeg">

                </div>
                <div class="useravatar">
                    <img alt="" src="../Resource/imagem/TreeBu.jpeg">
                </div>
                <div class="card-info"> <span class="card-title">Usuario TreeBu</span>

                </div>
            </div>
            <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
                <div class="btn-group" role="group">
                    <button type="button" id="stars" class="btn btn-primary" href="#tab1" data-toggle="tab"><span class="glyphicon glyphicon-star" aria-hidden="true"></span>
                        <div class="hidden-xs">Dados Pessoas</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="favorites" class="btn btn-default" href="#tab2" data-toggle="tab"><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
                        <div class="hidden-xs">Livros Favoritos</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="following" class="btn btn-default" href="#tab3" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        <div class="hidden-xs">Contato</div>
                    </button>
                </div>
            </div>
            <div class="well">
                <div class="tab-content">
                    <div class="tab-pane fade in active" id="tab1">
                        <h3>Informações 1</h3>
                    </div>
                    <div class="tab-pane fade in" id="tab2">
                        <h3>Informações is tab 2</h3>
                    </div>
                    <div class="tab-pane fade in" id="tab3">
                        <h3>Informações is tab 3</h3>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
