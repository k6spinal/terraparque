app.controller('DialogRetornoController',
    function ($scope, $mdDialog, $http, saida) {

        $scope.saida = saida;

        // valor padrão
        if (!$scope.saida.dataHoraRetorno) {
            $scope.saida.dataHoraRetorno = new Date();
        }

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
);