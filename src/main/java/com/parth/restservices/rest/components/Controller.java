package com.parth.restservices.rest.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    Product product;

  /*public Controller(Product product){
       this.product = product;
   }*/

   @Autowired
    AllAddressOfClient allAddressOfClient;

    @GetMapping(value = "/demo/all")
    public List<String> getProducts(){
        return product.getAllProducts();
    }

    @RequestMapping(value = "/demo/{id}" , method = RequestMethod.POST)
    public List<String> addNewProduct(@PathVariable String id){
        return product.addSpecificProduct(id);
    }

    @PostMapping("/address")
    public Address addNew(@RequestBody Map<String, Object> newaddress){
        System.out.println("newAddress:"+ newaddress);
        Address address = new Address();
        address.loadMap(newaddress);
        allAddressOfClient.addAddress(address);
        return allAddressOfClient.getAlladdress().get(0);
    }

    @GetMapping("/demo/{hello1}")
    public String sayHello(@PathVariable String hello1){
        return "hello World" + hello1;
    }


 /*   @RequestMapping(value = "/demo/{hello2}")
    public String returnPath(@PathVariable String hello2){
        return "Hello from Path" + hello2;
    }
*/

}
