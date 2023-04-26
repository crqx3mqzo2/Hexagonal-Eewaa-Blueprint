package com.saajf.manager.eewaapro.domain.dtos;

import java.io.Serializable;
import java.util.List;

public class ClientDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String razonSocial;

	private String tipoEmpresa;

	private String direccion1Empresa;

	private String direccion2Empresa;

	private String telefono1Empresa;

	private String telefono2Empresa;

	private String email;

	private List<Suscripcion> suscripciones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getDireccion1Empresa() {
		return direccion1Empresa;
	}

	public void setDireccion1Empresa(String direccion1Empresa) {
		this.direccion1Empresa = direccion1Empresa;
	}

	public String getDireccion2Empresa() {
		return direccion2Empresa;
	}

	public void setDireccion2Empresa(String direccion2Empresa) {
		this.direccion2Empresa = direccion2Empresa;
	}

	public String getTelefono1Empresa() {
		return telefono1Empresa;
	}

	public void setTelefono1Empresa(String telefono1Empresa) {
		this.telefono1Empresa = telefono1Empresa;
	}

	public String getTelefono2Empresa() {
		return telefono2Empresa;
	}

	public void setTelefono2Empresa(String telefono2Empresa) {
		this.telefono2Empresa = telefono2Empresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Suscripcion> getSuscripciones() {
		return suscripciones;
	}

	public void setSuscripciones(List<Suscripcion> suscripciones) {
		this.suscripciones = suscripciones;
	}

}
