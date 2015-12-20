<%-- 
    Document   : personList
    Created on : 17 déc. 2015, 09:57:30
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/navbar.jsp" />

<!-- En-tête liste de personne -->
<f:view>
    <h1><span class="glyphicon glyphicon-home"></span> &nbsp; <h:outputText value="#{msg.personList_pageTitle}"/></h1>

    <!-- Tableau liste de personne-->
    <h:form id="frmPeopleList">
        <h:dataTable id="dtCustomers" var="person" value="#{peopleBean.people}" styleClass="table">

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
        <h:commandButton action="createCustomer" value="#{msg.customer_list_add}" styleClass="btn btn-info"/>
    </h:form>



    <!-- En-tête liste de films -->

    <h1><span class="glyphicon glyphicon-home"></span> <h:outputText value="#{msg.movieList_pageTitle}"/></h1>


    <!-- Tableau liste de films-->

    <h:form id="frmMovieList">
        <h:dataTable id="dtMovies" var="movie" value="#{moviesBean.movie}" styleClass="table">

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
                <h:commandLink action="#{movieDetailBean.showMovie(movie)}" value="#{msg.action_detail}"  styleClass="btn btn-xs btn-info" ></h:commandLink>
            </h:column>

        </h:dataTable>
        <h:commandButton action="createCustomer" value="#{msg.customer_list_add}" styleClass="btn btn-info"/>
    </h:form>

</f:view>

<jsp:include page="/includes/footer.jsp" />
