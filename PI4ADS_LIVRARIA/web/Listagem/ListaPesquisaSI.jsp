<%-- 
    Document   : ListaPesquisaSICommand
    Created on : 30/11/2017, 05:08:16
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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div>
            <div class="conteudo">
                <div  class="container">
                    <div class="container">
                        <h1 class="page-header">Pesquisa Sistema Inteligente </h1>
                        <a href="MainControlSI?action=SalvarPesquisaSI" data-toggle="tooltip" title="Adicionar novo registro" type="button" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Adicionar</a>
                        <div class="table-responsive">
                            <table class="table table-bordered table-striped">		      
                                <thead>
                                    <tr>                                        
                                        <th class="text-center">#</th>
                                        <th>Codigo</th>
                                        <th>Herois</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${clientes}" var="pesquisasi">
                                        <tr>        
                                            <td>
                                                <a title="Remover registro" class="btn btn-danger" href="mainControll?action=RemovePesquisaSI&codigo=<c:out value="${pesquisasi.codigo}"/>"><span class="glyphicon glyphicon-remove"/></a>
                                                <a title="Editar registro " class="btn btn-warning" href="mainControll?action=EditarPesquisaSI&codigo=<c:out value="${pesquisasi.codigo}"/>"><span class="glyphicon glyphicon-edit"/></a>
                                            </td>
                                            <td><c:out value="${pesquisasi.herois}" /></td>    
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
      <jsp:include page = "../Source/Footer.jsp" />
</body>
</html>
