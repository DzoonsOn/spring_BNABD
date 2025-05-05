package com.example.demo.services;

import com.example.demo.Entity.Product;

import java.util.List;

public interface ProductServices {

    List<Product> getProducts();

    Product addProduct(Product product);

    Product deleteProduct(String id);  // zmieniono na String

    Product updateProduct(String id, Product product);  // zmieniono na String
}
