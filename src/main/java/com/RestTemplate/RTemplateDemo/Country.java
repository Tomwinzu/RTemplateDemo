package com.RestTemplate.RTemplateDemo;

public class Country {


     private String country_id;
     private float probability;

     public Country() {
     }

     public Country(String country_id, float  probability) {
          this.country_id = country_id;
          this.probability = probability;
     }

     public String getCountry_id() {
          return country_id;
     }

     public float getProbability() {
          return probability;
     }
};



