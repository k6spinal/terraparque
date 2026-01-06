
app.controller('SaidaVeiculoController', function ($scope, $http) {

    console.log("SaidaVeiculoController carregado");

    $scope.saida = {};
    $scope.saidas = [];

    $scope.salvar = function () {
        $http.post('/api/saidaveiculos', $scope.saida)
            .then(function () {
                $scope.saida = {};
                $scope.listar();
            });
    };

    $scope.listar = function () {
        $http.get('/api/saidaveiculos')
            .then(function (response) {
                $scope.saidas = response.data;
            });
    };

    $scope.listar();
});