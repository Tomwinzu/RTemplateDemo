package com.RestTemplate.RTemplateDemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class User {
    @JsonIgnoreProperties(ignoreUnknown = true)

    private String name;
    private int age;
    private String gender;
    private String country;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public User() {
    }

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


}



