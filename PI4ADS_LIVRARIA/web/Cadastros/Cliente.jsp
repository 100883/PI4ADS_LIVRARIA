<%-- 
    Document   : Cliente
    Created on : 24/11/2017, 00:34:32
    Author     : vinicius caetano
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsTreebu" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Source/HeadCssJS.jsp" />
        <link href="../Resource/Interno/css/Header.css" rel="stylesheet" type="text/css"/>
        <script src="../Resource/Interno/js/Cliente.js" type="text/javascript"></script>

        <title>Adicionando Cliente</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />

        <div>  <!--Div Mestre - Conteudo Pagina -->

            <div  class="container"> <!-- Teste Informacao Principal Pagin-->   
                <div>
                </div>
            </div> <!-- Teste Informacao Principal Pagin-->   

            <div class="container-fluid center-block">   <!-- Teste Imagem-->

                <div class="card hovercard">
                    <div class="card-background">
                        <img class="card-bkimg" alt="" src="../Resource/imagem/cliente.jpg">
                    </div>
                    <div class="useravatar">
                        <img alt="" src="../Resource/imagem/cliente.jpg">
                    </div>
                    <div class="card-info"> <span class="card-title">Formulário de Cliente</span>
                    </div>
                </div>
            </div> <!-- Teste Imagem-->   

            <div  class="col-md-7 cadastro">
                <fieldset>
                    <legend>Informe os dados do Cliente</legend>
                    <!--Inicio Form -->
                    <form 
                        name="FormCliente"
                        class="container-fluid center-block"
                        method="POST"
                        id="cpf_form"
                        onsubmit="return confirmacao(),"
                        action='ClienteServlet'>

                        <div class="form-group has-feedback">
                            <label>Codigo</label>
                            <input 
                                type="number" 
                                name="codigo"
                                id="codigo"
                                class="form-control"
                                readonly="readonly" 
                                placeholder="000"
                                value="<c:out value="${cliente.codigo}" />" />
                        </div>

                        <div class="form-group has-feedback">
                            <label>Email</label>
                            <input 
                                type="email"
                                name="email"
                                id="email" 
                                class="form-control"
                                placeholder="xxx@xxx"
                                required="true" 
                                maxlength="30" 
                                autofocus
                                value="<c:out value="${cliente.email}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Senha</label>
                            <input 
                                type="password"
                                name="senha"
                                id="senha" 
                                class="form-control"
                                placeholder="**********"
                                required="true" 
                                maxlength="8"  
                                value="<c:out value="${cliente.senha}" />"/>
                        </div> 
                        <!-- Confirmar a Senha -->
                        <div class="form-group has-feedback">
                            <label>Confirmar Senha</label>
                            <input 
                                type="password" 
                                name="confirmarsenha" 
                                id="confirmarsenha" 
                                class="form-control"
                                placeholder="**********"
                                required="true" 
                                maxlength="8"  
                                oninput="validarSenha(this)"> <br/>
                        </div>
                        <!--  Fim Confirmar a Senha -->

                        <div class="form-group has-feedback">
                            <label>Nome</label>
                            <input 
                                type="text"
                                name="nome"
                                id="nome" 
                                class="form-control"
                                placeholder="Nome Completo"
                                maxlength="50"
                                required="true"
                                onsubmit="return validacao()"
                                value="<c:out value="${cliente.nome}" />"/>
                        </div>   

                        <div class="form-group has-feedback">
                            <label>Telefone</label>
                            <input 
                                type="text"
                                name="telefone"
                                id="telefone" 
                                class="form-control"
                                placeholder="(00)0000-0000"
                                required="true" 
                                maxlength="11"  
                                value="<c:out value="${cliente.telefone}" />"/>
                        </div>   

                        <div class="form-group has-feedback">
                            <label>CPF</label>
                            <input 
                                type="text"
                                name="cpf"
                                id="cpf" 
                                class="form-control"
                                placeholder="000.000.000-00"
                                required="true" 
                                oninput="verificaCPF()"
                                maxlength="11"  
                                value="<c:out value="${cliente.cpf}" />"/>
                        </div> 

                        <div class="form-group has-feedback">
                            <label>Data Nascimento</label>
                            <input 
                                type="date"
                                name="dataNascimento"
                                id="dataNascimento" 
                                class="form-control"
                                placeholder="0000-00-00"
                                required="true" 
                                maxlength="10"  
                                value="<fmt:formatDate pattern="yyyy-MM-dd" value="${cliente.dataNascimento}" />" />
                        </div>

                        <div class="form-group has-feedback">
                            <label>Data Cadastro</label>
                            <input 
                                type="date"
                                name="dataCadastro"
                                id="dataCadastro" 
                                class="form-control"
                                placeholder="0000-00-00"
                                required="true" 
                                maxlength="10"
                                oninput="validarDataCadastro(this)"
                                value="<fmt:formatDate pattern="yyyy-MM-dd" value="${cliente.dataCadastro}" />" />
                        </div> 

                        <div class="form-group has-feedback">
                            <label>Logradouro :</label>
                            <input 
                                type="text"
                                name="logradouro"
                                id="logradouro" 
                                class="form-control"
                                placeholder="Logradouro"
                                required
                                maxlength="40"  
                                value="<c:out value="${cliente.logradouro}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Complemento :</label>
                            <input 
                                type="text"
                                name="complemento"
                                id="complemento" 
                                class="form-control"
                                placeholder="Complemento"
                                required="true" 
                                maxlength="40"   
                                value="<c:out value="${cliente.complemento}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Bairro :</label>
                            <input 
                                type="text"
                                name="bairro"
                                id="bairro" 
                                class="form-control"
                                placeholder="Bairro"
                                required="true" 
                                maxlength="40"   
                                value="<c:out value="${cliente.bairro}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Cidade :</label>
                            <input 
                                type="text"
                                name="cidade"
                                id="cidade" 
                                class="form-control"
                                placeholder="Cidade"
                                required
                                maxlength="20"   
                                value="<c:out value="${cliente.cidade}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label>Estado :</label>
                            <input 
                                type="text"
                                name="estado"
                                id="estado" 
                                class="form-control"
                                placeholder="Estado"
                                required="true" 
                                maxlength="20"  
                                value="<c:out value="${cliente.estado}" />"/>
                        </div>

                        <div class="form-group has-feedback">
                            <label> Cep :</label>
                            <input 
                                type="text"
                                name="cep"
                                id="cep" 
                                class="form-control"
                                placeholder="00000-000"
                                required="true" 
                                maxlength="10"  
                                value="<c:out value="${cliente.cep}" />"/>
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
                        <!-- Botoes  -->
                    </form> <!-- Formulario  -->
                </fieldset>
            </div> 
        </div><!--Div Mestre - Conteudo Pagina -->
        <br><br>
        <jsp:include page = "../Source/Footer.jsp" />
    </body>
    <script>

            $(document).ready(function () {

                $('#cpf_form').bootstrapValidator({

                    fields: {
                        cpf: {
                            validators: {
                                callback: {
                                    message: 'Cpf Invalido ! Digite Corretamente',
                                    invalid: 'glyphicon glyphicon-remove',
                                    callback: function (value) {
                                        return validacpf(value);
                                    }
                                }
                            }
                        }
                    }
                });
            });
        </script>
</html>
