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
    <h1><span class="glyphicon glyphicon-home"></span>&nbsp; <h:outputText value="#{msg.personDetail_pageTitle}"/></h1>


    <span style='font-weight:bold;'><h:outputText id="t1" value ="#{msg.person_id}:"/></span>
    <h:outputText id="o1" value ="#{PersonDetailBean.person.id}"/><br/>
    <span style='font-weight:bold;'><h:outputText id="t2" value ="#{msg.person_firstname}:"/></span>
    <h:outputText id="o2" value ="#{PersonDetailBean.person.firstname}"/><br/>
    <span style='font-weight:bold;'><h:outputText id="t3" value ="#{msg.person_lastname}:"/></span>
    <h:outputText id="o3" value ="#{PersonDetailBean.person.lastname}"/><br/>
</f:view>
