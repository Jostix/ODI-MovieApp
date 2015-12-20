<%-- 
    Document   : createPerson
    Created on : 20 déc. 2015, 15:54:10
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
            <h2><span class="glyphicon glyphicon-bookmark"></span>&nbsp; <h:outputText value="#{msg.createPerson_pageTitle}"/></h2>
        </header>
    
            <h:form id="form">
                <div class="form-group">
                    <h:outputLabel  value="#{msg.person_id}"/>
                    <h:inputText styleClass="form-control" value="#{personCreateBean.id}" label="Number" size="30" required="true" requiredMessage="#{msg.createPerson_id_error}" />
                </div>  
                <div class="form-group">
                    <h:outputLabel value="#{msg.person_firstname}"/>
                    <h:inputText styleClass="form-control" value="#{personCreateBean.firstname}" label="Name" size="50" required="true" requiredMessage="#{msg.createPerson_firstname_error}" />
                </div>  
                <div class="form-group">
                    <h:outputLabel value="#{msg.person_lastname}"/>
                    <h:inputText styleClass="form-control" value="#{personCreateBean.lastname}" label="Rate" size="30" required="true" requiredMessage="#{msg.createPerson_lastname_error}" />
                </div> 
                <div class="form-group">
                    <h:commandButton style="margin-right:15px;" styleClass="btn btn-success" value="#{msg.action_submit}" type="submit" action="#{personCreateBean.createPerson()}"/>
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