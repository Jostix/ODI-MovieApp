<%-- 
    Document   : navbar
    Created on : 17 déc. 2015, 10:00:09
    Author     : Romain Ducret <romain.ducret1@he-arc.ch>
--%>
<%@page import="java.io.File"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.Locale"%>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!-- Issue (17.12.2015) : Impossible d'utiliser les balises f:view, elles n'apparaissent pas lors d'un include depuis une autre page jsp.
    Impossible donc d'utiliser les fichiers properties pour nommer les menus...
-->

    <nav class="navbar navbar-default" style="margin-top:50px;">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="personList.jsp">Movie App</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <!--<li><a href="customerList.jsp">Link</a></li>
                    <li><a href="faces/createCustomer.jsp">Link</a></li>-->
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>