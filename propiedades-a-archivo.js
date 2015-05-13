/*Funcionalidad que retorna los getters publicos de una clase pasada como parametro*/
var fs = require('fs'), beanutils = require( './bean-utils.js' );
var args = process.argv.slice(2);

//Se le debe especificar el nombre del archivo de entrada
//console.log('args'+args[0]);


//var nombreArchivo = 'input/Aspirante.java'
//var nombreArchivo = 'input/Maestro.java'
//var nombreArchivo = 'input/Cliente.java'
var nombreArchivo = args[0];

//console.log( args.length );
var archivoSalida ='salida.json';
if(  args.length > 1 ){
    archivoSalida = args[1];
}

if( nombreArchivo ){
    console.log('Va a consultar el archivo '+args+' Para escribirlo en '+archivoSalida);
    var contenido = beanutils.obtenerPropiedades(nombreArchivo, true);
    //console.log(contenido);
    console.log('Ahora e escribir en: '+archivoSalida);

    fs.writeFile( './'+archivoSalida, JSON.stringify(contenido), function (err) {
        if (err) throw err;
        console.log('El resulstado fue fuardado en '+archivoSalida);
    });
}else{
    console.log('No se especificó el archivo a leer')    
}

/*
fs.writeFile(archivoSalida, contenido, function(err) {
    console.log('Error escribiendo: '+err)
  if (err) throw err;
});*/

//console.log( )