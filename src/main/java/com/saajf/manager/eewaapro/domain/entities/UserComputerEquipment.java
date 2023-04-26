package com.saajf.manager.eewaapro.domain.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "usuario_equipo", schema = "public")
@Table(name = "usuario_equipo", schema = "db_ifra")
public class UserComputerEquipment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_equipo_id_seq")
	@SequenceGenerator(name = "usuario_equipo_id_seq", sequenceName = "db_ifra.usuario_equipo_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "nombre", nullable = false)
	private String name;

	@Column(name = "cargo", nullable = false)
	private String position;

	@Column(name = "departamento", nullable = false)
	private String departament;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "telefono", nullable = false)
	private String phone;

	@OneToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Product product;

	public UserComputerEquipment() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departamento) {
		this.departament = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


}
