package com.RestTemplate.RTemplateDemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class User {
    @JsonIgnoreProperties(ignoreUnknown = true)

    private String name;
    private int age;
    private String gender;
    private String nationality;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public User() {
    }

    public User(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }


}



