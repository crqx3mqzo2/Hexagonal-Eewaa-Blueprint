package com.saajf.manager.eewaapro.domain.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.saajf.manager.eewaapro.domain.entities.Product;

@Component
public interface ProductRepositoryPort {

	/**
	 * Crear producto
	*/
	Product create(Product product);

	/**
	 *  Modificar producto
	 * @param product
	 * @return
	*/
	Boolean modify(Product product);

	/**
	 * Activar un procduto
	 * @throws Exception
	*/
	Boolean active(Product product) throws Exception;

	/**
	 * Inactivar un procduto
	 * @return
	 * @throws Exception
	*/
	Boolean inactive(Product product) throws Exception;

	/**
	 * Buscar un producto
	 * @param id
	 * @return
	 */
	Optional<Product> findById(Integer id);

	/**
	 * Buscar todos los productos 
	 * @return
	 * @throws Exception
	*/
	List<Product> findAll() throws Exception;

}
