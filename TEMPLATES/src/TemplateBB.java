package co.edu.eafit.{{appName}}.controller.{{packageName}};


import co.edu.eafit.{{packageName}}.delegate.{{entityName}}Delegate;
import co.edu.eafit.core.application.bo.{{entityName}};

import co.edu.eafit.core.application.controller.ManagedBeanGeneral;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@ManagedBean
@SessionScoped
public class {{nombreBB}} extends ManagedBeanGeneral{
    
    //Delegado
    private {{entityName}}Delegate delegate;
    
    private {{entityName}} {{objectName}}Selected;
    
    private List<{{entityName}}> {{objectName}}s;
    
    private List estadosTablas;

    public {{nombreBB}}() {
        super();
        delegate = {{entityName}}Delegate.getInstance();
    }
    
    public String crear{{entityName}}(){
        try{
            delegate.guardar{{entityName}}( {{objectName}}Selected );
            addMessageLiteral(FacesMessage.SEVERITY_INFO, "{{entityName}} almacenado", "El {{objectName}} fue almacenado exitosamente");
        } catch (InternalException e) {
            addMessageLiteral( FacesMessage.SEVERITY_WARN,"Ocurrió un error almacenando el registro",  e.getExceptionInfo().getCause().getMessage() );
        } catch (Exception e) {
            addMessageLiteral( FacesMessage.SEVERITY_ERROR, "Ocurrió un error almacenando el registro", e.getMessage() );
        }
        return "";
    }
    
    public String guardar{{entityName}}(){
        try{
            delegate.guardar{{entityName}}( {{objectName}}Selected );
            addMessageLiteral(FacesMessage.SEVERITY_INFO, "{{entityName}} almacenado", "El {{objectName}} fue almacenado exitosamente");
        } catch (InternalException e) {
            addMessageLiteral( FacesMessage.SEVERITY_WARN,"Ocurrió un error almacenando el registro",  e.getExceptionInfo().getCause().getMessage() );
        } catch (Exception e) {
            addMessageLiteral( FacesMessage.SEVERITY_ERROR, "Ocurrió un error almacenando el registro", e.getMessage() );
        }
        return "";
    }
    
    /**
     * Método que pemite eliminar
     */
    public void eliminar{{entityName}}(){
        try {
            {{entityName}} aEliminar = grupoSelected;
        
            delegate.eliminar{{entityName}}( aEliminar );
            
            //consulta nuevamente los parametros con sus grupos
            this.gruposParametro = delegate.listarGrupoParametros( codeApp, true );
        } catch (Exception e) {
            addMessageKey( FacesMessage.SEVERITY_ERROR, e.getMessage() );
        }
        addMessageLiteral(FacesMessage.SEVERITY_INFO, "Grupo eliminado", "El grupo fue eliminado exitosamente");
    }
    

    public void setCodeApp(String codeApp) {
        this.codeApp = codeApp;
    }

    public String getCodeApp() {
        return codeApp;
    }

    public void set{{entityName}}s(List {{objectName}}s) {
        this.{{objectName}}s = {{objectName}}s;
    }

    public List get{{entityName}}s() {
        return {{objectName}}s;
    }

    public void set{{entityName}}Selected({{entityName}} {{objectName}}Selected) {
        this.{{objectName}}Selected = {{objectName}}Selected;
    }

    public {{entityName}} get{{entityName}}Selected() {
        return {{objectName}}Selected;
    }

    public void setTablas(List<Tabla> tablas) {
        this.tablas = tablas;
    }

    public List<Tabla> getTablas() {
        return tablas;
    }

    public void setTablaSelected(Tabla tablaSelected) {
        this.tablaSelected = tablaSelected;
    }

    public Tabla getTablaSelected() {
        return tablaSelected;
    }

    public void setEstadosTablas(List estadosTablas) {
        this.estadosTablas = estadosTablas;
    }

    public List getEstadosTablas() {
        return estadosTablas;
    }
}
