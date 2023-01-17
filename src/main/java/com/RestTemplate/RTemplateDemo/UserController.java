package com.RestTemplate.RTemplateDemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping
public class UserController {


    private RestTemplate restTemplate;

    @GetMapping(value = "/api/user-management/user/tom")
    public User user(@RequestParam(value = "name", defaultValue = "tom") String name) {


        @RequestMapping("/getObject/name")


        public  class User1(@RequestParam(value = "name", defaultValue = "tom") String name) {

            String url = "https://api.genderize.io?name";
            User1 user1 = restTemplate.getForObject(url, User1.class);

            public User1 getUser1() {
                return user1;
            }

        }

        @RequestMapping("/getObjet/name")

        public class User2(@RequestParam(value = "name", defaultValue = "tom") String name) {

            String url = "https://api.agify.io?name";

            User2 user2 = restTemplate.getForObject(url, User2.class);


            public User2 getUser2() {
                return user2;
            }
        }

        @RequestMapping("/getObjet/name")

        public class user3(@RequestParam(value = "name", defaultValue = "tom") String name) {

            String url = "https://api.nationalize.io?name";

            User3 user3 = restTemplate.getForObject(url, User3.class);

            public User3 getUser3() {
                return user3;
            }

        }
    return new User();
    }

}







