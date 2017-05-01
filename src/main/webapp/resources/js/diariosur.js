PrimeFaces.locales['es'] = {
    closeText: "Cerrar",
    prevText: "&#x3C;Ant",
    nextText: "Sig&#x3E;",
    currentText: "Hoy",
    monthNames: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"],
    monthNamesShort: ["ene", "feb", "mar", "abr", "may", "jun",
        "jul", "ago", "sep", "oct", "nov", "dic"],
    dayNames: ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"],
    dayNamesShort: ["dom", "lun", "mar", "mié", "jue", "vie", "sáb"],
    dayNamesMin: ["D", "L", "M", "X", "J", "V", "S"],
    weekHeader: "Sm",
    dateFormat: "dd/mm/yy",
    firstDay: 1,
    isRTL: false,
    showMonthAfterYear: false,
    yearSuffix: ""
};

$(document).ready(function () {
    $(".searchBox").hide();
    $("#tab2-main").hide();
    $("#search_form_calendar").hide();

    var $sidebar = $("#container-adLeft img"),
            $window = $(window),
            offset = $sidebar.offset(),
            topPadding = 10;

    $window.scroll(function () {
        if ($window.scrollTop() > offset.top) {
            $sidebar.stop().animate({
                marginTop: $window.scrollTop() - offset.top + topPadding
            });
        } else {
            $sidebar.stop().animate({
                marginTop: 0
            });
        }
    });
    /*
     $(window).scroll(function () {
     if ($(this).scrollTop() > 100) {
     $('.scrollToTop').fadeIn();
     } else {
     $('.scrollToTop').fadeOut();
     }
     });
     */
    $('.eventLists table').DataTable({
        'sPaginationType': 'full_numbers',
        'aLengthMenu': [[3, 6], [3, 6]],
        'iDisplayLength': 3,
        "bAutoWidth": true

    });
    //Click event to scroll to top
    $('.scrollToTop').click(function () {
        $('html, body').animate({scrollTop: 0}, 800);
        return false;
    });
    $(".iconSearchW").hover(function () {
        $(".searchBox").slideDown('fast');
    });
    $(".searchBox").mouseleave(function () {
        $(".searchBox").slideUp('fast');
    });
    $("#normalMenuIcon").click(function () {
        $("#header-option-icons").hide("slow");
        $("#myTopnav").show("slow");
    });
    $("#sidebarMenuIcon").click(function () {
        $("#header-option-icons").show("slow");
        $("#myTopnav").hide("slow");
    });
    $("#myTopnav").hover(function () {
        /* Stuff to do when the mouse enters the element */
    }, function () {
        $(this).hide("slow");
    });
    $("#tab2-header").click(function () {
        $("#search_form_options").hide('slow');
        $("#search_form_calendar").show('slow');
        $("#tab1-main").hide('slow');
        $("#tab2-main").show('slow');
    });
    $("#tab1-header").click(function () {
        $("#tab2-main").hide('slow');
        $("#search_form_options").show('slow');
        $("#search_form_calendar").hide('slow');
        $("#tab1-main").show('slow');
    });
    $(".eventListDesc").text(function (index, currentText) {
        return currentText.substring(0, 250).split(" ").slice(0, -1).join(" ") + "...";
    });
    $("[id='#{upload.clientId}']").change(function () {
        readPicture(this, $("[id='#{image.clientId}']"));
    });
});
