var mu = require('mu2')
, fs = require('fs');

/*
POR ALGUNA RAZÓN NO ESTÁ GENERANDO BIEN EL ARCHIVO
CUANDO SE INVOCA DESDE ACÁ:

POR ESO MEJOR SEGUÍ USANDO HANDLEBARS
*/

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
        
        var datos = JSON.parse(fs.readFileSync('datos.json', 'utf8'));
    
        //var cosa = global.__dirname;
        //TODO: QUITAR LA CACHE
        mu.clearCache();
        //var currentPath = './';
        var currentPath = 'C:/Users/dmonto20/Documents/GitHub/fabrica-Software-JSF-Node/';
        mu.root = currentPath;

        var stream = mu.compileAndRender('./'+templateFileName , datos );
        
        
        var writable = fs.createWriteStream( destFile );
        
        /*var path = require('path');
        var execPath = path.dirname( process.execPath );

        console.log(execPath);*/
        
        stream.pipe(writable);
    }catch( e ) {
        console.log(e);
    }
}

//Acá van los métodos que se pueden exportar (Los públicos)
//module.exports = {
    /*
    @param
    output_dir: Directorio de salida
    pageName: nombre de las páginas
    datos:
    */
    generarArchivo=function( outputDir, pageName, datos ){
        //debugger;
        console.log('Va a generar el archivo');
        /*
        IMPLEMENTADO CON MUSTACHE MU
        */
        //Lee el archivo de configuración json
        var obj = datos;
        
        var dirSalida = 'out-'+outputDir;

        //Crea la carpeta de salida
        if (!fs.existsSync(dirSalida)){
            fs.mkdirSync(dirSalida);
        }

        //Genera el archivo de Acceso
        //renderFile( 'maestroTemplate.jsf', dirSalida+'/'+pageName+'.xhtml', datos );

        //GEnera el archivo de contenido
        renderFile( 'maestroTemplateC.jsf' , dirSalida+'/'+pageName+'C.xhtml', datos );
    }
//}