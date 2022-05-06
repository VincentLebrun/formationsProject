package fr.afpa.formations.controller;


import fr.afpa.formations.model.Module;
import fr.afpa.formations.service.ModuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class ModuleController {
    private final ModuleService moduleService;

    @GetMapping("/module")
    public String findModule(Model model) {
        List<Module> modules = moduleService.getAllModule();
        model.addAttribute("modules", modules);
        return "showModule";
    }

    @PostMapping("/add-module")
    public String addModule(@ModelAttribute Module module) {
        moduleService.saveModule(module);
        return "redirect:/center";
    }


}
