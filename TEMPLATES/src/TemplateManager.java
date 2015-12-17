package co.edu.eafit.core.application.model.manager;


import co.edu.eafit.core.application.bo.Maestro;
import co.edu.eafit.core.application.bo.Tabla;
import co.edu.eafit.core.application.model.dao.IMaestroDAO;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;


public class MaestroManager implements IMaestroManager {
    
    private IMaestroDAO dao;
    
    public MaestroManager() {
        super();
    }

    @Override
    public List<Maestro> listarMaestros(String codeApp, boolean cargarRegistros) throws Exception {
        if( StringUtils.isBlank( codeApp )){
            throw new Exception("Se debe especificar el código de la aplicación de la que se desean consultar los maestros");
        }
        
        List <Maestro> maestros = dao.listarMaestros( codeApp );
        
        if( cargarRegistros ){
            for( Maestro mae: maestros ){
                List<Tabla> tablas = listarTablas( mae.getCodigo() );
                mae.setRegistros( tablas );
            }
        }
        
        return maestros;
    }

    @Override
    public Maestro findById(String id) throws Exception {
        return null;
    }

    @Override
    public void guardarMaestro(Maestro maestro) throws Exception {
        if( StringUtils.isBlank( maestro.getDescripcion() )){
            throw new Exception("Se debe especificar la descripción del maestro");
        }  
        
        if( StringUtils.isBlank( maestro.getCodigoAplicacion() )){
            throw new Exception("Se debe especificar el código de la aplicación del maestro");
        }  
        
        if( StringUtils.isBlank( maestro.getEditable() )){
            throw new Exception("Se debe especificar si el maestro es o no editable");
        }  
        
        if( StringUtils.isBlank( maestro.getNombre() )){
            throw new Exception("Se debe especificar el nombre del maestro");
        }  
        
        if( StringUtils.isBlank( maestro.getCodigo() )){
            throw new Exception("Se debe especificar el código del maestro");
        }  
        
        if( StringUtils.isBlank( maestro.getEstado() )){
            throw new Exception("Se debe especificar el estado del maestro");
        }  
        
        dao.guardarGenerico( maestro );        
    }

    @Override
    public void eliminarMaestro(Maestro maestro) throws Exception {
    }

    @Override
    public List<Tabla> listarTablas(String maestroCodigo) throws Exception {
        return dao.listarTablas( maestroCodigo );
    }
    
    @Override
    public List<Tabla> listarTablasTodos(String maestroCodigo) throws Exception {
        return dao.listarTablasTodos( maestroCodigo );
    }

    @Override
    public List<Tabla> findyByMaestroNombre(String maestroNombre) throws Exception {
        return dao.findyByMaestroNombre(maestroNombre);
    }
    
    public  <T extends Tabla> List<T> findByMaestroCodigoGenerics(Class<T> clazz) throws Exception{
        return dao.findByMaestroCodigoGenerics(clazz);    
    }

    @Override
    public List<Tabla> findyByMaestroNombre(String maestroNombre, String orden) throws Exception {
        return Collections.emptyList();
    }

    @Override
    public Tabla findById(Long codigoTabla) throws Exception {
        return null;
    }

    @Override
    public void guardarTabla(Tabla tabla) throws Exception {
        if( StringUtils.isBlank( tabla.getDescripcion() )){
            throw new Exception("Se debe especificar la descripción de la tabla");
        }
        if( StringUtils.isBlank( tabla.getEstado() )){
            throw new Exception("Se debe especificar el estado de la tabla");
        }
        if( StringUtils.isBlank( tabla.getIp() )){
            throw new Exception("Se debe especificar la ip de de la tabla");
        }
        if( StringUtils.isBlank( tabla.getMaestroCodigo() )){
            throw new Exception("Se debe especificar el código del maestro de la tabla");
        }
        if( StringUtils.isBlank( tabla.getNumDcto() )){
            throw new Exception("Se debe especificar el número de documento de la persona");
        }
        if( StringUtils.isBlank( tabla.getTipoDcto() )){
            throw new Exception("Se debe especificar el tipo de documento de la persona");
        }
        
        //El código alterno no se valida porque si no se ingresa, en base de datos se llena mediante un trigger
        
        if( tabla.getCodigo() == null || tabla.getCodigo() == 0){
            Long nextId = dao.getNextIdTabla();
            tabla.setCodigo(nextId );
        }
        
        tabla.setFechaActualizacion( Calendar.getInstance().getTime() );
        
        dao.guardarGenerico( tabla );
    }

    @Override
    public void eliminarTabla(Tabla tabla) throws Exception {
        if(  tabla.getCodigo() == null || tabla.getCodigo() == 0){
            throw new Exception("Se debe especificar el código de la tabla que se desea eliminar");
        }
        
        dao.eliminarGenerico( tabla );
    }

    @Override
    public Tabla findByIdAlterno(String codigoMaestro, String codigoAlterno) throws Exception {
        return null;
    }

    public void setDao(IMaestroDAO dao) {
        this.dao = dao;
    }

    public IMaestroDAO getDao() {
        return dao;
    }
}
