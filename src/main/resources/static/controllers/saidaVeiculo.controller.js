
app.controller('SaidaVeiculoController', function ($scope, $http, $mdMedia, $mdDialog) {

     $scope.$mdMedia = $mdMedia;

    console.log("SaidaVeiculoController carregado");

    $scope.saida = {};
    $scope.saidas = [];
    

    $scope.salvar = function () {
        $http.post('/api/saidaveiculos', $scope.saida)
            .then(function () {
                $scope.saida = {};
                $scope.saida.colaborador = {};
                $scope.saida.veiculos = {};
                $scope.listar();
            });
    };

    $scope.listar = function () {
        $http.get('/api/saidaveiculos')
            .then(function (response) {
                $scope.saidas = response.data;
            });
    };

    $scope.abrirDialogRetorno = function (saida) {
    $mdDialog.show({
        controller: DialogRetornoController,
        templateUrl: 'views/saidaVeiculoRetorno.html',
        parent: angular.element(document.body),
        clickOutsideToClose: true,
        locals: {
            saida: angular.copy(saida)
        }
    }).then(function () {
        $scope.listar();
    });
    };

    // =========================
    // LISTAR COLABORADORES
    // =========================
    $scope.listarColaboradores = function () {
        console.log("Chamando GET colaboradores");

        $http.get('/api/colaborador')
            .then(function (response) {
                console.log("Colaboradores recebidos:", response.data);
                $scope.colaboradores = response.data;
            }, function (error) {
                console.error("Erro ao buscar colaboradores", error);
            });
    };

    // =========================
    // LISTAR VEICULOS
    // =========================
    $scope.listarVeiculos = function () {
        console.log("Chamando GET veiculos");

        $http.get('/api/veiculo')
            .then(function (response) {
                console.log("Veiculos recebidos:", response.data);
                $scope.veiculos = response.data;
            }, function (error) {
                console.error("Erro ao buscar veiculos", error);
            });
    };

    // =========================
    // CHAMADA AUTOMÁTICA
    // =========================
    $scope.listarColaboradores();
    $scope.listar();
    $scope.listarVeiculos();

    });

    function DialogRetornoController($scope, $mdDialog, $http, saida) {

        console.log('DialogRetornoController carregado');

        $scope.saida = saida;

        // valor padrão
        $scope.saida.dataHoraRetorno = new Date();

        $scope.cancelar = function () {
            $mdDialog.cancel();
        };

        $scope.salvar = function () {
            $http.put('/api/saidaveiculos/retorno/' + $scope.saida.id, {
                dataHoraRetorno: $scope.saida.dataHoraRetorno,
                veiculoKmRetorno: $scope.saida.veiculoKmRetorno
            }).then(function () {
                $mdDialog.hide();
            });
        };
    }

    $scope.alerta = function () {
    alert('CONTROLLER ATIVO');
    };