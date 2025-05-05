package com.example.demo.services.impl;

import com.example.demo.Entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServicesImpl implements ProductServices {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(String id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            productRepository.delete(product);
            return product;
        }
        return null;
    }

    @Override
    public Product updateProduct(String id, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product productVar = optionalProduct.get();
            productVar.setName(product.getName());
            productVar.setPrice(product.getPrice());
            productVar.setQuantity(product.getQuantity());
            return productRepository.save(productVar);
        }
        return null;
    }
}
