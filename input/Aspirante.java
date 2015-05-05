package co.edu.eafit.inscripciones.bo;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@NamedQueries({
  @NamedQuery(name = "Aspirante.findAll", query = "select o from Aspirante o"),
  @NamedQuery(name = "Aspirante.findByDoc", query = "select o from Aspirante o where numDcto = :numDcto and tipoDcto = :tipoDcto")
})
@Table(name = "ART_ASPIRANTES")
@IdClass(AspirantePK.class)
public class Aspirante implements Serializable {
    @Column(name="CLI_APELLIDOS", nullable = false, length = 50)
    private String apellidos;
    @Column(name="CLI_APELLIDOS_RESP", length = 50)
    private String apellidosResponsable;
    @Column(name="APP_BARRIO_RES", length = 60)
    private String barrio;
    @Column(name="CLI_CARGO", length = 120)
    private String cargo;
    @Column(name="CLI_CIUDAD_DCTO", length = 3)
    private String ciudadDcto;
    @Column(name="CLI_CIUDAD_NAC", length = 3)
    private String ciudadNacimiento;
    @Column(name="CLI_CIUDAD_OFI", length = 3)
    private String ciudadOficina;
    @Column(name="APP_CIUDAD_ORI", length = 3)
    private String ciudadOrigen;
    @Column(name="CLI_CIUDAD_RES", nullable = false, length = 3)
    private String ciudadResidencia;
    @Column(name="CLI_CIUDAD_RESP", length = 3)
    private String ciudadResponsable;
    @Column(name="APP_CLASELIBMILITAR", length = 60)
    private String claseLibretaMilitar;
    @Column(name="CLI_CLAVE", length = 20)
    private String clave;
    @Column(name="CLI_DEPTO_DCTO", length = 5)
    private String deptoDcto;
    @Column(name="CLI_DEPTO_NAC", length = 5)
    private String deptoNacimiento;
    @Column(name="CLI_DEPTO_OFI", length = 5)
    private String deptoOficina;
    @Column(name="APP_DEPTO_ORI", length = 5)
    private String deptoOrigen;
    @Column(name="CLI_DEPTO_RESP", length = 5)
    private String deptoResp;
    @Column(name="CLI_DEPTO_RES", nullable = false, length = 5)
    private String deptoResponsable;
    @Column(name="CLI_DIRECCION_OFI")
    private String direccionOficina;
    @Column(name="CLI_DIRECCION_RES", nullable = false)
    private String direccionResidencia;
    @Column(name="CLI_DIRECCION_RESP")
    private String direccionResponsable;
    @Column(name="CLI_EMAIL", length = 120)
    private String email;
    @Column(name="CLI_EMPRESA", length = 120)
    private String empresa;
    @Column(name="APP_EPS", length = 60)
    private String eps;
    @Column(name="CLI_ESTADO_CIVIL", nullable = false, length = 2)
    private String estadoCivil;
    @Temporal(TemporalType.DATE)
    @Column(name="CLI_FECHA_DCTO")
    private Date fechaDcto;
    @Temporal(TemporalType.DATE)
    @Column(name="CLI_FECHA_NCMTO")
    private Date fechaNacimiento;
    @Temporal(TemporalType.DATE)
    @Column(name="CLI_FECHA_SISTEMA", nullable = false)
    private Date fechaSistema;
    @Column(name="CLI_NOMBRE_COMP", length = 101)
    private String nombreCompleto;
    @Column(name="CLI_NOMBRES", nullable = false, length = 50)
    private String nombres;
    @Column(name="CLI_NOMBRES_RESP", length = 50)
    private String nombresResponsable;
    @Id
    @Column(name="CLI_NUMDCTO", nullable = false, length = 12)
    private String numDcto;
    @Column(name="CLI_NUM_OTRO_DCTO", length = 30)
    private String numDctoOtro;
    @Column(name="CLI_NDCTO_RESP", length = 12)
    private String numDocResponsable;
    @Column(name="APP_NUMLIBMILITAR", length = 60)
    private String numLibretaMilitar;
    @Column(name="CLI_PAIS_DCTO", length = 4)
    private String paisDcto;
    @Column(name="CLI_PAIS_NAC", length = 4)
    private String paisNacimiento;
    @Column(name="CLI_PAIS_OFI", length = 4)
    private String paisOficina;
    @Column(name="APP_PAIS_ORI", length = 4)
    private String paisOrigen;
    @Column(name="CLI_PAIS_RES", nullable = false, length = 4)
    private String paisResidencia;
    @Column(name="CLI_PAIS_RESP", length = 4)
    private String paisResponsable;
    @Column(name="CLI_PRIMER_APELLIDO", length = 30)
    private String primerApellido;
    @Column(name="CLI_PRIMER_NOMBRE", length = 30)
    private String primerNombre;
    @Column(name="CLI_SEGUNDO_APELLIDO", length = 30)
    private String segundoApellido;
    @Column(name="CLI_SEGUNDO_NOMBRE", length = 30)
    private String segundoNombre;
    @Column(name="CLI_SEXO", nullable = false, length = 1)
    private String sexo;
    @Column(name="CLI_TELEFONO_MOV", length = 30)
    private String telefonoMovil;
    @Column(name="CLI_TELEFONO_OFI", length = 30)
    private String telefonoOficina;
    @Column(name="CLI_TELEFONO_RESP", length = 30)
    private String telefonoResponsable;
    @Column(name="CLI_TELEFONO_RES", nullable = false, length = 30)
    private String telefonoResidencia;
    @Id
    @Column(name="CLI_TIPODCTO", nullable = false, length = 2)
    private String tipoDcto;
    @Column(name="CLI_TDCTO_RESP", length = 2)
    private String tipoDctoResponsable;
    @Column(name="CLI_TIPO_SANGRE", length = 3)
    private String tipoSangre;

