package com.saajf.manager.eewaapro.domain.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalle_producto_suscripcion", schema = "db_ifra")
public class ProductSubscriptionDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_producto_suscripcion_id_seq")
	@SequenceGenerator(name = "detalle_producto_suscripcion_id_seq", sequenceName = "db_ifra.detalle_producto_suscripcion_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "producto_id")
	private Integer productoId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suscripcion_id")
	private Subscripcion suscripcion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Subscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Subscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

}
