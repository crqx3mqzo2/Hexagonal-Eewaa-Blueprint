package com.saajf.manager.eewaapro.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "historico_suscripcion", schema = "db_ifra")
public class SubscripcionHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "historico_suscripcion_id_seq")
	@SequenceGenerator(name = "historico_suscripcion_id_seq", sequenceName = "db_ifra.historico_suscripcion_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "suscripcion_id", nullable = false)
	private Integer suscripcionId;

	@Column(name = "fecha_inicio_contrato", nullable = false)
	private Date contratoStartDate;

	@Column(name = "fecha_fin_contrato", nullable = false)
	private Date contratoEndDate;

	public SubscripcionHistory() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSuscripcionId() {
		return suscripcionId;
	}

	public void setSuscripcionId(Integer suscripcionId) {
		this.suscripcionId = suscripcionId;
	}

	public Date getContratoStartDate() {
		return contratoStartDate;
	}

	public void setContratoStartDate(Date contratoStartDate) {
		this.contratoStartDate = contratoStartDate;
	}

	public Date getContratoEndDate() {
		return contratoEndDate;
	}

	public void setContratoEndDate(Date contratoEndDate) {
		this.contratoEndDate = contratoEndDate;
	}

}
