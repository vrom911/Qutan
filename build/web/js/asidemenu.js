$(document).ready(function() {

    function toggleNavbar(toggle, show, width, display) {
        $(".asidemenu button.navbar-toggle").each(function() {
            eval('$(this.getAttribute("data-target")).' + toggle + 'Class("asidemenu-small")'), $(".asidemenu.navbar").css("width", width + "px"), eval('$(".asidemenu .navbar-collapse").' + show + "()"), $(".container-asidemenu").css("margin-left", width + "px"), $(".asidemenu .navbar-brand").css("display", display);
        });
        if (toggle == 'add') { document.cookie = "asidemenu-type=collapsed"; } else { document.cookie = "asidemenu-type=expanded"; }
    }
    function get_cookie ( cookie_name )
    {
      var cookie_string = document.cookie ;
      if (cookie_string.length !== 0) {
        var cookie_value = cookie_string.match ( '(^|;)[\s]*' + cookie_name + '=([^;]*)' );
        if (cookie_value) {
            return decodeURIComponent ( cookie_value[2] ) ;  
        } else {
            return '';
        }
      }
      return '' ;
    }
    function windowResize() {
        $(".asidemenu button.navbar-toggle").each(window.innerWidth >= 992 ? function() {
            toggleNavbar("remove", "show", "227.656", "block");
        } : window.innerWidth >= 480 ? function() {
            toggleNavbar("add", "show", "53", "none");
        } : function() {
            toggleNavbar("remove", "hide", "0", "block");
        });
    }
    $(".asidemenu.navbar").css("height", "calc(" + $("body").css("height") + ")"),
    $(".asidemenu .dropdown>a").on("click", function(a) {
        a.stopPropagation(),
        $(this).parent("li.dropdown.open").length > 0 
        ? $(this).parent("li.dropdown").removeClass("open")
        : $(this).parents("li.dropdown").addClass("open"),
        $(this).parent("li.dropdown").find("li.dropdown").removeClass("open");
    }),
    $(".asidemenu").on("click", '.navbar-form [type="submit"]', function(a) {
        return 0 == $(".asidemenu-small").length ? !0 : void(0 == $(this).parents(".dropdown").length && (a.preventDefault(), toggleNavbar("remove", "show", 227.656, "block")))
    }), $(".asidemenu button.navbar-toggle").click(function(a) {
        $(".asidemenu li.dropdown").removeClass("open"),
        window.innerWidth >= 480 
        ? 0 === $(".navbar .asidemenu-small").length 
        ? toggleNavbar("add", "show", "53", "none") 
        : toggleNavbar("remove", "show", "227.656", "block") 
        : 0 === $(".navbar .asidemenu-small").length 
        ? toggleNavbar("add", "hide", "0", "block") 
        : toggleNavbar("remove", "show", "227.656", "block"),
        a.stopImmediatePropagation();
    });
    var asidemenuW = $(window).width();
    $(window).resize(function() {
        asidemenuW != $(window).width() && (windowResize(), asidemenuW = $(window).width());
    });
    //console.log(get_cookie('asidemenu-type'));
    if (get_cookie('asidemenu-type') === 'collapsed') {
        toggleNavbar("add", "show", "53", "none");
    } else {
        toggleNavbar("remove", "show", "227.656", "block");
    }
});