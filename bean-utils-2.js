/*
La diferencia de este y el otro es que
este no recibe el nobmre del archivo, sino el contenido del archivo como tal
*/

/*
    Retorna una lista con objetos que
    indican el tipo de dato y el nombre de la propiedad
    Por ejemplo
    [{tipoDato:'String',propiedad:'codigo'},{tipoDato:'Integer',propiedad:'valor'}]
*/
// exports 2 methods for other modules or files to use
obtenerPropiedades = function( contenidoArchivo, debug ){
  //Lee el archivo que se desea parsear
  console.log('DEBUG '+debug)
  if( debug ){
    console.log('ESTAMOS EN EL MODULO'+nombreArchivo);
  }
//var archivo = fs.readFileSync(nombreArchivo, 'utf8');
var archivo = contenidoArchivo;

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
if( debug ){
    console.log('Ocurrencias '+contador)
    console.log('Getters'+getters.length)
}

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