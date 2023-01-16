package com.RestTemplate.RTemplateDemo;

import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;


@RestController
public class UserController {


    private RestTemplate restTemplate;

    @GetMapping(value = "/api/user-management/user/tom")
    public User user(@RequestParam(value = "name", defaultValue = "tom") String name, @RequestParam(value = "age", defaultValue = "39") Integer age,
                     @RequestParam(value = "gender", defaultValue = "male") String gender, @RequestParam(value = "nanationality",
            defaultValue = "CZ") String nationality) {

        return new User(name, age, gender, nationality);
    }

    @RequestMapping("name/tom")

    public User user1(String name,String gender) {

        String url = "https://api.genderize.io?name=tom";

        User user1 = restTemplate.getForObject(url, User.class);


        return user1(name="tom",gender);
    }

    @RequestMapping("name/tom")

    public User user2(String name,Integer age) {

        String url = "https://api.agify.io?name=tom";

        User user2 = restTemplate.getForObject(url, User.class);

        return user2(name="tom",age);
    }

    @RequestMapping("name/tom")

    public User user3(String name, String nationality) {

        String url = "https://api.nationalize.io?name=tom";

        User user3 = restTemplate.getForObject(url, User.class);

        return user3(name="tom",nationality="CZ");
    }
}




