package com.saajf.manager.eewaapro.domain.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "producto", schema = "db_ifra")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Product(Integer id, String productType, String productDescription, String productBrand, String productModel,
			String productSerialNumber, String productTechnicalFeatures, String productUsageStatus,
			String productLocation, Integer assignedUserProduct, Date productPurchaseDate, boolean active,
			Subscripcion suscripcionId) {
		super();
		this.id = id;
		this.productType = productType;
		this.productDescription = productDescription;
		this.productBrand = productBrand;
		this.productModel = productModel;
		this.productSerialNumber = productSerialNumber;
		this.productTechnicalFeatures = productTechnicalFeatures;
		this.productUsageStatus = productUsageStatus;
		this.productLocation = productLocation;
		this.assignedUserProduct = assignedUserProduct;
		this.productPurchaseDate = productPurchaseDate;
		this.active = active;
		this.suscripcionId = suscripcionId;
	}

	public Product() {
		super();
	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id", nullable = false)
//	private Integer id;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "producto_id_seq", sequenceName = "db_ifra.producto_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "tipo_de_producto", nullable = false)
	private String productType;

	@Column(name = "descripcion_producto", nullable = false)
	private String productDescription;

	@Column(name = "marca_producto", nullable = false)
	private String productBrand;

	@Column(name = "modelo_producto", nullable = false)
	private String productModel;

	@Column(name = "numero_de_serie_producto", nullable = false)
	private String productSerialNumber;

	@Column(name = "caracteristicas_tecnicas_producto")
	private String productTechnicalFeatures;

	@Column(name = "estado_de_uso_producto", nullable = false)
	private String productUsageStatus;

	@Column(name = "ubicacion_producto", nullable = false)
	private String productLocation;

	@Column(name = "usuario_asignado_producto")
	private Integer assignedUserProduct;

	@Column(name = "fecha_compra_producto", nullable = false)
	private Date productPurchaseDate;

	@Column(name = "activo", nullable = false)
	private boolean active;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suscripcion_id")
	private Subscripcion suscripcionId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductSerialNumber() {
		return productSerialNumber;
	}

	public void setProductSerialNumber(String productSerialNumber) {
		this.productSerialNumber = productSerialNumber;
	}

	public String getProductTechnicalFeatures() {
		return productTechnicalFeatures;
	}

	public void setProductTechnicalFeatures(String productTechnicalFeatures) {
		this.productTechnicalFeatures = productTechnicalFeatures;
	}

	public String getProductUsageStatus() {
		return productUsageStatus;
	}

	public void setProductUsageStatus(String productUsageStatus) {
		this.productUsageStatus = productUsageStatus;
	}

	public String getProductLocation() {
		return productLocation;
	}

	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}

	public Integer getAssignedUserProduct() {
		return assignedUserProduct;
	}

	public void setAssignedUserProduct(Integer assignedUserProduct) {
		this.assignedUserProduct = assignedUserProduct;
	}

	public Date getProductPurchaseDate() {
		return productPurchaseDate;
	}

	public void setProductPurchaseDate(Date productPurchaseDate) {
		this.productPurchaseDate = productPurchaseDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Subscripcion getSuscripcionId() {
		return suscripcionId;
	}

	public void setSuscripcionId(Subscripcion suscripcionId) {
		this.suscripcionId = suscripcionId;
	}

}
