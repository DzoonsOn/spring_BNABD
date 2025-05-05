package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productServices.getProducts();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productServices.addProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public Product deleteProduct(@PathVariable String id) { // ✅ zmieniono na String
        return productServices.deleteProduct(id);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) { // ✅ zmieniono na String
        return productServices.updateProduct(id, product);
    }
}
