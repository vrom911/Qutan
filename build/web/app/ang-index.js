(function () {
        var app = angular.module("project", []);

//        app.controller('DashboardCtrl', function ($scope, $state) {
//                $scope.$state = $state;
//
//                $scope.menuItems = [];
//                angular.forEach($state.get(), function (item) {
//                        if (item.data && item.data.visible) {
//                                $scope.menuItems.push({name: item.name, text: item.data.text});
//                        }
//                });
//        });


//        app.directive("navigationBar", function () {
//                return {
//                        restrict: "E",
//                        templateUrl: "/templates/navbar-menu.html",
//                        controller: function () {
//
//                                this.navigation = navigation;
//                        },
//                        controllerAs: "navbar"
//                };
//        });
        app.directive("pictureModals", function() {
                return {
                        restrict: "E",
                        templateUrl: "app/templates/picture-modals.html",
                        controller: function() {
                                this.data = data;
                        },
                        controllerAs: "picmod"
                };
        });
        app.directive("services", function() {
                return {
                        restrict: "E",
                        templateUrl: "app/templates/services.html",
                        controller: function() {
                                console.log("service");
                                this.data = service;
                        },
                        controllerAs: "services"
                };
        });
        app.directive("sendMessage", function() {
                return {
                        restrict: "E",
                        templateUrl: "app/templates/send-message.html",
                        controller: function() {
                                this.submitForm = function(check) {
                                        if (check) {
                                                alert("Thanks for the message!");
                                        }

                                };
                        },
                        controllerAs: "form"
                };
        });
        app.directive("teamMembers", function() {
                return {
                        restrict: "E",
                        templateUrl: "app/templates/our-team.html",
                        controller: function() {

                                this.members = ourTeam;
                        },
                        controllerAs: "team"
                };
        });
        app.directive("timelineSteps", function() {
                return {
                        restrict: "E",
                        templateUrl: "app/templates/timeline.html",
                        controller: function() {

                                this.steps = steps;
                        },
                        controllerAs: "timeline"
                };
        });
        app.directive("socialLinks", function() {
                return {
                        restrict: "E",
                        templateUrl: "app/templates/social-links.html",
                        controller: function() {

                                this.slinks = slinks;
                        },
                        controllerAs: "sl"
                };
        });

})();