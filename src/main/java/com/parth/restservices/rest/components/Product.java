package com.parth.restservices.rest.components;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Product {

    public List<String> getAllProducts(){

        List<String> findProduct  = new ArrayList<>();
        findProduct.add("apple");
        findProduct.add("mango");

        return findProduct;
    }

    public List<String> addSpecificProduct(String demoProduct){
        List<String> findProduct  = new ArrayList<>();
        findProduct.add("apple");
        findProduct.add("mango");

        findProduct.add(demoProduct);
        return findProduct;
    }
}
