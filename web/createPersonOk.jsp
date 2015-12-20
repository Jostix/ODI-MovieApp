<%-- 
    Document   : createPersonOk
    Created on : 20 déc. 2015, 16:14:17
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<f:view>

    <header>
        <h2><span class="glyphicon glyphicon-ok"></span>&nbsp; <h:outputText value="#{msg.action_success}"/></h2>
    </header>

    <div class="alert alert-success" role="alert">
        <h:outputText value="#{msg.createPerson_success}"/>
    </div>

    <h:commandButton action="personList" value="#{msg.action_back}" styleClass="btn btn-info"/>

</f:view>
<jsp:include page="/includes/footer.jsp" />