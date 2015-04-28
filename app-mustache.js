var mu = require('mu2')
, fs = require('fs');


/*
IMPLEMENTADO CON MUSTACHE MU
*/
//Lee el archivo de configuración json
var obj = JSON.parse(fs.readFileSync('datos.json', 'utf8'));

mu.root = __dirname;

var dir_output = 'out-mustache';

//Crea la carpeta de salida
fs.mkdirSync(dir_output);

//Genera el archivo de Acceso
renderFile( 'maestroTemplate.jsf', dir_output+'/'+obj.nombrePag+'.xhtml', 'datos.json' );

//GEnera el archivo de contenido
renderFile( 'maestroTemplateC.jsf' , dir_output+'/'+obj.nombrePag+'C.xhtml', 'datos.json' );


/**
Función que genera los archivos de acuerdo a una plantilla y a unos datos
@param templateFileName Nombre del archivo de plantilla
@param destFile Nombre del archivo de salida
@para variables Objeto con las variables
**/
function renderFile( templateFileName, destFile, datosFileName){
    var datos = JSON.parse(fs.readFileSync(datosFileName , 'utf8'));
    var fileContenido = fs.readFileSync('./'+templateFileName, 'utf8');
    
    
    var stream = mu.compileAndRender(templateFileName , datos );
    
    var writable = fs.createWriteStream( destFile );
    
    stream.pipe(writable);
    /*var compilado = mu.compile('maestroTemplate.jsf',function(error){
        if(error){
         console.log('Errror compilando');   
        }
    })
    
    var renderizado = mu.render( compilado, obj );
    
    console.log( 'renderizado '+renderizado);*/
}


renderTemplateOLD = function(){
    
    var textoGenerado = '';
    mu.compileAndRender('maestroTemplate.jsf',obj)
    .on('data', function (data) {
        textoGenerado  += data.toString();
        console.log('textoGenerado interno '+textoGenerado+'\n\n');
        return textoGenerado;
    });
    console.log( 'Texto generado '+textoGenerado );
    
    console.log('Crea el directorio');
    
        fs.writeFile('resMustache.txt', textoGenerado, function(err){
            if( err ){
                return console.log(err)   ;
            }
            console.log('El archivo ha sido creado')
        });
    
    
}