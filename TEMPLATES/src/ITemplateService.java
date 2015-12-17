package co.edu.eafit.core.application.model.service;


import co.edu.eafit.core.application.bo.Maestro;
import co.edu.eafit.core.application.bo.Tabla;

import java.util.List;


public interface IMaestroService {
    
    //Métodos asociados a los maestros
    /**
     * Lista los maestros asociados a una aplicación
     * @param codeApp Código de la aplicación de la que se desea consultar los mestros
     * @param cargarRegistros booleano que indica si se deben consultar los registros asociados a cada maestro
     * @return una lista con los maestros de la aplicación
     * @throws Exception
     */
    public List<Maestro> listarMaestros( String codeApp, boolean cargarRegistros)throws Exception;
    
    /**
     * Consulta el maestro que tiene el id especificado
     * @param id
     * @return
     * @throws Exception
     */
    public Maestro findById(String id )throws Exception;
    
    /**
     * Guarda un maestro
     * @param maestro
     * @throws Exception
     */
    public void guardarMaestro( Maestro maestro )throws Exception;
    
    /**
     * Elimina un maestro
     * @param maestro
     * @throws Exception
     */
    public void eliminarMaestro( Maestro maestro )throws Exception;
    
    
    
    //Métodos asociados a las tablas
    /**
     * Lista los registros asociados a un maestro
     * @param maestroCodigo Código del maestro del que se desea listar las tablas
     * @return
     * @throws Exception
     */
    public List<Tabla> listarTablas( String maestroCodigo )throws Exception;
    
    /**
     * Lista los registros asociados a un maestro
     * @param maestroCodigo Código del maestro del que se desea listar las tablas
     * @return
     * @throws Exception
     */
    public List<Tabla> listarTablasTodos( String maestroCodigo )throws Exception;
    
    /**
     * Lista los registros asociados a un maestro
     * @param maestroNombre nombre del maestro por el cual se desea consultar los registros
     * @return
     * @throws Exception
     */
    public List<Tabla> findyByMaestroNombre( String maestroNombre )throws Exception;
    
    /**
     * Lista los registros asociados a un maestro y lo retorna del tipo que se le envíe como parámetro
     * @param <T>
     * @param clazz
     * @return
     * @throws Exception
     */
    public  <T extends Tabla> List<T> findByMaestroCodigoGenerics(Class<T> clazz) throws Exception;
    
    /**
     * Lista los registros asociados a un maestro
     * @param maestroNombre nombre del maestro del que se desean listar los registros
     * @param orden por el que se desean ordenados los registros
     * @return
     * @throws Exception
     */
    public List<Tabla> findyByMaestroNombre( String maestroNombre, String orden )throws Exception;
    
    /**
     * Consulta la información de una tabla
     * @param codigoTabla
     * @return
     * @throws Exception
     */
    public Tabla findById( Long codigoTabla)throws Exception;
    
    /**
     * Guarda una tabla
     * @param tabla
     * @throws Exception
     */
    public void guardarTabla( Tabla tabla )throws Exception;
    
    /**
     * Elimina una tabla
     * @param tabla
     * @throws Exception
     */
    public void eliminarTabla( Tabla tabla )throws Exception;
    
    /**
     * Busca una tabla por el código alterno
     * @param codigoMaestro
     * @param codigoAlterno
     * @return
     * @throws Exception
     */
    public Tabla findByIdAlterno( String codigoMaestro, String codigoAlterno)throws Exception;
}
