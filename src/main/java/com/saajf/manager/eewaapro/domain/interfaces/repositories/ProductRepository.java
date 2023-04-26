package com.saajf.manager.eewaapro.domain.interfaces.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saajf.manager.eewaapro.domain.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
