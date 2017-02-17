var angularApp = angular.module('tp06', ['ui.calendar', 'ngResource']);

angularApp.factory('EvenementsWS', ['$resource', function ($resource) {
    return $resource('api/evenements/:id', null,
        {
            'update': {method: 'PUT'}
        });
}]);

function effacerEvenement( id){
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: 'delete',
        url: '/api/evenements/delete/'+id,
        success: function(){
            bootbox.hideAll();
            location.reload(); // ok, ce n'est pas très propre mais je n'ai pas le temps de faire mieux.
        }
    });
}