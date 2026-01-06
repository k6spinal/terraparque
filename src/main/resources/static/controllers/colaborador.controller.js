app.controller('ColaboradorController', function ($scope, $http) {

    console.log("ColaboradorController carregado");

    $scope.colaborador = {};
    $scope.colaboradores = [];
    
$scope.listar = function () {
    $http.get('/api/colaborador')
        .then(function (response) {
            $scope.colaboradores = response.data;
        }, function (error) {
            console.error('Erro ao listar colaboradores', error);
        });
};

    $scope.salvar = function () {
        console.log('Cliquei em salvar');
        $http.post('/api/colaborador', $scope.colaborador)
            .then(function () {
                $scope.colaborador = {};
                $scope.listar();
            });
    };

    $scope.listar();
});


