package com.saajf.manager.eewaapro.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
//@Table(name = "plan", schema = "public")
@Table(name = "plan", schema = "db_ifra")
public class SubscriptionPlan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plan_id_seq")
	@SequenceGenerator(name = "plan_id_seq", sequenceName = "db_ifra.plan_id_seq", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre", nullable = false)
	private String name;

	@Column(name = "precio", nullable = false, precision = 10, scale = 2)
	private BigDecimal price;

	@Column(name = "duracion", nullable = false)
	private Integer duration;

	@Column(name = "descripcion_servicio", nullable = false)
	private String serviceDescription;

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

}
