package com.parth.restservices.rest.components;

import java.util.Map;

public class Address {

    private String apartment;
    private String road;
    private String city;
    private String state;


    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public void loadMap(Map<String, Object> addressMap){

        this.setApartment((String) addressMap.get("apartment"));
        this.setCity((String) addressMap.get("city"));
        this.setRoad((String) addressMap.get("road"));
        this.setState((String) addressMap.get("state"));
    }


}
