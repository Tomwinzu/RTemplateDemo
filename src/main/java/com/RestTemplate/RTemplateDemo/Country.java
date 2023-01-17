package com.RestTemplate.RTemplateDemo;

public class Country {
    private String country_id;
    private  String probability;

    public String getCountry_id() {
        return country_id;
    }

    public String getProbability() {
        return probability;
    }

    public Country() {
    }

    public Country(String country_id, String probability) {
        this.country_id = country_id;
        this.probability = probability;
    }
}
