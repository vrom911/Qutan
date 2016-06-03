<%--
    Document   : announcement
    Created on : Jun 1, 2016, 4:26:49 PM
    Author     : vrom911
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" ng-app="project">
    <head>
        <title>Qutan</title>
        <!--common part of head for all pages-->
        <jsp:include page="common/head.jsp" />
        <!-- Main CSS -->
        <link href="css/main.css" rel="stylesheet">
        <link href="css/aside.css" rel="stylesheet">
        <link href="css/input.css" rel="stylesheet">
    </head>

<body id="page-top" class="index">
    <jsp:include page="common/verticalProfileMenu.jsp" />
    <div class="container-asidemenu">
        <div class="row">
            <nav class="navbar navbar-default success navbar-static-top">
                <jsp:include page="common/headerNav.jsp" />
            </nav>
        </div>

        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                <%
                    if(!request.getParameter("an").isEmpty() && request.getParameter("an")!= null){
                        int announcementId = Integer.parseInt(request.getParameter("an"));
                        %>


                <% } %>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="common/bottomJs.jsp" />

    <!-- Custom Theme JavaScript -->
    <script src="js/asidemenu.js"></script>
    <script src="js/asidemenustart.js"></script>
</body>
</html>
