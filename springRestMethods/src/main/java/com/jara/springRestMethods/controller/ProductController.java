package com.jara.springRestMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jara.springRestMethods.model.Product;
import com.jara.springRestMethods.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    //  @RequestMapping("/")

    @GetMapping("/product")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getSingleProduct(@PathVariable int id) {

        return service.getSingleProdut(id);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    
    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
         service.deleteProduct(prodId);
    }
}
