<%-- 
    Document   : createMovieOk
    Created on : 20 d�c. 2015, 21:08:22
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
        <h:outputText value="#{msg.createMovie_success}"/>
    </div>
    
    <h:form>
        <h:commandButton styleClass="btn btn-info" value="#{msg.action_back}" action="personList"/>
    </h:form>

</f:view>
<jsp:include page="/includes/footer.jsp" />