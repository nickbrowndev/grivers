jQuery(document).ready(function () {
    jQuery("#showMoreNews").click(function () {
        //jQuery("#recentNews").load( "news/olderNews" );
        $.get("news/olderNews", function (data) {
            $("#recentNews").append(data);
        });
    });
});