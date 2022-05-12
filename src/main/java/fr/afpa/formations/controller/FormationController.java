package fr.afpa.formations.controller;

import fr.afpa.formations.model.Formation;
import fr.afpa.formations.service.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FormationController {
    private final FormationService formationService;

    @GetMapping("/formation")
    public String formationList(Model model) {
        List<Formation> formations = formationService.getAll();
        model.addAttribute("formations", formations);
        return "showFormation";
    }

    @GetMapping("/formation-form")
    public String formationForm(Model model) {
        Formation formation = new Formation();
        model.addAttribute("formation", formation);
        return "formFormation";
    }

    @PostMapping("/add-formation")
    public String addAddress(@ModelAttribute Formation formation) {
        formationService.saveFormation(formation);
        return "redirect:/center";
    }

    @GetMapping("/formationDetail")
    public String getFormationById(Model model , @RequestParam Long id) {
        Formation formation = formationService.getFormationById(id);
        model.addAttribute("formations" , formation);
        return "showFormationId";
    }

}
