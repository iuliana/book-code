$(function () {
    var stompClient = null;
    setConnected(false);
    var name = null;
    $('.chat').prop('disabled', true);

    $('#connection').click(function () {
        if($('#connection').val() == 'Connect') {
            //connecting
            var socket = new SockJS('/mirc');
            stompClient = Stomp.over(socket);
            stompClient.connect({}, function (frame) {
                setConnected(true);
                console.log('Connected: ' + frame);
                stompClient.subscribe('/topic/chat', function (message) {
                    showMessage(JSON.parse(message.body).content);
                });
                name = $('#name').val();
                stompClient.send('/app/mirc', {}, JSON.stringify({ 'name': name, 'content' : '' }));
            });
        } else {
            //disconnecting
            stompClient.disconnect();
            setConnected(false);
            console.log("Disconnected");
        }
    });

    $('#send').click(function(){
        var name = $('#name').val();
        var content = $('#content').val();
        stompClient.send('/app/mirc', {}, JSON.stringify({ 'name': name, 'content': content }));
        $('#content').val('');
    });

});

function setConnected(connected) {
    connected ? $('#connection').attr('value', 'Disconnect') :  $('#connection').attr('value', 'Connect');
    $('#name').prop('disabled', connected);
    connected ? $('.chatDiv').show() : $('.chatDiv').hide();
    connected ? $('.footer').show() : $('.footer').hide();
    $('.chat').html('');
}

function showMessage(message) {
    console.log('something weird ' + message) ;
    $('.chat').append(message + '&#xA;');
}