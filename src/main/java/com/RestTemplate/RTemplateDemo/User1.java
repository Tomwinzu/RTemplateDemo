package com.RestTemplate.RTemplateDemo;

public class User1 {

    private  String count;
    private String probability;
    private String name;
    private String gender;

    public String getCount() {
        return count;
    }

    public String getProbability() {
        return probability;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public  User1 (){

    }

    public User1(String count, String gender,String name, String probability) {
        this.count = count;
        this.probability = probability;
        this.name = name;
        this.gender = gender;
    }
}
