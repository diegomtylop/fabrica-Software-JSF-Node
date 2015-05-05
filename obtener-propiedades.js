/*Funcionalidad que retorna los getters publicos de una clase pasada como parametro*/
var fs = require('fs');


//var nombreArchivo = 'input/Aspirante.java'
//var nombreArchivo = 'input/Maestro.java'
var nombreArchivo = 'input/Cliente.java'

/*
    Retorna una lista con objetos que
    indican el tipo de dato y el nombre de la propiedad
    Por ejemplo
    [{tipoDato:'String',propiedad:'codigo'},{tipoDato:'Integer',propiedad:'valor'}]
*/
function obtenerPropiedades( nombreArchivo ){
    //Lee el archivo que se desea parsear
    var archivo = fs.readFileSync(nombreArchivo, 'utf8');

    //Expresión regular que consulta los getters
    var re = /public\W+\w+\W+get\w+\(\s*\)/g;
    
    var m;
    var contador = 0;
    //Variable que almacena los getters encontrados en la clase
    var getters = [];
    //Busca los getters de la clase
    do {
        m = re.exec(archivo);
        if (m) {
            //console.log( m[0] );
            getters.push( m[0]);
            contador++;
        }
    } while (m);
    console.log('Ocurrencias '+contador)
    console.log('Getters'+getters.length)
    
    propiedades = [];
    //Extrae los tipos de datos y las propieades a las que referencia
    getters.forEach( function(getter){
        tokens = getter.split(/\s/g);
        //console.log('tokens:'+tokens+" longitud "+tokens.length);

        //Toma el tipo de dato
        tipoDato = tokens[1];
        nombreGetter = tokens[2];
        propiedad = nombreGetter.slice(3, nombreGetter.indexOf("("));
        propiedad = propiedad.charAt(0).toLowerCase()+propiedad.slice(1);
        
        //console.log('tipoDato:'+tipoDato+" propiedad "+propiedad);
        
        proObject = {tipoDato:tipoDato,propiedad:propiedad};
        
        //console.log( proObject )
        
        propiedades.push( proObject );

    });
    return propiedades;
}


console.log( obtenerPropiedades(nombreArchivo))