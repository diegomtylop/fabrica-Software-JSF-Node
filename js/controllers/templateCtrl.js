//Inyecta el servicio de handleBars
app.controller('templateCtrl', function($scope,$http,hbService) {
    
    //TODO: VER COMO PUEDO TMAR EL NOMBRE DE LA ENTIDAD DE MEJOR MANERA
    debugger;
    var url = window.location.href;
    var entityNamePar = url.substr( url.lastIndexOf('=')+1 );
    
    $http.get('./temp/'+entityNamePar+'.json').success(function(data) {
        $scope.propiedades = data;
    });
    
    //Es el mismo nombre de la clase pero con minuscula inicial
    var objectNamePar = entityNamePar.charAt( 0 ).toLowerCase()+entityNamePar.slice(1);
    
    //Configuración por defecto
    var configDefault = {
            entityName:entityNamePar,
            objectName:objectNamePar,
            directorio:"administracion",
            nombrePag:"admonContenidos",
            titulokey:"admonSistMetro.titulo",
            nombreBB:"moduloBB",
            conFiltros:true,
            filtros: [{ nombre: "Tipo de programa cursaro" },
                { nombre: "Programa académico cursado" },
                { nombre: "Linea de énfasis aprobada" }],
            eliminable:false,
            btnAdicionales:[{labelkey:"cambiarestado.lbl"},
                {labelkey:"opc.lbl"}],
            columnas:[
                {labelkey:"prog.ac.cur.lbl",propiedad:"progAcad"},
                {labelkey:"lin.enf.lbl",propiedad:"linea"},
                {labelkey:"prog.aca.des.lbl",propiedad:"progDest"},
                {labelkey:"estado.lbl",propiedad:"estado"}
            ]

    };
    
    //configuración para la generación de archivos
    $scope.config = configDefault;
    
    /*
    Función que toma únicamente las propiedades del Bean para las cuales se indicó
    que deben ser columnas de la tabla
    */
    $scope.changeColumnas = function(){
        //debugger;
        
        var prop = $scope.propiedades;
        
        //Filta las propiedades seleccionadas para mostrar en la tabla
        var colSelected = prop.filter( function( p){ return p.tabla });
        
        $scope.config.columnas = colSelected;
    }

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
    
    $scope.seleccionarEntidad = function(){
        debugger;
        
        //Asigna el nombre de la entidad actual
        configService.currentEntityName($scope.entityName);
    }
        
});