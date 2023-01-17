package com.RestTemplate.RTemplateDemo;

public class User2 {
    private Integer age;

    private  String count;

    private String name;

    public User2() {
    }

    public User2(Integer age, String count, String name) {
        this.age = age;
        this.count = count;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
