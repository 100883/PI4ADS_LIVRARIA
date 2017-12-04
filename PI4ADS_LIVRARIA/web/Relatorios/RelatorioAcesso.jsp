<%-- 
    Document   : RelatorioAcesso
    Created on : 24/11/2017, 11:56:23
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="relatorio" class="br.com.treebu.html.FormBase"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relatorio Acesso</title>
    </head>
    <body>
        <h1>Relatorio Acesso</h1>
        <div id="conteudo">
            <%=relatorio.getRelatoriosAcessos()%>
        </div>
        <div id="editor"></div>
        <button id="btGerarPDF">gerar PDF</button>
    </body>

    <script>
        var doc = new jsPDF();
        var specialElementHandlers = {
            '#editor': function (element, renderer) {
                return true;
            }
        };

        $('#btGerarPDF').click(function () {
            doc.fromHTML($('#conteudo').html(), 15, 15, {
                'width': 170,
                'elementHandlers': specialElementHandlers
            });
            doc.save('exemplo-pdf.pdf');
        });
    </script>
</html>
