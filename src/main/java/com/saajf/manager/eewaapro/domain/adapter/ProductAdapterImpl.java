package com.saajf.manager.eewaapro.domain.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saajf.manager.eewaapro.commons.utils.ExceptionUtils;
import com.saajf.manager.eewaapro.domain.entities.Product;
import com.saajf.manager.eewaapro.domain.interfaces.ProductRepositoryPort;
import com.saajf.manager.eewaapro.domain.interfaces.repositories.ProductRepository;

@Component
public class ProductAdapterImpl implements ProductRepositoryPort {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Boolean modify(Product product) {
		productRepository.save(product);
		return true;
	}

	@Override
	public Optional<Product> findById(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public List<Product> findAll() throws Exception {
		return ExceptionUtils.executeWithMethodName(() -> (List<Product>) productRepository.findAll());
	}

	@Override
	public Boolean active(Product product) throws Exception {

		return ExceptionUtils.executeWithMethodName(() -> {
			Product savedProduct = productRepository.save(product);
			return savedProduct != null;
		});
	}

	@Override
	public Boolean inactive(Product product) throws Exception {
		return ExceptionUtils.executeWithMethodName(() -> {
			Product savedProduct = productRepository.save(product);
			return savedProduct != null;
		});

	}

}
