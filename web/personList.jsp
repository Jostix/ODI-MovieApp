<%-- 
    Document   : personList
    Created on : 17 déc. 2015, 09:57:30
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<!-- En-tête -->
<f:view>
    <h1><span class="glyphicon glyphicon-home"></span> <h:outputText value="#{msg.personList_pageTitle}"/></h1>
</f:view>

<!-- Tableau-->
<f:view>
    <h:form id="frmPeopleList">
        <h:dataTable id="dtCustomers" var="person" value="#{personBean.people}" styleClass="table">

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.person_id}" />
                </f:facet>  
                <h:outputText id="oTxtNumber1" value ="#{person.id}"/>
            </h:column>

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.person_firstname}" />
                </f:facet> 
                <h:outputText id="oTxtName" value ="#{person.firstname}"/>
            </h:column>

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.person_lastname}" />
                </f:facet>  
                <h:outputText id="oTxtLastname" value ="#{person.lastname}"/>

            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.person_totalMovie}" />
                </f:facet>  
                <h:outputText id="oTxtCountMovie" value ="#{person.countMovie()}"/>

            </h:column>

        </h:dataTable>
        <h:commandButton action="createCustomer" value="#{msg.customer_list_add}" styleClass="btn btn-info"/>
    </h:form>


</f:view>

<jsp:include page="/includes/footer.jsp" />
