<%-- 
    Document   : RelatorioPagamentoCartoes
    Created on : 24/11/2017, 11:57:56
    Author     : vinicius caetano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="relatorio" class="br.com.treebu.html.FormBase"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <jsp:include page = "../Source/HeadCssJS.jsp" />
        <title>Relatorio Pagamento Cartoes</title>
    </head>
    <body>
        <jsp:include page = "../Diretorio/MenuCliente.jsp" />
        <h1>Relatorio Pagamento Cartoes</h1>
        <div id="conteudo">
            <%=relatorio.getRelatoriosPagamentoCartao()%>
        </div>
       <br><br>
        <button class="btn btn-large btn btn-info"  data-toggle="tooltip" type="submit" 
                id="btGerarPDF" title="Clique para Gerar PDF" value="Gerar">
            <span class=" glyphicon glyphicon-book"></span>
            Gerar PDF
        </button>
        <br><br>
          <jsp:include page = "../Source/Footer.jsp" />
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
