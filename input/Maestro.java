package co.edu.eafit.core.application.bo;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@NamedQueries( { @NamedQuery(name = "Maestro.findAll", query = "select o from Maestro o"),
                @NamedQuery(name = "Maestro.findByAppCode",
                             query = "select o from Maestro o where codigoAplicacion = :codeApp ")})
@Table(name = "CIT_MAESTROS")
public class Maestro implements Serializable {
    @Id
    @Column(name = "MAE_CODIGO", nullable = false, length = 2)
    private String codigo;
    @Column(name = "DBS_CODIGO", nullable = false, length = 2)
    private String codigoAplicacion;
    @Column(name = "MAE_DESCRIPCION", length = 100)
    private String descripcion;
    @Column(name = "MAE_EDITABLE", nullable = false, length = 1)
    private String editable;
    @Column(name = "MAE_ESESTADO", nullable = false, length = 1)
    private String estado;
    @Column(name = "MAE_NOMBRE", nullable = false, unique = true)
    private String nombre;
    @Transient
    private List<Tabla> registros;

    public Maestro() {
    }

    public Maestro(String codigo, String dbsCodigo, String descripcion, String editable, String estado,
                   String nombre) {
        this.codigo = codigo;
        this.codigoAplicacion = dbsCodigo;
        this.descripcion = descripcion;
        this.editable = editable;
        this.estado = estado;
        this.nombre = nombre;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoAplicacion() {
        return codigoAplicacion;
    }

    public void setCodigoAplicacion(String dbsCodigo) {
        this.codigoAplicacion = dbsCodigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("codigo=");
        buffer.append(getCodigo());
        buffer.append(',');
        buffer.append("dbsCodigo=");
        buffer.append(getCodigoAplicacion());
        buffer.append(',');
        buffer.append("descripcion=");
        buffer.append(getDescripcion());
        buffer.append(',');
        buffer.append("editable=");
        buffer.append(getEditable());
        buffer.append(',');
        buffer.append("estado=");
        buffer.append(getEstado());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(']');
        return buffer.toString();
    }

    public void setRegistros(List<Tabla> registros) {
        this.registros = registros;
    }

    public List<Tabla> getRegistros() {
        return registros;
    }
}
