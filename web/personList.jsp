<%-- 
    Document   : personList
    Created on : 17 déc. 2015, 09:57:30
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<f:view>
    <h1><span class="glyphicon glyphicon-home"></span> <h:outputText value="#{msg.personList_pageTitle}"/></h1>
</f:view>

<jsp:include page="/includes/footer.jsp" />
