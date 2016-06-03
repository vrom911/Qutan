var cbpAnimatedHeader = (function () {
    var docElem = document.documentElement,
            header = $(".navbar-fixed-top"),
            didScroll = false,
            changeHeaderOn = 300;
    console.log(docElem);
    function init() {
        $(window).scroll(function () {
            if (!didScroll) {
                didScroll = true;
                setTimeout(scrollPage, 250);
            }
        });
    }
    function scrollPage() {
        var sy = scrollY();
        if (sy >= changeHeaderOn) {
            header.addClass("navbar-shrink");
        } else {
            header.removeClass("navbar-shrink");
        }
        didScroll = false;
    }
    function scrollY() {
        return window.pageYOffset || docElem.scrollTop;
    }
    init();
})();