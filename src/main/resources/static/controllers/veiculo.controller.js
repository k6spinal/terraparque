app.controller('VeiculoController', function ($scope, $http) {

    console.log("VeiculoController carregado");

    $scope.veiculo = {};
    $scope.veiculos = [];
    
$scope.listar = function () {
    console.log("Chamando GET veiculos");
    $http.get('/api/veiculo')
        .then(function (response) {
            $scope.veiculos = response.data;
        }, function (error) {
            console.error('Erro ao listar os veiculos', error);
        });
};

    $scope.salvar = function () {
        console.log('Cliquei em salvar');
        $http.post('/api/veiculo', $scope.veiculo)
            .then(function () {
                $scope.veiculo = {};
                $scope.listar();
            });
    };

    $scope.listar();
});