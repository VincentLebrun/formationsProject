package fr.afpa.formations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping({"/Hello"})
    public String tryJwt() {
        return "Hello world";
    }
}
