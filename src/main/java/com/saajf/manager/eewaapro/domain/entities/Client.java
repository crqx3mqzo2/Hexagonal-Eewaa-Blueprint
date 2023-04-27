package com.saajf.manager.eewaapro.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
//@Table(name = "cliente", schema = "public")
@Table(name = "cliente", schema = "db_ifra")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "razon_social", nullable = false)
	private String companyName;

	@Column(name = "tipo_empresa", nullable = false)
	private String companyType;

	@Column(name = "direccion_1_empresa", nullable = false)
	private String companyAddress1;

	@Column(name = "direccion_2_empresa")
	private String companyAddress2;

	@Column(name = "telefono_1_empresa", nullable = false)
	private String companyPhone1;

	@Column(name = "telefono_2_empresa")
	private String companyPhone2;

	@Column(name = "email", nullable = false)
	private String email;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Subscripcion> subscriptions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyAddress1() {
		return companyAddress1;
	}

	public void setCompanyAddress1(String companyAddress1) {
		this.companyAddress1 = companyAddress1;
	}

	public String getCompanyAddress2() {
		return companyAddress2;
	}

	public void setCompanyAddress2(String companyAddress2) {
		this.companyAddress2 = companyAddress2;
	}

	public String getCompanyPhone1() {
		return companyPhone1;
	}

	public void setCompanyPhone1(String companyPhone1) {
		this.companyPhone1 = companyPhone1;
	}

	public String getCompanyPhone2() {
		return companyPhone2;
	}

	public void setCompanyPhone2(String companyPhone2) {
		this.companyPhone2 = companyPhone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Subscripcion> getSuscripciones() {
		return subscriptions;
	}

	public void setSuscripciones(List<Subscripcion> suscripciones) {
		this.subscriptions = suscripciones;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", companyName=" + companyName + ", companyType=" + companyType
				+ ", companyAddress1=" + companyAddress1 + ", companyAddress2=" + companyAddress2 + ", companyPhone1="
				+ companyPhone1 + ", companyPhone2=" + companyPhone2 + ", email=" + email + ", subscriptions="
				+ subscriptions + "]";
	}

}
