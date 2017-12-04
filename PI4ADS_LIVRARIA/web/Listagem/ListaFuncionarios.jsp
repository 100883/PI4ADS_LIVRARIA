<%-- 
    Document   : ListaFuncionarios
    Created on : 24/11/2017, 00:37:11
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
        <title>Lista de Funcionarios</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuFuncionario.jsp" />
        <div class="container">
            <div class="col-md-12">   
                <h2 class="text-center" > Lista de Funcionarios </h2>
                <div class="table-responsive"> 

                    <div class="form-group has-feedback">
                        <label>Pesquisa na Lista Funcionarios</label>
                        <input class="form-control" id="myInput" type="text" placeholder="Digite para Pesquisa">
                    </div>

                    <table id="mytable" class="table table-bordred table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">Codigo</th>
                                <th class="text-center">Email</th>
                                <th class="text-center">Senha</th>
                                <th class="text-center">Nome</th>
                                <th class="text-center">Telefone</th>
                                <th class="text-center">CPF</th>
                                <th class="text-center">Data Nascimento</th>
                                <th class="text-center">Data Admissao</th>
                                <th class="text-center">Ctps</th>
                                <th class="text-center">Logradouro</th>
                                <th class="text-center">Complemento</th>
                                <th class="text-center">Bairro</th>
                                <th class="text-center">Cidade</th>
                                <th class="text-center">Estado</th>
                                <th class="text-center">Cep</th>
                                <th class="text-center" colspan="2">Acao</th>
                            </tr>
                        </thead>

                        <tbody id="tbody">
                            <c:forEach items="${funcionarioList}" var="funcionario">
                                <tr>
                                    <td><c:out value="${funcionario.codigo}"/> </td>
                                    <td><c:out value="${funcionario.email}"/> </td>
                                    <td><c:out value="${funcionario.senha}"/> </td>
                                    <td><c:out value="${funcionario.nome}"/> </td>
                                    <td><c:out value="${funcionario.telefone}"/> </td>
                                    <td><c:out value="${funcionario.cpf}"/> </td>
                                    <td><fmt:formatDate pattern="yyyy/MM/dd" value="${funcionario.dataNascimento}" /></td>
                                    <td><fmt:formatDate pattern="yyyy/MM/dd" value="${funcionario.dataAdmissao}" /></td>
                                    <td><c:out value="${funcionario.ctps}"/> </td>
                                    <td><c:out value="${funcionario.logradouro}"/> </td>
                                    <td><c:out value="${funcionario.complemento}"/> </td>
                                    <td><c:out value="${funcionario.bairro}"/> </td>
                                    <td><c:out value="${funcionario.cidade}"/> </td>
                                    <td><c:out value="${funcionario.estado}"/> </td>
                                    <td><c:out value="${funcionario.cep}"/> </td>
                                    <td> <a 
                                            class="btn btn-warning" 
                                            href="FuncionarioServlet?action=edit&codigo=<c:out value="${funcionario.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Alterar/Atualizar os Dados">
                                            <span class="glyphicon glyphicon-edit">
                                            </span> Atualizar</a>
                                    </td>

                                    <td> <a 
                                            class="btn btn-danger" 
                                            href="FuncionarioServlet?action=delete&codigo=<c:out value="${funcionario.codigo}"/>" 
                                            data-toggle="tooltip"
                                            title="Clique para Excluir/Deletar os Dados">
                                            <span class="glyphicon-remove-circle">
                                            </span> Excluir</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>        
            <div> 
                <a class="btn btn-primary" 
                   data-toggle="tooltip" 
                   title="Clique adicionar nova Informação" 
                   href="FuncionarioServlet?action=insert">
                    <span class=" glyphicon glyphicon-saved">
                    </span> Adicionar</a>

            </div>   
            <br><br>
            <jsp:include page = "../Source/Footer.jsp" />
            </body>
            <script>
                $(document).ready(function () {
                    $("#myInput").on("keyup", function () {
                        var value = $(this).val().toLowerCase();
                        $("#tbody tr").filter(function () {
                            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                        });
                    });
                });
            </script>
</html>