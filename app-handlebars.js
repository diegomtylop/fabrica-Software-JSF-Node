var hb = require('handlebars')
, fs = require('fs');

/*
IMPLEMENTADO CON HANDLEBARS
*/

var dir_output = 'out-handlebars';
//TODO: PENDIENTE Eliminar el directorio de salida
//Crea el directorio
fs.mkdirSync(dir_output);

//Genera el archivo de Acceso
renderFile( 'maestroTemplate.jsf', dir_output+'/resTemplate.xhtml', 'datos.json' );

//GEnera el archivo de contenido
renderFile( 'maestroTemplateC.jsf' , dir_output+'/resTemplateC.xhtml', 'datos.json' );



/**
Función que genera los archivos de acuerdo a una plantilla y a unos datos
@param templateFileName Nombre del archivo de plantilla
@param destFile Nombre del archivo de salida
@para variables Objeto con las variables
**/
function renderFile( templateFileName, destFile, datosFileName){
    var datos = JSON.parse(fs.readFileSync(datosFileName , 'utf8'));
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
}

