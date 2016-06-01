<%--
    Document   : index
    Created on : May 18, 2016, 4:16:54 PM
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
        <link href="css/input.css" rel='stylesheet' type='text/css'>
        <!-- AngularJS-->
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
        <script type="text/javascript" src="app/data.js"></script>
        <script type="text/javascript" src="app/ang-index.js"></script>
    </head>

    <body id="page-top">
        <script>
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '1794743724110234',
      xfbml      : true,
      version    : 'v2.6'
    });
  };

  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));
        </script>
        <!-- Navigation Bar -->
        <nav class="navbar navbar-default navbar-fixed-top navbar-static-top">
            <jsp:include page="common/headerNav.jsp"></jsp:include>
        </nav>

        <!-- Header -->
        <header class="maincolored text-center">
            <canvas id="canvas"></canvas>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <img  class="img-responsive logo" src="img/qutan.svg" alt="">
                        <div class="intro-text text-center">
                            <h4 class="name">Hello Pelicans</h4>
                            <hr class="star-light">
                            <h5 class="skills">Donors - Acceptors - Volunteer</h5>
                            <div
                                class="fb-like"
                                data-share="true"
                                data-width="450"
                                data-show-faces="true">
                            </div>
                            <a href="#services" class="page-scroll btn btn-xl"></a>
                            <a href="#about" class="btn btn-tear page-scroll">
                                <i class="fa fa-angle-double-down animated"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- Services Section -->
    <services></services>
    <!-- Portfolio Grid Section -->
    <picture-modals></picture-modals>


    <!--Button-test-->
    <section id="section-4" class="section-4">
        <button type="button" class="btn button button-drop">
            <a href="" data-placement="top" title="" data-original-title="TestButton">
                <span class="text">here pls!</span>
            </a>
        </button>
    </section>

    <!-- Timeline Section -->
    <timeline-steps></timeline-steps>

    <!-- About Section -->
    <section class="maincolored" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>About</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-lg-offset-2">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!</p>
                </div>
                <div class="col-lg-4">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!</p>
                </div>
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <a href="#" class="btn btn-lg btn-outline">
                        <i class="fa fa-download"></i> Do something
                    </a>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Section -->
    <send-message></send-message>

    <!-- Team Section -->
    <team-members></team-members>

    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-above">
            <div class="container">
                <div class="row">
                    <div class="footer-col col-md-4">
                        <h3>Location</h3>
                        <p>1234 Buckingham Palace<br>London, United Kingdoms </p>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>Around the Web</h3>
                        <social-links></social-links>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>About Us</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; 2016 DonorProject, Baku |  All Rights Reserved
                    </div>
                </div>
            </div>
        </div>
    </footer>


    <jsp:include page="common/bottomJs.jsp" />
    <script src="js/input.js"></script>
    <!--for beautiful scrolling with navigation-->
    <script src="js/scrollNav.js"></script>
    <!--specific for main page-->
    <script src="js/mainpage.js"></script>
    <script src="js/canvas.js"></script>
</body>

</html>

