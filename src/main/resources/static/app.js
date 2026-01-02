var app = angular.module('appCadastro', []);

app.controller('ClienteController', function ($scope, $http) {

    $scope.cliente = {};
    $scope.clientes = [];

    $scope.listar = function () {
        $http.get('/api/clientes')
            .then(function (response) {
                $scope.clientes = response.data;
            });
    };

    $scope.salvar = function () {
        $http.post('/api/clientes', $scope.cliente)
            .then(function () {
                $scope.cliente = {};
                $scope.listar();
            });
    };

    $scope.listar();
});
