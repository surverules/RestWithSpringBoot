package com.parth.restservices.rest.components;


import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AllAddressOfClient {


    private List<Address> alladdress;

    public void addAddress(Address address){
        alladdress.add(address);
    }

    public List<Address> getAlladdress(){
        return alladdress;
    }


}
