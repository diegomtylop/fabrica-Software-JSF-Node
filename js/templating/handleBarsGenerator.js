var hb = require('handlebars')
, fs = require('fs'), path = require('path');


var execPath = path.dirname( process.execPath );

console.log(execPath);
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

//Acá van los métodos que se pueden exportar (Los públicos)
module.exports = {
    /*
    @param
    output_dir: Directorio de salida
    pageName: nombre de las páginas
    datos:
    */
    generarArchivo:function( outputDir, pageName, datos ){
        //debugger;
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

        //GEnera el archivo de contenido
        renderFile( 'maestroTemplateC.jsf' , dirSalida+'/'+pageName+'C.xhtml', datos );
    }
}