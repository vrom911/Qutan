<%--
    Document   : login
    Created on : May 18, 2016, 12:05:24 PM
    Author     : vrom911
--%>

<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Qutan</title>
        <!--common part of head for all pages-->
        <jsp:include page="common/head.jsp" />

        <link href="css/login.css" rel="stylesheet">
        <link href="css/input.css" rel="stylesheet">
    </head>
    <body>
        <section class="content-fluid login text-center">
            <div class="row">
                <nav class="nav  navbar-fixed-top col-md-12 menu">
                    <ul class=" nav nav-tabs  center-pills menu_list">
                        <li class="white menu_item"><a href="#signup" id="signup" class="menu_link" data-toggle=tab>Sign Up</a></li>
                        <li class="red menu_item active"><a href="#login" id="login" class="menu_link link-login" data-toggle=tab>Log In</a></li>
                    </ul>
                </nav>
            </div>

            <div class="row login-content splitlayout"id="splitlayout">

                <div class="intro">
                    <div class="maincolored side side-left left col-md-6 ">
                        <div class="intro-content">
                            <div class="profile"><img src="img/profile1.jpg" alt="profile1"></div>
                                <h1>Sign Up<h1>
                                <hr>
                                <h2><span>right now</span></h2>
                            </div>
                        <div class="overlay"></div>
                    </div>
                    <div class="side side-right right col-md-6">
                        <div class="intro-content">
                            <div class="profile maincolored"><img src="img/profile2.jpg" alt="profile2"></div>
                            <h1>Log in<h1>
                            <hr>
                            <h2><span>right now</span></h2>
                        </div>
                        <div class="overlay"></div>
                    </div>
                </div><!-- /intro -->
                <div class="page page-right" >
                    <div class="page-inner">
                        <div class="col-md-8 col-lg-8 col-md-offset-1 col-lg-offset-1 tab-pane fade in active right" id="login">
                            <img src="img/flat-avatar.png" class="user-avatar" alt="Temp Avatar" />
                            <form role="form" action="login" ng-submit="submit()" method="POST">
                                <%
                                    Map<String, String> login = new LinkedHashMap<>();
                                    login.put("Username", "username");
                                    login.put("Password", "pwd");
                                %>
                                <% for (Map.Entry<String, String> entry : login.entrySet()) {%>
                                <div class="input input-right form-group">
                                    <input class="input_field " name="<%out.print(entry.getValue());%>"
                                            id="<%out.print(entry.getValue());%>"
                                           <% if (entry.getValue() != "pwd") { %>
                                           type="text" value="${username}"
                                           <% } else { %>
                                           type="password" <%}%>
                                           required />
                                    <label class="input_label" for="<%out.print(entry.getValue());%>">
                                        <span class="input_label-content"><%out.print(entry.getKey());%></span>
                                    </label>
                                    <svg class="graphic" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
                                    <path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
                                    </svg>
                                </div>
                                <%   }
                                %>
                                <button type="submit" class="btn btn-outline btn-lg btn-rounded">Login</button>
                            </form>
                        </div>
                    </div><!-- /page-inner -->
                </div><!-- /page-right -->
                <div class="page page-left" >
                    <div class="page-inner">
                        <div class="col-md-8 col-lg-8 col-md-offset-1 col-lg-offset-1 tab-pane fade in active left" id="signup">
                            <img src="img/flat-avatar.png" class="user-avatar" alt="Temp Avatar"/>
                            <form role="form" action="signUpServlet" ng-submit="submit()" method="POST">
                                <%
                                    Map<String, String> signup = new LinkedHashMap<>();
                                    signup.put("Username", "username");
                                    signup.put("E-mail", "email");
                                    signup.put("Password", "pwd");
                                    signup.put("Reenter password", "repwd");
                                    signup.put("First name", "name");
                                    signup.put("Surname", "surname");
                                    signup.put("First name", "name");
                                    signup.put("E-mail", "email");
                                    signup.put("Phone", "phone");
                                %>
                                <% for (Map.Entry<String, String> entry : signup.entrySet()) {%>
                                <div class="input input-left form-group">
                                    <input
                                        <% if (entry.getValue() == "pwd" || entry.getValue() == "repwd") { %>
                                        type="password"
                                        <%} else {
                                            if (entry.getValue() == "username"){%> value="${username}"<%}
                                            else if (entry.getValue() == "name"){%> value="${name}"<%}
                                            else if (entry.getValue() == "surname"){%> value="${surname}"<%}
                                            else if (entry.getValue() == "phone"){%> value="${phone}"<%}
                                            }%>
                                        class="input_field " name="<%out.print(entry.getValue());%>" id="<%out.print(entry.getValue());%>" />
                                    <label class="input_label" for="<%out.print(entry.getValue());%>">
                                        <span class="input_label-content"><%out.print(entry.getKey());%></span>
                                    </label>
                                    <svg class="graphic" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
                                    <path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
                                    </svg>
                                </div>
                                <%   }
                                %>
                                <button type="submit" class="btn btn-rounded">Sign Up</button>
                            </form>
                        </div>
                    </div><!-- /page-inner -->
                </div><!-- /page-left -->

                <a href="#" class="back back-right" title="back to intro">&rarr;</a>
                <a href="#" class="back back-left" title="back to intro">&larr;</a>
            </div>

        </section>
        <jsp:include page="common/bottomJs.jsp" />

        <script src="js/splitDivs.js"></script>
        <script src="js/menu-tab.js"></script>
        <script src="js/input.js"></script>
    </body>
</html>