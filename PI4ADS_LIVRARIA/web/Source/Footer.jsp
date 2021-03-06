<%-- 
    Document   : Footer
    Created on : 24/11/2017, 11:16:28
    Author     : vinicius caetano
--%>

<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsTreebu" %>

 <style>
footer {
    background-color: #2d2d30;
    color: #f5f5f5;
    padding: 32px;
}

footer a {
    color: #f5f5f5;
}

footer p {
    font-family: arial;
}

footer a:hover {
    color: #777;
    text-decoration: none;
}
</style>

<footer class="text-center">
  <a class="up-arrow" href="#" data-toggle="tooltip" title="Topo">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a><br><br>
  <p>� 2017 TreeBu.com Todos direitos reservados a Treebu Company <br> <a href="https://www.treebu.com.br" data-toggle="tooltip" title="Visite Livraria TreeBU">www.treebu.com.br</a></p>
  <p>Data : <tagsTreebu:dataHoje/> </p> Usuario : <tagsTreebu:StatusLogado/>
</footer>

<script>
$(document).ready(function(){
    // Initialize Tooltip
    $('[data-toggle="tooltip"]').tooltip();
});
</script> 
