//Incluye los módulos de node js
var fs = require('fs');
var hb = require('handlebars')//Handle bars

/*
Servicio de angular encargado de la generación de los archivos
basado en los templates
*/
app.factory('hbService', function() {
    
    //Método privado
    function privado(){
        
    };
    
    /**
    Función que genera los archivos de acuerdo a una plantilla y a unos datos
    @param templateFileName Nombre del archivo de plantilla
    @param destFile Nombre del archivo de salida
    @para variables Objeto con las variables
    **/
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
            alert('generar archivo de handleBar Service');
            debugger;
            console.log('Va a generar el archivo');
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

            //Genera el archivo de Acceso
            //renderFile( 'maestroTemplate.jsf', dirSalida+'/'+pageName+'.xhtml', datos );

            //TODO: LA LISTA  DE ARCHIVOS DEBE SER CONFIGURABLE
            //GEnera el archivo de contenido
            renderFile( './TEMPLATES/maestroTemplateC.xhtml' , dirSalida+'/'+pageName+'C.xhtml', datos );
            
            
            //Genera el archivo de acceso
            renderFile( './TEMPLATES/maestroTemplate.xhtml' , dirSalida+'/'+pageName+'.xhtml', datos );
            
            
            //Genera el Backing Bean
            if (!fs.existsSync(dirSalida+'/src/')){
                fs.mkdirSync(dirSalida+'/src/');
            }
            
            var backingBeanClassName = datos.entityName;
            
            //TODO: ACÁ DEBE GENERAR LOS ARCHIVOS EN EL DIRECTORIO INDICADO POR EL NOMBRE DE LA APLICACIÓN
            
            renderFile( './TEMPLATES/src/TemplateBB.java' , dirSalida+'/src/'+backingBeanClassName+'BB.java', datos );
        }
    }
});