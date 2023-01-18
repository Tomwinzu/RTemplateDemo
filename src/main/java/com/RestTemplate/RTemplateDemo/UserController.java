package com.RestTemplate.RTemplateDemo;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class UserController {


@Autowired
    private RestTemplate restTemplate;
    private User getUser;

    @RequestMapping
    public User1 getUser1(String name) {


        String  url="https://api.genderize.io/?name=tom";

        User1 getUser1 = restTemplate.getForObject(url, User1.class);


      return getUser1 ;
    }



    public User2 getUser2(String name) {


        String url = "https://api.agify.io/?name=tom";

        User2 getUser2 = restTemplate.getForObject(url, User2.class);

        return getUser2;
    }



  /*  public User3 getUser3(String name) {


        String url = "https://api.nationalize.io?name=tom";

        User3 getUser3 = restTemplate.getForObject(url, User3.class);
        System.out.println(getUser3);
        return getUser3;

    }*/

    @GetMapping("/api/user-management/user/tom")
    public User getUser(@RequestParam(value="name",defaultValue = "tom") String name) {


        return new User("tom", getUser2("tom").getAge(),getUser1("tom").getGender());

    }
}








