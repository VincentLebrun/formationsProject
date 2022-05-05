package fr.afpa.formations.controller;

import fr.afpa.formations.model.Center;

import fr.afpa.formations.service.CenterService;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller
public class CenterController {
    private final CenterService centerService;

    public CenterController(CenterService centerService) {
        this.centerService = centerService;
    }

    @GetMapping("/center")
    public String findCenter(Model model) {
        List<Center> centers = centerService.getAll();
        model.addAttribute("centers", centers);
        return "center";
    }

    @PostMapping("/add-center")
    public String addCenter(@ModelAttribute Center center) {
        centerService.save(center);
        return "redirect:/center";
    }

    @GetMapping("/center-form")
    public String formCenterPage(Model model) {
        Center center = new Center();
        model.addAttribute("center", center);
        return "formCenter";
    }

    @GetMapping("center-detail")
    public String getCenterById(Model model, @RequestParam Long id) {
        Center center = centerService.getCenterById(id);
        model.addAttribute("center" , center);
        return "showCenterId";
    }

}
