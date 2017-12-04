<%-- 
    Document   : dataHoje
    Created on : 25/11/2017, 12:32:12
    Author     : vinicius caetano
--%>

<%@tag body-content="empty"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean class="java.util.Date" id="dataatual"/>
<fmt:formatDate value="${dataatual}" pattern="dd/MM/yyy" type="date" />