<%--
    Document   : headerNav
    Created on : May 26, 2016, 10:53:32 AM
    Author     : vrom911
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header page-scroll">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#nav-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar" ng-repeat="i in [0, 1, 2]"></span>
        </button>
        <a class="navbar-brand" href="#page-top">Qutan</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="nav-collapse">
        <ul class="nav navbar-nav">
            <li class="hidden">
                <a href="#page-top"></a>
            </li>

            <li class="page-scroll">
                <a href="#about" ><i class="fa fa-tint" aria-hidden="true"></i>About</a>
            </li>
            <li class="dropdown">
                <a href="#picture-modals" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tint" aria-hidden="true"></i>Donors <span class="caret"></span></a>
                <ul class="page-scroll dropdown-menu">
                    <li>
                        <a href="/intro">What is it about</a>
                    </li>
                    <li>
                        <a href="/mission">Our mission & vision</a>
                    </li>
                    <li>
                        <a href="/team">Who we are</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="/thanks">Thanks</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#acceptors"><i class="fa fa-tint" aria-hidden="true"></i>Acceptors</a>
            </li>
            <li>
                <a href="#faq"><i class="fa fa-tint" aria-hidden="true"></i>FAQ</a>
            </li>
            <li class="page-scroll">
                <a href="#contact"><i class="fa fa-tint" aria-hidden="true"></i>Contact</a>
            </li>
        </ul>
    </div>
    <!-- /.navbar-collapse -->
</div>
<!-- /.container-fluid -->
