package co.edu.eafit.{{appName}}.delegate.{{packageName}};


import co.edu.eafit.core.application.bo.Maestro;
import co.edu.eafit.core.application.bo.Tabla;
import co.edu.eafit.core.application.model.service.IMaestroService;
import co.edu.eafit.mediation.dto.security.Usuario;
import co.edu.eafit.mediation.services.ServiceLocator;

import java.util.List;

public class MaestroDelegate {
    
    private static MaestroDelegate singleton;
    private final String PERMISO_REQUERIDO = "ADM_MAN_MAESTROS";
    
    private IMaestroService service;
    
    public MaestroDelegate() {
        super();
        service = (IMaestroService)ServiceLocator.getInstance().getService("maestroService");
    }
    
    public static MaestroDelegate getInstance(){
        if( singleton == null ){
             singleton = new MaestroDelegate();
        }
        return singleton;
    }
    
    public List<Maestro> listarMaestros( String codeApp, boolean cargarRegistros ) throws Exception {
        return service.listarMaestros(codeApp, cargarRegistros);
    }

    public boolean tienePermisoVerPantalla(Usuario usuario) {
        return usuario.hasPermiso( PERMISO_REQUERIDO );
    }

    public List<Tabla> listarTablasMaestro(Maestro maestro) throws Exception {
        return service.listarTablas( maestro.getCodigo().toString() );
    }
    
    public List<Tabla> listarTablasMaestroTodos(Maestro maestro) throws Exception {
        return service.listarTablasTodos( maestro.getCodigo().toString() );
    }

    public void guardarMaestro(Maestro maestro) throws Exception {
        service.guardarMaestro( maestro );
    }

    public void guardarTabla (Tabla tabla, String tipoDcto, String nroDcto, String ip) throws Exception {
        tabla.setTipoDcto(tipoDcto);
        tabla.setNumDcto(nroDcto );
        tabla.setIp(ip);
        service.guardarTabla(tabla);
    }

    public void borrarTabla(Tabla tabla) throws Exception {
        service.eliminarTabla( tabla );
    }
}
