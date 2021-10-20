var app = angular.module('mainApp', ['ngRoute']);

app.config(['$routeProvider', function ($routeProvider) {
    console.log($routeProvider.when);
    $routeProvider
        .when('/index', {
            templateUrl: 'index.html'
        })
        .otherwise({
            redirectTo: 'index.html'
        })
}]);


app.run(function () {

});