<%--
    Document   : verticalProfileMenu
    Created on : Jun 1, 2016, 1:37:09 PM
    Author     : vrom911
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="asidemenu navbar navbar-default success " role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#" style="display: block;"></a>
    </div>

    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav">
            <li>
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                        <button class="btn btn-default btn-aside" type="button"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>

                    </span>
                </div>
            </li>
            <li class="seperator"></li>
            <li>
                <a href="#1">
                    <span class="badge">4</span>
                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                    <span class="menu-description">Profile</span>
                </a>
            </li>

            <li class="dropdown">
                <a href="#2" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                    <span class="menu-description">Menu</span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#5">Simple Menu</a></li>
                    <li class="dropdown">
                        <a href="#6" class="dropdown-toggle" data-toggle="dropdown">
                            <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                            <span class="menu-description">Sub Menu</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Link 1</a></li>
                            <li class="dropdown">
                                <a href="#6" class="dropdown-toggle" data-toggle="dropdown">
                                    <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                                    <span class="menu-description">Even More</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Link 1</a></li>
                                    <li><a href="#">Link 2</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>

            <li class="active">
                <a href="#3">
                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                    <span class="menu-description">Active Link</span>
                </a>
            </li>

            <li class="disabled">
                <a href="#4">
                    <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                    <span class="menu-description">Disabled Link</span>
                </a>
            </li>
            <li class="seperator"></li>
            <li>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Username">
                        <input type="text" class="form-control" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-default btn-aside">Login</button>
                </form>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Email ID">
                    </div>
                    <button type="submit" class="btn btn-default btn-aside">Subscribe</button>
                </form>
            </li>
        </ul>
    </div>
</nav>
