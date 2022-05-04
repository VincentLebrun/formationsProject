package fr.afpa.formations.controller;

import fr.afpa.formations.model.Formation;
import fr.afpa.formations.service.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FormationController {
    private final FormationService formationService;
    @GetMapping("/formation")
    public String formationList(Model model) {
        List<Formation> formations = formationService.getAll();
        model.addAttribute("formations" , formations);
        return "";
    }
}
