<%-- 
    Document   : PagamentoCartao
    Created on : 24/11/2017, 00:35:57
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
        <script src="../Resource/Interno/js/PagamentoCartao.js" type="text/javascript"></script>

        <title>Adicionando PagamentoCartao</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuCliente.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container">  

            </div> 
            <div class="container-fluid center-block"> 

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/cartao.png">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/cartao.png">
                    </div>
                    <div class="card-info"> <span class="card-title">Formulário de Pagamento Cartão</span></div>
                </div>
            </div> 

            <div  class="col-md-7 cadastro">
                <fieldset>
                    <legend>Dados do Pagamento Cartao</legend>
                    <form 
                        name="FormPgtCartao"
                        class="container-fluid center-block"
                        method="POST"
                        id="cpf_form"
                        onsubmit="return confirmacao()"
                        action='PagamentoCartaoServlet'>

                        <div class="form-group has-feedback">
                            <label>Codigo</label>
                            <input 
                                type="number" 
                                name="codigo"
                                id="codigo"
                                class="form-control"
                                readonly="readonly" 
                                placeholder="000"
                                value="<c:out value="${pgtCartao.codigo}" />" />
                        </div>

                        <div class="form-group has-feedback">
                            <label>Nome Titular</label>
                            <input 
                                type="text"
                                name="nomeTitular"
                                id="nomeTitular" 
                                class="form-control"
                                placeholder="Nome do Titular do Cartão"
                                required="true" 
                                maxlength="30" 
                                autofocus
                                value="<c:out value="${pgtCartao.nomeTitular}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Numero do Cartão</label>
                            <input 
                                type="text"
                                name="numeroCartao"
                                id="numeroCartao" 
                                class="form-control"
                                placeholder="0000-0000-0000-0000"
                                required="true" 
                                maxlength="19"  
                                value="<c:out value="${pgtCartao.numerosCartao}" />"/>
                        </div> 

                        <div class="form-group has-feedback">
                            <label>Data Validade</label>
                            <input 
                                type="date"
                                name="dataValidade"
                                id="dataValidade" 
                                class="form-control"
                                placeholder="0000-00-00"
                                required="true" 
                                maxlength="10"  
                                value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pgtCartao.dataValidade}" />" />
                        </div> 


                        <div class="form-group has-feedback">
                            <label>Codigo Segurança :</label>
                            <input 
                                type="text"
                                name="codigoSeguranca"
                                id="codigoSeguranca" 
                                class="form-control"
                                placeholder="000"
                                required
                                maxlength="3"  
                                value="<c:out value="${pgtCartao.codSeguranca}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Quantidade de Parcelas :</label>
                            <input 
                                type="number"
                                name="quantParcelas"
                                id="quantParcelas" 
                                class="form-control"
                                placeholder="0"
                                required="true" 
                                maxlength="2"   
                                value="<c:out value="${pgtCartao.qtdParcelas}" />"/>
                        </div>

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
