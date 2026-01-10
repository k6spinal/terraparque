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
        .when('/saidaveiculos', {
            templateUrl: 'views/saidaveiculo.html',
            controller: 'SaidaVeiculoController'
        })
        .when('/veiculo', {
            templateUrl: 'views/veiculo.html',
            controller: 'VeiculoController'
        })        
        .otherwise({
            redirectTo: '/saidaveiculos'
        });

});
