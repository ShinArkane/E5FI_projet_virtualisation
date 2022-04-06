package com.example.Microservice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyWebService2 {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String hello(){
        return "Hello i am the microservice2 !";
    }

}
