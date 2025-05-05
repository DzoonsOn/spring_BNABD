package com.example.demo.repository;

import com.example.demo.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product,String> {

}
