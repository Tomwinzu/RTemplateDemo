package com.RestTemplate.RTemplateDemo;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class UserController {


    private RestTemplate restTemplate;
          private User getUser;
            @RequestMapping("/getObject/gender")


       public User1  getUser1 (@PathVariable String name)  {

              User1 getUser1= new User1();
            String url = "https://api.genderize.io?name=tom";

            User1 getUser = restTemplate.getForObject(url, User1.class);

                  return getUser1;
            }


        @RequestMapping(value = "/getObjet/age" )

         public  User2 getUser2 (@PathVariable String name){

        String url = "https://api.agify.io?name=tom";

            User2 getUser2  = restTemplate.getForObject(url, User2.class);

            return getUser2 ;
            }

        @RequestMapping("/getObjet/country")

      public User3 getUser3(@PathVariable String name) {



              String url = "https://api.nationalize.io?name=tom";

            User3  getUser3 = restTemplate.getForObject(url, User3.class);

                           return  getUser3;

        }
    @GetMapping("/api/user-management/user/name=tom")
    public User getUser(@RequestParam(value = "name", defaultValue = "tom") String name) {



        return new User(getUser.getName(),getUser.getAge(),getUser.getGender(),getUser.getGender()) ;

    }

}







