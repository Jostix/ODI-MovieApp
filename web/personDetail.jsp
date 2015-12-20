<%-- 
    Document   : personDetail
    Created on : 17 déc. 2015, 14:13:39
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
    <h1><span class="glyphicon glyphicon-user"></span>&nbsp; <h:outputText value="#{msg.personDetail_pageTitle}"/></h1>


    <span style='font-weight:bold;'><h:outputText id="t1" value ="#{msg.person_id}:"/></span>
    <h:outputText id="o1" value ="#{PersonDetailBean.person.id}"/><br/>
    <span style='font-weight:bold;'><h:outputText id="t2" value ="#{msg.person_firstname}:"/></span>
    <h:outputText id="o2" value ="#{PersonDetailBean.person.firstname}"/><br/>
    <span style='font-weight:bold;'><h:outputText id="t3" value ="#{msg.person_lastname}:"/></span>
    <h:outputText id="o3" value ="#{PersonDetailBean.person.lastname}"/><br/>

    <h1><span class="glyphicon glyphicon-th-list"></span>&nbsp; <h:outputText value="#{msg.personDetail_movieList}"/></h1>

    <h:form id="frmMovieList">
        <h:dataTable id="dtMovies" var="movie" value="#{PersonDetailBean.movies}" styleClass="table">

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.movie_id}" />
                </f:facet>  
                <h:outputText id="oTxtNumber" value ="#{movie.id}"/>
            </h:column>

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.movie_name}" />
                </f:facet> 
                <h:outputText id="oTxtName" value ="#{movie.name}"/>
            </h:column>

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.movie_producer}" />
                </f:facet>  
                <h:outputText id="oTxtProducer" value ="#{movie.producer}"/>
            </h:column>

            <h:column>
                <f:facet name="header">
                    <h:outputText value="#{msg.movie_totalPeople}" />
                </f:facet>  
                <h:outputText id="oTxtCountPeople" value ="#{movie.countMovie()}"/>
            </h:column>

            <h:column>
                <h:commandLink action="#{PersonDetailBean.showPerson(person)}" value="#{msg.action_detail}"  styleClass="btn btn-xs btn-info" ></h:commandLink>
            </h:column>

        </h:dataTable>
        <h:commandButton action="personList" value="#{msg.action_back}" styleClass="btn btn-info"/>
    </h:form>

</f:view>
