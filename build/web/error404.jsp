<%--
    Document   : error_404
    Created on : May 2, 2016, 1:51:42 PM
    Author     : vrom911
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>404 Page not found</title>
        <!--common part of head for all pages-->
        <jsp:include page="common/head.jsp" />

        <!-- Main CSS -->
        <link href="css/main.css" rel="stylesheet">
    </head>
    <body>
        <div class="maincolored text-center canvas-block" id="canvas-block" style="width:100%; height: 100vh;">
            <canvas id="canvas"></canvas>
            <section class="container white-letter">
                <div class="row">
                    <div class="col-lg-12">
                        <a href="index.jsp"><img  class="img-responsive logo" src="img/qutan.svg" alt=""></a>
                        <h1>404</h1>
                        <h2> Sorry, page can not be found..</h2>
                        <hr class="star-light">
                        <h3 class="skills">Back to main page</h3>
                        <a href="index.jsp" class="btn btn-tear page-scroll">

                        </a>

                    </div>
                </div>
            </section>
        </div>
        <jsp:include page="common/bottomJs.jsp" />
        <!--specific for main page-->
        <script src="js/canvas.js"></script>
    </body>
</html>
