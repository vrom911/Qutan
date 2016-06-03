
/**
*   Document   : menu-tab
*   Created on : April 18, 2016, 21:05:40 PM
*   Author     : vrom911
*/
$(document).ready(function () {
    location.href = "#login";
    $(".link-login").parent().addClass("menu_item-current");
});

    $("a[data-toggle=tab]").on("click", function () {
        location.href = this.href;
    });

    $(".menu_link").on("click", function () {
        var item = $(this).parent();
        if (item.hasClass("menu_item-current")) {
            return false;
        }
        $(".menu_item-current").removeClass("menu_item-current");
        item.addClass("menu_item-current");
    });

