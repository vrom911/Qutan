<%--
    Document   : account
    Created on : May 18, 2016, 4:23:26 PM
    Author     : vrom911
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="en" ng-app="project">
    <head>
        <title>Qutan</title>
        <!--common part of head for all pages-->
        <jsp:include page="common/head.jsp" />
        <!-- Main CSS -->
        <link href="css/main.css" rel="stylesheet">
        <link href="css/aside.css" rel="stylesheet">
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
                        <div class="bs-component">
                            <div class="jumbotron">

                                <!-- start slipsum code -->
                                <%
                                <h2>We happy?</h2>
                                <p>The path of the righteous man is beset on all sides by the iniquities of the selfish and the tyranny of evil men. Blessed is he who, in the name of charity and good will, shepherds the weak through the valley of darkness, for he is truly his brother's keeper and the finder of lost children. And I will strike down upon thee with great vengeance and furious anger those who would attempt to poison and destroy My brothers. And you will know My name is the Lord when I lay My vengeance upon thee. </p>

                                <h2>I'm serious as a heart attack</h2>
                                <p>You see? It's curious. Ted did figure it out - time travel. And when we get back, we gonna tell everyone. How it's possible, how it's done, what the dangers are. But then why fifty years in the future when the spacecraft encounters a black hole does the computer call it an 'unknown entry event'? Why don't they know? If they don't know, that means we never told anyone. And if we never told anyone it means we never made it back. Hence we die down here. Just as a matter of deductive logic. </p>

                                <h2>Is she dead, yes or no?</h2>
                                <p>The path of the righteous man is beset on all sides by the iniquities of the selfish and the tyranny of evil men. Blessed is he who, in the name of charity and good will, shepherds the weak through the valley of darkness, for he is truly his brother's keeper and the finder of lost children. And I will strike down upon thee with great vengeance and furious anger those who would attempt to poison and destroy My brothers. And you will know My name is the Lord when I lay My vengeance upon thee. </p>

                                <h2>No man, I don't eat pork</h2>
                                <p>You see? It's curious. Ted did figure it out - time travel. And when we get back, we gonna tell everyone. How it's possible, how it's done, what the dangers are. But then why fifty years in the future when the spacecraft encounters a black hole does the computer call it an 'unknown entry event'? Why don't they know? If they don't know, that means we never told anyone. And if we never told anyone it means we never made it back. Hence we die down here. Just as a matter of deductive logic. </p>

                                <h2>I can do that</h2>
                                <p>You see? It's curious. Ted did figure it out - time travel. And when we get back, we gonna tell everyone. How it's possible, how it's done, what the dangers are. But then why fifty years in the future when the spacecraft encounters a black hole does the computer call it an 'unknown entry event'? Why don't they know? If they don't know, that means we never told anyone. And if we never told anyone it means we never made it back. Hence we die down here. Just as a matter of deductive logic. </p>

                                <h2>Are you ready for the truth?</h2>
                                <p>Yeah, I like animals better than people sometimes... Especially dogs. Dogs are the best. Every time you come home, they act like they haven't seen you in a year. And the good thing about dogs... is they got different dogs for different people. Like pit bulls. The dog of dogs. Pit bull can be the right man's best friend... or the wrong man's worst enemy. You going to give me a dog for a pet, give me a pit bull. Give me... Raoul. Right, Omar? Give me Raoul. </p>

                                <!-- end slipsum code -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <jsp:include page="common/bottomJs.jsp" />

        <!-- Custom Theme JavaScript -->
        <script src="js/asidemenu.js"></script>
        <script src="js/asidemenustart.js"></script>

    </body>

