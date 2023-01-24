package com.RestTemplate.RTemplateDemo;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {


    @Autowired
    private RestTemplate restTemplate;


   private  Genderize getGenderize(String name) {


        String url = "https://api.genderize.io/?name=" + name;

        Genderize getGenderize = restTemplate.getForObject(url, Genderize.class);


        return getGenderize;
    }


   private Agify getAgify(String name) {


        String url = "https://api.agify.io/?name=" + name;

        Agify getAgify = restTemplate.getForObject(url, Agify.class);
        return getAgify;
    }


    private Nationalize getNationalize(String name) {

        String url = "https://api.nationalize.io?name=" + name;
        Nationalize getNationalize = restTemplate.getForObject(url, Nationalize.class);


        return getNationalize;

    }


    @GetMapping("/api/user-management/user/{name}")
    public User getUser(@PathVariable("name") String name) {


        return new User(name, getAgify(name).getAge(), getGenderize(name).getGender(), getNationalize(name).getCountry().get(0).getCountry_id());

    }
}








