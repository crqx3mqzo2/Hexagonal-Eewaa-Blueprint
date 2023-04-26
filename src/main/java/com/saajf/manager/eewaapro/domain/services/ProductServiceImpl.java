package com.saajf.manager.eewaapro.domain.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saajf.manager.eewaapro.domain.entities.Product;
import com.saajf.manager.eewaapro.domain.interfaces.ProductRepositoryPort;
import com.saajf.manager.eewaapro.domain.services.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepositoryPort productRepositoryPort;

    @Override
    public Product createProduct(Product product) {
        return productRepositoryPort.create(product);
    }

    @Override
    public Boolean updateProduct(Product updatedProduct) {
        Product existingProduct = productRepositoryPort.findById(updatedProduct.getId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        /*
        existingProduct.setProductType(updatedProduct.getProductType());
        existingProduct.setProductDescription(updatedProduct.getProductDescription());
        existingProduct.setProductBrand(updatedProduct.getProductBrand());
        existingProduct.setProductModel(updatedProduct.getProductModel());
        existingProduct.setProductSerialNumber(updatedProduct.getProductSerialNumber());
        existingProduct.setProductTechnicalFeatures(updatedProduct.getProductTechnicalFeatures());
        existingProduct.setProductUsageStatus(updatedProduct.getProductUsageStatus());
        existingProduct.setProductLocation(updatedProduct.getProductLocation());
        existingProduct.setAssignedUserProduct(updatedProduct.getAssignedUserProduct());
        existingProduct.setProductPurchaseDate(updatedProduct.getProductPurchaseDate());
        existingProduct.setActive(updatedProduct.isActive()); */

        return productRepositoryPort.modify(existingProduct);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepositoryPort.findById(id);
    }

    @Override
    public List<Product> findAll() throws Exception {
        return Optional.ofNullable(productRepositoryPort.findAll()).orElse(Collections.emptyList());
    }

    @Override
    public Boolean inactive(Product product) throws Exception {
        return productRepositoryPort.inactive(product);
    }

    @Override
    public Boolean active(Product product) throws Exception {
        return productRepositoryPort.inactive(product);
    }
}
