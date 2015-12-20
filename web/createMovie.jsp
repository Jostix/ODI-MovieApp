<%-- 
    Document   : createMovie
    Created on : 20 déc. 2015, 20:55:17
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<div id="content">
    <div class="well">
    <f:view>
        <header>
            <h2><span class="glyphicon glyphicon-bookmark"></span>&nbsp; <h:outputText value="#{msg.createMovie_pageTitle}"/></h2>
        </header>
    
            <h:form id="form">
                <div class="form-group">
                    <h:outputLabel  value="#{msg.movie_id}"/>
                    <h:inputText styleClass="form-control" value="#{movieCreateBean.id}" label="Number" size="30" required="true" requiredMessage="#{msg.createMovie_id_error}" />
                </div>  
                <div class="form-group">
                    <h:outputLabel value="#{msg.movie_name}"/>
                    <h:inputText styleClass="form-control" value="#{movieCreateBean.name}" label="Name" size="50" required="true" requiredMessage="#{msg.createMovie_name_error}" />
                </div>  
                <div class="form-group">
                    <h:outputLabel value="#{msg.movie_producer}"/>
                    <h:inputText styleClass="form-control" value="#{movieCreateBean.producer}" label="Rate" size="30" required="true" requiredMessage="#{msg.createMovie_producer_error}" />
                </div> 
                <div class="form-group">
                    <h:commandButton style="margin-right:15px;" styleClass="btn btn-success" value="#{msg.action_submit}" type="submit" action="#{movieCreateBean.createMovie()}"/>
                    <h:commandButton style="margin-right:15px;" styleClass="btn btn-warning" value="#{msg.action_reset}" type="reset"/>
                    <h:commandButton action="personList" value="#{msg.action_back}" styleClass="btn btn-info"/>
                </div> 
                <div class="form-group">  
                    <h:messages errorClass="alert alert-danger"/>
                </div>
            </h:form>

        </f:view>
    </div>
</div>

<jsp:include page="/includes/footer.jsp" />