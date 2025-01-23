package io.manojlearns.spring.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {


    @GetMapping("/")
    public String temp(){
            return("<h1>Welcome<h1>");
        }
    }


