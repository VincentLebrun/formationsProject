package fr.afpa.formations.controller;

import fr.afpa.formations.model.Center;
import fr.afpa.formations.repository.CenterRepository;

import fr.afpa.formations.service.CenterService;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
public class CenterController {

    private final CenterRepository centerRepository;
    private final CenterService centerService;

    public CenterController(CenterRepository centerRepository, CenterService centerService) {
        this.centerRepository = centerRepository;
        this.centerService = centerService;
    }

    @GetMapping("/center")
    public String findCenter(Model model) {
        List<Center> centers = centerService.getAll();
        model.addAttribute("centers", centers);
        return "center";
    }

    @PostMapping("addCenter")
    public String addCenter(@ModelAttribute Center center) {
        centerService.save(center);
        return "redirect:/";

    }

}
