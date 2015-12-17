//Servicio encargado de administrar la exracción de los accesosrs de una clase java
var hb = require('handlebars')
, fs = require('fs');

/*
Servicio de angular encargado de la generación de los archivos
basado en los templates
*/
app.factory('hbService', function() {
    
    //Método privado
    function renderFile( templateFileName, destFile, datos){
        //var datos = JSON.parse(fs.readFileSync(datosFileName , 'utf8'));
        try{
            debugger;

            //var datos = JSON.parse(fs.readFileSync('datos.json', 'utf8'));
            var fileContenido = fs.readFileSync('./'+templateFileName, 'utf8');

            var pageBuilder = hb.compile(fileContenido);
            var resultado = pageBuilder(datos);

            //console.log('Resultado:'+resultado);

            fs.writeFile(destFile,resultado, function(error){
                if( error ){
                    console.log('Error creando el archivo'+error)
                }
                console.log('Archivo generado: '+destFile);
            });
        }catch( e ) {
            console.log(e);
        }
    }
    
    //Métodos públicos
    return {
        generarArchivo:function( outputDir, pageName, datos ){
            //debugger;
            console.log('Va a generar el archivo ');
            /*
            IMPLEMENTADO CON MUSTACHE MU
            */
            //Lee el archivo de configuración json
            var obj = datos;

            var dirSalida = 'out-'+outputDir+'-hb';

            //Crea la carpeta de salida
            if (!fs.existsSync(dirSalida)){
                fs.mkdirSync(dirSalida);
            }
            
            console.log('Path del archivo '+dirSalida+' ' +pageName);

            //Genera el archivo de Acceso
            //renderFile( 'maestroTemplate.jsf', dirSalida+'/'+pageName+'.xhtml', datos );

            //GEnera el archivo de contenido
            renderFile( './TEMPLATES/maestroTemplateC.xhtml' , dirSalida+'/'+pageName+'C.xhtml', datos );
        }
    }
});