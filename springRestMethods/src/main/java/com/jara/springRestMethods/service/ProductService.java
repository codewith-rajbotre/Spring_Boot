package com.jara.springRestMethods.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jara.springRestMethods.model.Product;

@Service
public class ProductService{
    List <Product> product = new ArrayList(Arrays.asList(new Product(1, "Jon", "Doe"), new Product(2, "Sudeep", "Mane")));


    public List<Product> getProducts(){
           return product;
    }


    public Product getSingleProdut(int id) {
        return product.stream().filter(p->p.getId()== id).findFirst().orElse(new Product(3,"name3", "company3"));
    }

    public void addProduct(Product prod){
         product.add(prod);
    }

    public void updateProduct(Product prod){

        int index = 0;
        for(int i=0 ; i<product.size(); i++){
            if(product.get(i).getId() == prod.getId()){
                index = i;
            }
        }
        product.set(index, prod);

    }

    public void deleteProduct(int prodId){
        int index = 0;
        for(int i=0 ; i<product.size(); i++){
            if(product.get(i).getId() == prodId){
                index = i;
            }
        }
        product.remove(index);


    }
}