    public Aspirante() {
    }

    public Aspirante(String apellidos, String apellidosResponsable, String barrio, String cargo, String ciudadDcto,
                     String ciudadNacimiento, String ciudadOficina, String ciudadOrigen, String ciudadResidencia,
                     String ciudadResponsable, String claseLibretaMilitar, String clave, String deptoDcto,
                     String deptoNacimiento, String deptoOficina, String deptoOrigen, String deptoResp,
                     String deptoResponsable, String direccionOficina, String direccionResidencia,
                     String direccionResponsable, String email, String empresa, String eps, String estadoCivil,
                     Date fechaDcto, Date fechaNacimiento, Date fechaSistema, String nombreCompleto, String nombres,
                     String nombresResponsable, String numDcto, String numDctoOtro, String numDocResponsable,
                     String numLibretaMilitar, String paisDcto, String paisNacimiento, String paisOficina,
                     String paisOrigen, String paisResidencia, String paisResponsable, String primerApellido,
                     String primerNombre, String segundoApellido, String segundoNombre, String sexo,
                     String telefonoMovil, String telefonoOficina, String telefonoResponsable,
                     String telefornoResidencia, String tipoDcto, String tipoDctoResponsable, String tipoSangre) {
        this.apellidos = apellidos;
        this.apellidosResponsable = apellidosResponsable;
        this.barrio = barrio;
        this.cargo = cargo;
        this.ciudadDcto = ciudadDcto;
        this.ciudadNacimiento = ciudadNacimiento;
        this.ciudadOficina = ciudadOficina;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadResidencia = ciudadResidencia;
        this.ciudadResponsable = ciudadResponsable;
        this.claseLibretaMilitar = claseLibretaMilitar;
        this.clave = clave;
        this.deptoDcto = deptoDcto;
        this.deptoNacimiento = deptoNacimiento;
        this.deptoOficina = deptoOficina;
        this.deptoOrigen = deptoOrigen;
        this.deptoResp = deptoResp;
        this.deptoResponsable = deptoResponsable;
        this.direccionOficina = direccionOficina;
        this.direccionResidencia = direccionResidencia;
        this.direccionResponsable = direccionResponsable;
        this.email = email;
        this.empresa = empresa;
        this.eps = eps;
        this.estadoCivil = estadoCivil;
        this.fechaDcto = fechaDcto;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaSistema = fechaSistema;
        this.nombreCompleto = nombreCompleto;
        this.nombres = nombres;
        this.nombresResponsable = nombresResponsable;
        this.numDcto = numDcto;
        this.numDctoOtro = numDctoOtro;
        this.numDocResponsable = numDocResponsable;
        this.numLibretaMilitar = numLibretaMilitar;
        this.paisDcto = paisDcto;
        this.paisNacimiento = paisNacimiento;
        this.paisOficina = paisOficina;
        this.paisOrigen = paisOrigen;
        this.paisResidencia = paisResidencia;
        this.paisResponsable = paisResponsable;
        this.primerApellido = primerApellido;
        this.primerNombre = primerNombre;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
        this.sexo = sexo;
        this.telefonoMovil = telefonoMovil;
        this.telefonoOficina = telefonoOficina;
        this.telefonoResponsable = telefonoResponsable;
        this.telefonoResidencia = telefornoResidencia;
        this.tipoDcto = tipoDcto;
        this.tipoDctoResponsable = tipoDctoResponsable;
        this.tipoSangre = tipoSangre;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidosResponsable() {
        return apellidosResponsable;
    }

    public void setApellidosResponsable(String apellidosResponsable) {
        this.apellidosResponsable = apellidosResponsable;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCiudadDcto() {
        return ciudadDcto;
    }

    public void setCiudadDcto(String ciudadDcto) {
        this.ciudadDcto = ciudadDcto;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public String getCiudadOficina() {
        return ciudadOficina;
    }

    public void setCiudadOficina(String ciudadOficina) {
        this.ciudadOficina = ciudadOficina;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getCiudadResponsable() {
        return ciudadResponsable;
    }

    public void setCiudadResponsable(String ciudadResponsable) {
        this.ciudadResponsable = ciudadResponsable;
    }

    public String getClaseLibretaMilitar() {
        return claseLibretaMilitar;
    }

    public void setClaseLibretaMilitar(String claseLibretaMilitar) {
        this.claseLibretaMilitar = claseLibretaMilitar;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDeptoDcto() {
        return deptoDcto;
    }

    public void setDeptoDcto(String deptoDcto) {
        this.deptoDcto = deptoDcto;
    }

    public String getDeptoNacimiento() {
        return deptoNacimiento;
    }

    public void setDeptoNacimiento(String deptoNacimiento) {
        this.deptoNacimiento = deptoNacimiento;
    }

    public String getDeptoOficina() {
        return deptoOficina;
    }

    public void setDeptoOficina(String deptoOficina) {
        this.deptoOficina = deptoOficina;
    }

    public String getDeptoOrigen() {
        return deptoOrigen;
    }

    public void setDeptoOrigen(String deptoOrigen) {
        this.deptoOrigen = deptoOrigen;
    }

    public String getDeptoResp() {
        return deptoResp;
    }

    public void setDeptoResp(String deptoResp) {
        this.deptoResp = deptoResp;
    }

    public String getDeptoResponsable() {
        return deptoResponsable;
    }

    public void setDeptoResponsable(String deptoResponsable) {
        this.deptoResponsable = deptoResponsable;
    }

    public String getDireccionOficina() {
        return direccionOficina;
    }

    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getDireccionResponsable() {
        return direccionResponsable;
    }

    public void setDireccionResponsable(String direccionResponsable) {
        this.direccionResponsable = direccionResponsable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaDcto() {
        return fechaDcto;
    }

    public void setFechaDcto(Date fechaDcto) {
        this.fechaDcto = fechaDcto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaSistema() {
        return fechaSistema;
    }

    public void setFechaSistema(Date fechaSistema) {
        this.fechaSistema = fechaSistema;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombresResponsable() {
        return nombresResponsable;
    }

    public void setNombresResponsable(String nombresResponsable) {
        this.nombresResponsable = nombresResponsable;
    }

    public String getNumDcto() {
        return numDcto;
    }

    public void setNumDcto(String numDcto) {
        this.numDcto = numDcto;
    }

    public String getNumDctoOtro() {
        return numDctoOtro;
    }

    public void setNumDctoOtro(String numDctoOtro) {
        this.numDctoOtro = numDctoOtro;
    }

    public String getNumDocResponsable() {
        return numDocResponsable;
    }

    public void setNumDocResponsable(String numDocResponsable) {
        this.numDocResponsable = numDocResponsable;
    }

    public String getNumLibretaMilitar() {
        return numLibretaMilitar;
    }

    public void setNumLibretaMilitar(String numLibretaMilitar) {
        this.numLibretaMilitar = numLibretaMilitar;
    }

    public String getPaisDcto() {
        return paisDcto;
    }

    public void setPaisDcto(String paisDcto) {
        this.paisDcto = paisDcto;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getPaisOficina() {
        return paisOficina;
    }

    public void setPaisOficina(String paisOficina) {
        this.paisOficina = paisOficina;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getPaisResponsable() {
        return paisResponsable;
    }

    public void setPaisResponsable(String paisResponsable) {
        this.paisResponsable = paisResponsable;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(String telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

    public String getTelefonoResidencia() {
        return telefonoResidencia;
    }

    public void setTelefonoResidencia(String telefornoResidencia) {
        this.telefonoResidencia = telefornoResidencia;
    }

    public String getTipoDcto() {
        return tipoDcto;
    }

    public void setTipoDcto(String tipoDcto) {
        this.tipoDcto = tipoDcto;
    }

    public String getTipoDctoResponsable() {
        return tipoDctoResponsable;
    }

    public void setTipoDctoResponsable(String tipoDctoResponsable) {
        this.tipoDctoResponsable = tipoDctoResponsable;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("apellidos=");
        buffer.append(getApellidos());
        buffer.append(',');
        buffer.append("apellidosResponsable=");
        buffer.append(getApellidosResponsable());
        buffer.append(',');
        buffer.append("barrio=");
        buffer.append(getBarrio());
        buffer.append(',');
        buffer.append("cargo=");
        buffer.append(getCargo());
        buffer.append(',');
        buffer.append("ciudadDcto=");
        buffer.append(getCiudadDcto());
        buffer.append(',');
        buffer.append("ciudadNacimiento=");
        buffer.append(getCiudadNacimiento());
        buffer.append(',');
        buffer.append("ciudadOficina=");
        buffer.append(getCiudadOficina());
        buffer.append(',');
        buffer.append("ciudadOrigen=");
        buffer.append(getCiudadOrigen());
        buffer.append(',');
        buffer.append("ciudadResidencia=");
        buffer.append(getCiudadResidencia());
        buffer.append(',');
        buffer.append("ciudadResponsable=");
        buffer.append(getCiudadResponsable());
        buffer.append(',');
        buffer.append("claseLibretaMilitar=");
        buffer.append(getClaseLibretaMilitar());
        buffer.append(',');
        buffer.append("clave=");
        buffer.append(getClave());
        buffer.append(',');
        buffer.append("deptoDcto=");
        buffer.append(getDeptoDcto());
        buffer.append(',');
        buffer.append("deptoNacimiento=");
        buffer.append(getDeptoNacimiento());
        buffer.append(',');
        buffer.append("deptoOficina=");
        buffer.append(getDeptoOficina());
        buffer.append(',');
        buffer.append("deptoOrigen=");
        buffer.append(getDeptoOrigen());
        buffer.append(',');
        buffer.append("deptoResp=");
        buffer.append(getDeptoResp());
        buffer.append(',');
        buffer.append("deptoResponsable=");
        buffer.append(getDeptoResponsable());
        buffer.append(',');
        buffer.append("direccionOficina=");
        buffer.append(getDireccionOficina());
        buffer.append(',');
        buffer.append("direccionResidencia=");
        buffer.append(getDireccionResidencia());
        buffer.append(',');
        buffer.append("direccionResponsable=");
        buffer.append(getDireccionResponsable());
        buffer.append(',');
        buffer.append("email=");
        buffer.append(getEmail());
        buffer.append(',');
        buffer.append("empresa=");
        buffer.append(getEmpresa());
        buffer.append(',');
        buffer.append("eps=");
        buffer.append(getEps());
        buffer.append(',');
        buffer.append("estadoCivil=");
        buffer.append(getEstadoCivil());
        buffer.append(',');
        buffer.append("fechaDcto=");
        buffer.append(getFechaDcto());
        buffer.append(',');
        buffer.append("fechaNacimiento=");
        buffer.append(getFechaNacimiento());
        buffer.append(',');
        buffer.append("fechaSistema=");
        buffer.append(getFechaSistema());
        buffer.append(',');
        buffer.append("nombreCompleto=");
        buffer.append(getNombreCompleto());
        buffer.append(',');
        buffer.append("nombres=");
        buffer.append(getNombres());
        buffer.append(',');
        buffer.append("nombresResponsable=");
        buffer.append(getNombresResponsable());
        buffer.append(',');
        buffer.append("numDcto=");
        buffer.append(getNumDcto());
        buffer.append(',');
        buffer.append("numDctoOtro=");
        buffer.append(getNumDctoOtro());
        buffer.append(',');
        buffer.append("numDocResponsable=");
        buffer.append(getNumDocResponsable());
        buffer.append(',');
        buffer.append("numLibretaMilitar=");
        buffer.append(getNumLibretaMilitar());
        buffer.append(',');
        buffer.append("paisDcto=");
        buffer.append(getPaisDcto());
        buffer.append(',');
        buffer.append("paisNacimiento=");
        buffer.append(getPaisNacimiento());
        buffer.append(',');
        buffer.append("paisOficina=");
        buffer.append(getPaisOficina());
        buffer.append(',');
        buffer.append("paisOrigen=");
        buffer.append(getPaisOrigen());
        buffer.append(',');
        buffer.append("paisResidencia=");
        buffer.append(getPaisResidencia());
        buffer.append(',');
        buffer.append("paisResponsable=");
        buffer.append(getPaisResponsable());
        buffer.append(',');
        buffer.append("primerApellido=");
        buffer.append(getPrimerApellido());
        buffer.append(',');
        buffer.append("primerNombre=");
        buffer.append(getPrimerNombre());
        buffer.append(',');
        buffer.append("segundoApellido=");
        buffer.append(getSegundoApellido());
        buffer.append(',');
        buffer.append("segundoNombre=");
        buffer.append(getSegundoNombre());
        buffer.append(',');
        buffer.append("sexo=");
        buffer.append(getSexo());
        buffer.append(',');
        buffer.append("telefonoMovil=");
        buffer.append(getTelefonoMovil());
        buffer.append(',');
        buffer.append("telefonoOficina=");
        buffer.append(getTelefonoOficina());
        buffer.append(',');
        buffer.append("telefonoResponsable=");
        buffer.append(getTelefonoResponsable());
        buffer.append(',');
        buffer.append("telefornoResidencia=");
        buffer.append(getTelefonoResidencia());
        buffer.append(',');
        buffer.append("tipoDcto=");
        buffer.append(getTipoDcto());
        buffer.append(',');
        buffer.append("tipoDctoResponsable=");
        buffer.append(getTipoDctoResponsable());
        buffer.append(',');
        buffer.append("tipoSangre=");
        buffer.append(getTipoSangre());
        buffer.append(']');
        return buffer.toString();
    }
}
