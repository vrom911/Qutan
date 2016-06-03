<%--
    Document   : newAnnouncement
    Created on : Jun 1, 2016, 2:59:01 PM
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
                    <!--<div class=" col-lg-6 left">-->
                        <form role="form" action="addAnnouncement" ng-submit="submit()" method="POST">
                            <fieldset class=" col-lg-6 left">
                            <legend> Add New Announcement</legend>
                            <input type="radio" name="person">
                            <label for="person">Person</label>
                            <div class="input input-right form-group">
                                <input type="number" name="donorAmount" value="${blood}" class="input_field " id="blood" required />
                                <label class="input_label" for="donorAmount">
                                    <span class="input_label-content">Donor Amount</span>
                                </label>
                                <svg class="graphic" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
                                <path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
                                </svg>
                            </div>
                            <div class="col-lg-12 text-center section-4">
                                <div id="success"></div>
                                <button type="submit" class="btn btn-success btn-lg btn-xl button button-drop" ng-disabled="sentMessage.$invalid"><span class="text">Send Message</span></button>
                            </div>
                            </fieldset>
                        </form>
                    <!--</div>-->
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