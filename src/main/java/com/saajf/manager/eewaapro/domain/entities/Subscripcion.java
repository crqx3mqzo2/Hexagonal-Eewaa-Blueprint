package com.saajf.manager.eewaapro.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "suscripcion", schema = "db_ifra")
public class Subscripcion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "suscripcion_id_seq")
	@SequenceGenerator(name = "suscripcion_id_seq", sequenceName = "db_ifra.suscripcion_id_seq", allocationSize = 1)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
	private Client cliente;

	@ManyToOne
	@JoinColumn(name = "plan_id", referencedColumnName = "id", nullable = false)
	private SubscriptionPlan plan;

	@Column(name = "fecha_inicio_suscripcion", nullable = false)
	private Date subscriptionStartDate;

	@Column(name = "fecha_fin_suscripcion", nullable = false)
	private Date subscriptionEndDate;

	@Column(name = "suscripcion_activa", nullable = false)
	private Boolean subscriptionActive;

	@Column(name = "suscripcion_renovada", nullable = false)
	private Boolean subscriptionRenewed;

	@OneToMany(mappedBy = "suscripcion", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ProductSubscriptionDetails> subscriptionProductDetails = new ArrayList<>();

	@OneToMany(mappedBy = "suscripcionId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> product = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public SubscriptionPlan getPlan() {
		return plan;
	}

	public void setPlan(SubscriptionPlan plan) {
		this.plan = plan;
	}

	public Date getSubscriptionStartDate() {
		return subscriptionStartDate;
	}

	public void setSubscriptionStartDate(Date subscriptionStartDate) {
		this.subscriptionStartDate = subscriptionStartDate;
	}

	public Date getSubscriptionEndDate() {
		return subscriptionEndDate;
	}

	public void setSubscriptionEndDate(Date subscriptionEndDate) {
		this.subscriptionEndDate = subscriptionEndDate;
	}

	public Boolean getSubscriptionActive() {
		return subscriptionActive;
	}

	public void setSubscriptionActive(Boolean subscriptionActive) {
		this.subscriptionActive = subscriptionActive;
	}

	public Boolean getSubscriptionRenewed() {
		return subscriptionRenewed;
	}

	public void setSubscriptionRenewed(Boolean subscriptionRenewed) {
		this.subscriptionRenewed = subscriptionRenewed;
	}

	public List<ProductSubscriptionDetails> getSubscriptionProductDetails() {
		return subscriptionProductDetails;
	}

	public void setSubscriptionProductDetails(List<ProductSubscriptionDetails> subscriptionProductDetails) {
		this.subscriptionProductDetails = subscriptionProductDetails;
	}

}
