package co.edu.eafit.core.application.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RCT_CLIENTES database table.
 * 
 */
@Entity
@Table(name="RCT_CLIENTES")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClienteId id;

	@Column(name="ALA_CODIGO")
	private BigDecimal alaCodigo;

	@Column(name="CAR_CODIGO")
	private BigDecimal carCodigo;

	@Column(name="CLI_AA")
	private String cliAa;

	@Column(name="CLI_APELLIDOS")
	private String apellidos;

	@Column(name="CLI_CARGO")
	private String cargo;

	@Column(name="CLI_CIUDAD_COR")
	private String ciudadCorta;

	@Column(name="CLI_CIUDAD_DCTO")
	private String ciudadDcto;

	@Column(name="CLI_CIUDAD_NAC")
	private String ciudadNacimiento;

	@Column(name="CLI_CIUDAD_OFI")
	private String ciudadOficina;

	@Column(name="CLI_CIUDAD_RES")
	private String ciudadRes;

	@Column(name="CLI_CLAVE")
	private String clave;

	@Column(name="CLI_CODIGO_BEE")
	private String codigoBee;

	@Column(name="CLI_DEPTO_COR")
	private String deptoCorrrespondencia;

	@Column(name="CLI_DEPTO_DCTO")
	private String deptoDcto;

	@Column(name="CLI_DEPTO_NAC")
	private String deptoNac;

	@Column(name="CLI_DEPTO_OFI")
	private String deptoOficina;

	@Column(name="CLI_DEPTO_RES")
	private String deptoResidencia;

	@Column(name="CLI_DIRECCION_COR")
	private String direccionCorrrespondencia;

	@Column(name="CLI_DIRECCION_OFI")
	private String direccionOficina;

	@Column(name="CLI_DIRECCION_RES")
	private String direccionResidencia;

	@Column(name="CLI_EMAIL")
	private String email;

	@Column(name="CLI_ENVIO_COR")
	private String envioCorrespondencia;

	@Column(name="CLI_ESTADO_CIVIL")
	private String estadoCivil;

	@Column(name="CLI_ESTATURA")
	private BigDecimal estatura;

	@Column(name="CLI_FAX")
	private String fax;

	@Temporal(TemporalType.DATE)
	@Column(name="CLI_FECHA_ENVIO_COR")
	private Date fechaEnvioCorrrespondencia;

	@Temporal(TemporalType.DATE)
	@Column(name="CLI_FECHA_NCMTO")
	private Date fechaNacimiento;

	@Temporal(TemporalType.DATE)
	@Column(name="CLI_FECHA_REGISTRO")
	private Date fechaRegistro;

	@Temporal(TemporalType.DATE)
	@Column(name="CLI_FECHA_SITEMA")
	private Date fechaSitema;

	@Column(name="CLI_FORMATO_ENVIO")
	private String formatoEnvio;

	@Column(name="CLI_FRECU_ENVIO_COR")
	private String frecuEnvioCorrespondencia;

	@Column(name="CLI_LUGAR_ENVIO_COR")
	private String lugarEnvioCor;

	@Column(name="CLI_MEDIO_ENVIO_COR")
	private String medioEnvioCor;

	@Column(name="CLI_MOTIVO")
	private String motivo;

	@Column(name="CLI_NDCTO_RESP")
	private String ndctoResponsable;

	@Column(name="CLI_NIT_EMPRESA")
	private String nitEmpresa;

	@Column(name="CLI_NOMBRE_COMP")
	private String nombreComp;

	@Column(name="CLI_NOMBRES")
	private String nombres;

	@Column(name="CLI_OTRA_EMPRESA")
	private String otraEmpresa;

	@Column(name="CLI_OTRA_OCUPACION")
	private String otraOcupacion;

	@Column(name="CLI_PAIS_COR")
	private String paisCor;

	@Column(name="CLI_PAIS_DCTO")
	private String paisDcto;

	@Column(name="CLI_PAIS_NAC")
	private String paisNac;

	@Column(name="CLI_PAIS_OFI")
	private String paisOfi;

	@Column(name="CLI_PAIS_RES")
	private String paisRes;

	@Column(name="CLI_PESO")
	private BigDecimal peso;

	@Column(name="CLI_PUNTOS")
	private BigDecimal puntos;

	@Column(name="CLI_SEXO")
	private String sexo;

	@Column(name="CLI_TDCTO_RESP")
	private String tdctoResp;

	@Column(name="CLI_TELEFONO_BEE")
	private String telefonoBee;

	@Column(name="CLI_TELEFONO_MOV")
	private String telefonoMov;

	@Column(name="CLI_TELEFONO_OFI")
	private String telefonoOficina;

	@Column(name="CLI_TELEFONO_RES")
	private String telefonoRes;

	@Column(name="CLI_TERMINAL")
	private String terminal;

	@Column(name="CLI_TIPO_SANGRE")
	private String tipoSangre;

	@Column(name="CLI_USUARIO")
	private String usuario;

	@Column(name="OCU_CODIGO")
	private BigDecimal ocuCodigo;

	public Cliente() {
	}

	public ClienteId getId() {
		return this.id;
	}

	public void setId(ClienteId id) {
		this.id = id;
	}

	public BigDecimal getAlaCodigo() {
		return this.alaCodigo;
	}

	public void setAlaCodigo(BigDecimal alaCodigo) {
		this.alaCodigo = alaCodigo;
	}

	public BigDecimal getCarCodigo() {
		return this.carCodigo;
	}

	public void setCarCodigo(BigDecimal carCodigo) {
		this.carCodigo = carCodigo;
	}

	public String getCliAa() {
		return this.cliAa;
	}

	public void setCliAa(String cliAa) {
		this.cliAa = cliAa;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCiudadCorta() {
		return this.ciudadCorta;
	}

	public void setCiudadCorta(String ciudadCorta) {
		this.ciudadCorta = ciudadCorta;
	}

	public String getCiudadDcto() {
		return this.ciudadDcto;
	}

	public void setCiudadDcto(String ciudadDcto) {
		this.ciudadDcto = ciudadDcto;
	}

	public String getCiudadNacimiento() {
		return this.ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public String getCiudadOficina() {
		return this.ciudadOficina;
	}

	public void setCiudadOficina(String ciudadOficina) {
		this.ciudadOficina = ciudadOficina;
	}

	public String getCiudadRes() {
		return this.ciudadRes;
	}

	public void setCiudadRes(String ciudadRes) {
		this.ciudadRes = ciudadRes;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCodigoBee() {
		return this.codigoBee;
	}

	public void setCodigoBee(String codigoBee) {
		this.codigoBee = codigoBee;
	}

	public String getDeptoCorrrespondencia() {
		return this.deptoCorrrespondencia;
	}

	public void setDeptoCorrrespondencia(String deptoCorrrespondencia) {
		this.deptoCorrrespondencia = deptoCorrrespondencia;
	}

	public String getDeptoDcto() {
		return this.deptoDcto;
	}

	public void setDeptoDcto(String deptoDcto) {
		this.deptoDcto = deptoDcto;
	}

	public String getDeptoNac() {
		return this.deptoNac;
	}

	public void setDeptoNac(String deptoNac) {
		this.deptoNac = deptoNac;
	}

	public String getDeptoOficina() {
		return this.deptoOficina;
	}

	public void setDeptoOficina(String deptoOficina) {
		this.deptoOficina = deptoOficina;
	}

	public String getDeptoResidencia() {
		return this.deptoResidencia;
	}

	public void setDeptoResidencia(String deptoResidencia) {
		this.deptoResidencia = deptoResidencia;
	}

	public String getDireccionCorrrespondencia() {
		return this.direccionCorrrespondencia;
	}

	public void setDireccionCorrrespondencia(String direccionCorrrespondencia) {
		this.direccionCorrrespondencia = direccionCorrrespondencia;
	}

	public String getDireccionOficina() {
		return this.direccionOficina;
	}

	public void setDireccionOficina(String direccionOficina) {
		this.direccionOficina = direccionOficina;
	}

	public String getDireccionResidencia() {
		return this.direccionResidencia;
	}

	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnvioCorrespondencia() {
		return this.envioCorrespondencia;
	}

	public void setEnvioCorrespondencia(String envioCorrespondencia) {
		this.envioCorrespondencia = envioCorrespondencia;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public BigDecimal getEstatura() {
		return this.estatura;
	}

	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Date getFechaEnvioCorrrespondencia() {
		return this.fechaEnvioCorrrespondencia;
	}

	public void setFechaEnvioCorrrespondencia(Date fechaEnvioCorrrespondencia) {
		this.fechaEnvioCorrrespondencia = fechaEnvioCorrrespondencia;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaSitema() {
		return this.fechaSitema;
	}

	public void setFechaSitema(Date fechaSitema) {
		this.fechaSitema = fechaSitema;
	}

	public String getFormatoEnvio() {
		return this.formatoEnvio;
	}

	public void setFormatoEnvio(String formatoEnvio) {
		this.formatoEnvio = formatoEnvio;
	}

	public String getFrecuEnvioCorrespondencia() {
		return this.frecuEnvioCorrespondencia;
	}

	public void setFrecuEnvioCorrespondencia(String frecuEnvioCorrespondencia) {
		this.frecuEnvioCorrespondencia = frecuEnvioCorrespondencia;
	}

	public String getLugarEnvioCor() {
		return this.lugarEnvioCor;
	}

	public void setLugarEnvioCor(String lugarEnvioCor) {
		this.lugarEnvioCor = lugarEnvioCor;
	}

	public String getMedioEnvioCor() {
		return this.medioEnvioCor;
	}

	public void setMedioEnvioCor(String medioEnvioCor) {
		this.medioEnvioCor = medioEnvioCor;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getNdctoResponsable() {
		return this.ndctoResponsable;
	}

	public void setNdctoResponsable(String ndctoResponsable) {
		this.ndctoResponsable = ndctoResponsable;
	}

	public String getNitEmpresa() {
		return this.nitEmpresa;
	}

	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}

	public String getNombreComp() {
		return this.nombreComp;
	}

	public void setNombreComp(String nombreComp) {
		this.nombreComp = nombreComp;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getOtraEmpresa() {
		return this.otraEmpresa;
	}

	public void setOtraEmpresa(String otraEmpresa) {
		this.otraEmpresa = otraEmpresa;
	}

	public String getOtraOcupacion() {
		return this.otraOcupacion;
	}

	public void setOtraOcupacion(String otraOcupacion) {
		this.otraOcupacion = otraOcupacion;
	}

	public String getPaisCor() {
		return this.paisCor;
	}

	public void setPaisCor(String paisCor) {
		this.paisCor = paisCor;
	}

	public String getPaisDcto() {
		return this.paisDcto;
	}

	public void setPaisDcto(String paisDcto) {
		this.paisDcto = paisDcto;
	}

	public String getPaisNac() {
		return this.paisNac;
	}

	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}

	public String getPaisOfi() {
		return this.paisOfi;
	}

	public void setPaisOfi(String paisOfi) {
		this.paisOfi = paisOfi;
	}

	public String getPaisRes() {
		return this.paisRes;
	}

	public void setPaisRes(String paisRes) {
		this.paisRes = paisRes;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getPuntos() {
		return this.puntos;
	}

	public void setPuntos(BigDecimal puntos) {
		this.puntos = puntos;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTdctoResp() {
		return this.tdctoResp;
	}

	public void setTdctoResp(String tdctoResp) {
		this.tdctoResp = tdctoResp;
	}

	public String getTelefonoBee() {
		return this.telefonoBee;
	}

	public void setTelefonoBee(String telefonoBee) {
		this.telefonoBee = telefonoBee;
	}

	public String getTelefonoMov() {
		return this.telefonoMov;
	}

	public void setTelefonoMov(String telefonoMov) {
		this.telefonoMov = telefonoMov;
	}

	public String getTelefonoOficina() {
		return this.telefonoOficina;
	}

	public void setTelefonoOficina(String telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
	}

	public String getTelefonoRes() {
		return this.telefonoRes;
	}

	public void setTelefonoRes(String telefonoRes) {
		this.telefonoRes = telefonoRes;
	}

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getOcuCodigo() {
		return this.ocuCodigo;
	}

	public void setOcuCodigo(BigDecimal ocuCodigo) {
		this.ocuCodigo = ocuCodigo;
	}

}