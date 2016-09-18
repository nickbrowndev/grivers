$(document).ready(function () {
    $("#preview").click(function () {

        var newsContent = $('#content').val();

        var onSuccess = function (data, status, jqXHR) {
            $('#convertedMarkup').html(data);

        };

        $.ajax({

            url: $(this).data('url'),
            type: 'POST',
            //dataType: 'json',
            dataType: 'html',
            data: {content: newsContent},
            success: onSuccess,
            error: function (request, status, error) {
                alert("error: " + error)
            },
            complete: function () {
                //alert("complete!");
            }
        });
    });
});