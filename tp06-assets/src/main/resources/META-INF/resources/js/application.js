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
        type: 'post',
        url: '/api/evenements/delete',
        data: {idEvent: id},
        success: bootbox.hideAll()
    });
}