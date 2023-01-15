package com.RestTemplate.RTemplateDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class UserController {


        private RestTemplate restTemplate;

        @GetMapping(value = "/api/user-management/user/tom")
        public User user1(@RequestParam(value = "name", defaultValue = "tom") String name, @RequestParam(value = "age", defaultValue = "39") Integer age,
                          @RequestParam(value = "gender", defaultValue = "male") String gender, @RequestParam(value = "nanationality",
                defaultValue = "CZ") String nationality) {

            return new User(name, age, gender, nationality);
        }
        @RequestMapping("/user/name")

        public User user1 () {

            String url = "https://genderize.io";

            User user1 = restTemplate.getForObject(url, User.class);
            return user1;
        }

    }







