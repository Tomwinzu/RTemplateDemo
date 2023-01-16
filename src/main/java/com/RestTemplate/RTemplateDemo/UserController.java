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
    public User user(@RequestParam(value = "name", defaultValue = "tom") String name)  {
        @RequestMapping("/getObjet")

        public class  user1 (@RequestParam (value = "name",defaultValue = "tom") String name ) {

            String url = "https://api.genderize.io?name";

      Object user1 = restTemplate.getForObject(url, Object.class);


            return  user1;
        }

        @RequestMapping("/getObjet")

        public class  user2(@RequestParam (value = "name",defaultValue = "tom") String name ) {

            String url = "https://api.agify.io?name";

            Object user2 = restTemplate.getForObject(url, Object.class);

            return user2;
        }

        @RequestMapping("/getObjet")

        public class  user3(@RequestParam (value = "name",defaultValue = "tom") String name ) {

            String url = "https://api.nationalize.io?name";

            Object user3 = restTemplate.getForObject(url, Object.class);

            return user3;
        }
        return User(name,user2,user1,user3);
    }


}




