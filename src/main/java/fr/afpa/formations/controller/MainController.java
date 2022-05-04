package fr.afpa.formations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    //just to have main
    @GetMapping("/")
    public String index(Model model) {
        String name = "Vincent";
        model.addAttribute("name" , name);
        return "index";
    }

}
