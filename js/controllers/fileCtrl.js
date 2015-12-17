//Inyecta el servicio de handleBars
app.controller('fileCtrl', function($scope,$http,hbService) {
    
    $scope.dirSalida = 'temp';
    $scope.nombreClase;

    /*
    * Método invocado cuando se desea generar el archivo con los parametros especificados 
    * en la página de configuración
    */
    $scope.guardar = function(){
        debugger;
        
        //Toma las columnas para las cuales se indicó que se debían incluir como filtros
        var colFiltros = $scope.config.columnas;
        
        colFiltros = colFiltros.filter(function(p){return p.filtro});
        
        $scope.config.filtros = colFiltros;
        
        //Genera el archivo en el service pasandole los parametros de la página
        hbService.generarArchivo($scope.config.directorio,$scope.config.nombrePag, $scope.config );
    }
});