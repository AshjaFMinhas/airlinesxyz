$('#flyBtn').click(function(e) {
    e.preventDefault();

    $.get('#launchOptions'), function(data) {
        $('#content').html(data);
    };
});
