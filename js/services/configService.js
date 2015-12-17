//Servicio para las configuraciones globales que son comunes a varias páginas
app.factory('configService', function() {
 var globalConfig = {}
 function setName(data) {
   globalConfig.entityName = data;
 }
 function get() {
  return globalConfig.entityName;
 }

 return {
  currentEntityName: setName,//Asigna el nombre de la entidad que se está mapeando
  getCurrentEntityName: get
 }
});