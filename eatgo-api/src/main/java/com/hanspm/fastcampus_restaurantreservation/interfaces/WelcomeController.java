package com.hanspm.fastcampus_restaurantreservation.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String hello() {
        return "Hello Hans!!!";
    }
}
