<%-- 
    Document   : personDetail
    Created on : 20 déc. 2015, 01:00:00
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
    <h1><span class="glyphicon glyphicon-bookmark"></span>&nbsp; <h:outputText value="#{msg.movieDetail_pageTitle}"/></h1>


    <span style='font-weight:bold;'><h:outputText id="t1" value ="#{msg.movie_id}:"/></span>
    <h:outputText id="o1" value ="#{movieDetailBean.movie.id}"/><br/>
    <span style='font-weight:bold;'><h:outputText id="t2" value ="#{msg.movie_name}:"/></span>
    <h:outputText id="o2" value ="#{movieDetailBean.movie.name}"/><br/>
    <span style='font-weight:bold;'><h:outputText id="t3" value ="#{msg.movie_producer}:"/></span>
    <h:outputText id="o3" value ="#{movieDetailBean.movie.producer}"/><br/>

    <h1><span class="glyphicon glyphicon-th-list"></span>&nbsp; <h:outputText value="#{msg.movieDetail_personList}"/></h1>

    <h:form id="frmMovieList">
        <h:dataTable id="dtMovies" var="person" value="#{movieDetailBean.movie.listPeople}" styleClass="table">

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

            <h:column>
                <h:commandLink action="#{personDetailBean.showPerson(person)}" value="#{msg.action_detail}"  styleClass="btn btn-xs btn-info" ></h:commandLink>
            </h:column>

        </h:dataTable>
        <h:commandButton action="personList" value="#{msg.action_back}" styleClass="btn btn-info"/>
    </h:form>

</f:view>
