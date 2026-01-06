var app = angular.module('appCadastro', [
    'ngMaterial',
    'ngRoute'
]);

app.config(function ($routeProvider) {

    $routeProvider
        .when('/colaborador', {
            templateUrl: 'views/colaborador.html',
            controller: 'ColaboradorController'
        })
        .when('/saidaveiculo', {
            templateUrl: 'views/saidaveiculo.html',
            controller: 'SaidaVeiculoController'
        })
        .otherwise({
            redirectTo: '/saidaveiculo'
        });

});
