<%-- 
    Document   : Pedido
    Created on : 24/11/2017, 00:36:07
    Author     : vinicius caetano
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <link href="../Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <title>Adicionando Pedido</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container"> 
            </div> 
            <div class="container-fluid center-block"> 

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/pedido.png">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/pedido.png">
                    </div>
                    <div class="card-info"> <span class="card-title">Formulário de Pedido</span>

                    </div>
                </div>
            </div> 
            <div  class="col-md-7 cadastro">
                <fieldset>
                    <legend>Informe os dados do Pedido</legend>
                    <form 
                        name="FormPedido"
                        class="container-fluid center-block"
                        method="POST"
                        id="cpf_form"
                        onsubmit="return confirmacao()"
                        action='PedidoServlet'>

                        <div class="form-group has-feedback">
                            <label>Numero</label>
                            <input 
                                type="number" 
                                name="numero"
                                id="numero"
                                class="form-control"
                                readonly="readonly" 
                                placeholder="000"
                                value="<c:out value="${pedido.numero}" />" />
                        </div>

                        <div class="form-group">
                            <label>Cliente :</label>
                            <select class="form-control" name="cod_editora">
                                <c:forEach items="${clienteList}" var="cliente">
                                    <option value="<c:out value="${cliente.codigo}"/>" 
                                            ${cliente.codigo ==  pedido.cliente.codigo ? 'selected' : ''}>
                                        <c:out value="${cliente.nome}"/>
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group has-feedback">
                            <label> Valor :</label>
                            <input 
                                type="money"
                                name="valor"
                                id="valor" 
                                class="form-control"
                                placeholder="R$:0,00"
                                required="true" 
                                maxlength="10"  
                                value="<c:out value="${pedido.valor}" />"/>
                        </div>

                        <!-- Botoes  -->
                        <button class="btn btn-large btn btn-info" type="reset" value="Limpar"
                                data-toggle="tooltip"  title="Clique para Limpar Campos">
                            <span class=" glyphicon glyphicon-erase"></span>
                            Limpar
                        </button>

                        <button class="btn btn-large btn btn-success" data-toggle="tooltip" type="submit" 
                                title="Clique para Salvar" value="Salvar">
                            <span class=" glyphicon glyphicon-send"></span>
                            Salvar
                        </button>
                    </form> 
                </fieldset>
            </div> 

        </div><!--Div Mestre - Conteudo Pagina -->
        <br><br>
        <jsp:include page = "../Source/Footer.jsp" />
    </body>
</html>
