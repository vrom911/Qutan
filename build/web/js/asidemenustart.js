$(document).ready(function () {
        $('body').css('display', 'block');
        $('#changeNavbarClass').on('click', function () {
                if ($('.navbar-default').length > 0) {
                        $('.navbar').removeClass('navbar-default');
                        $('.navbar').addClass('navbar-inverse');
                } else {
                        $('.navbar').removeClass('navbar-inverse');
                        $('.navbar').addClass('navbar-default');
                }
        });

        $('#togglePosition').on('click', function () {
                if ($('.asidemenu-fixed').length > 0) {
                        $('.navbar').removeClass('asidemenu-fixed');
                } else {
                        $('.navbar').addClass('asidemenu-fixed');
                }
        });
});

