package com.saajf.manager.eewaapro.domain.services.interfaces;

import com.saajf.manager.eewaapro.domain.entities.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

	Product createProduct(Product product);

	Boolean updateProduct(Product product);

	Optional<Product> findById(Integer id);

	List<Product> findAll() throws Exception;

	Boolean inactive(Product product) throws Exception;

	Boolean active(Product product) throws Exception;

}
