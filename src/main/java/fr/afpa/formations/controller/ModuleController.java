package fr.afpa.formations.controller;


import fr.afpa.formations.model.Module;
import fr.afpa.formations.repository.ModuleRepository;
import fr.afpa.formations.service.ModuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ModuleController {
    private final ModuleService moduleService;
    private final ModuleRepository moduleRepository;
    @GetMapping("/module")
    public String findModule(Model model) {
        List<Module> modules = moduleService.getAllModule();
        model.addAttribute("modules", modules);
        return "showModule";
    }

    @GetMapping("/module-form")
    public String moduleForm(Model model) {
        Module module = new Module();
        return "formModule";
    }

    @PostMapping("/addModule")
    public Module addModule(@RequestBody Module newModule) {
     return moduleService.saveModule(newModule);

    }


}
