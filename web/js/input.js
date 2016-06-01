$(document).ready( function() {
    // trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
    $(".input-left").find("input").bind('focus', function () {
        $(this).css('background-color', 'white !important');
    });
    if (!String.prototype.trim) {
        (function () {
            // Make sure we trim BOM and NBSP
            var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
            String.prototype.trim = function () {
                return this.replace(rtrim, '');
            };
        })();
    }
    $(".input_field").each(function() {
        if ($(this).val().trim() !== ''){
        $(this).parent().addClass("input-filled");
    }
    });
    $(".input_field").on("focus", function() {
       $(this).parent().addClass("input-filled");
    });
    $(".input_field").on("blur", function() {
        if($(this).val().trim() === ""){
       $(this).parent().removeClass("input-filled");}
    });
});
