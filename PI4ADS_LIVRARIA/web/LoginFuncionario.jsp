<%-- 
    Document   : LoginFuncionario
    Created on : 24/11/2017, 00:35:41
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsTreebu" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "Source/HeadCssJS.jsp" />
        <script src="Resource/Interno/js/login.js" type="text/javascript"></script>
          <link href="Resource/Interno/css/login_1.css" rel="stylesheet" type="text/css"/>

        <title>Login Funcionario</title>
    </head>
    <body>
         <div class="container">
        <div class="card card-container">
          
            <img id="profile-img" class="profile-img-card" src="Resource/imagem/funcionario.jpg" />
            <p id="profile-name" class="profile-name-card"></p>
            <form class="form-signin"  method="POST" action="LoginFuncionarioServlet" name="formAutenticacao">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email..." required autofocus>
                <input type="password" name="senha" id="inputPassword" class="form-control" placeholder="Senha..." required>
                
                 <div>
                     <label><tagsTreebu:MsgLogin/></label>
                </div> 
               
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Acessar</button>
                <a href="Principal.jsp">  <button class="btn btn-lg btn-primary btn-block btn-signin">Voltar</button></a>
            </form>
            <p><tagsTreebu:statusAutenticacao/></p><br><br>
            
             <h4>Se você ainda não possui cadastro.</h4>
            <h4><a href="FuncionarioServlet?action=insert"> Solicite o Cadastro</a></h4>
        </div>
    </div>
    </body>
</html>
