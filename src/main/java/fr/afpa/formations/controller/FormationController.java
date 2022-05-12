package fr.afpa.formations.controller;

import fr.afpa.formations.model.Formation;
import fr.afpa.formations.service.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FormationController {
    private final FormationService formationService;

    @GetMapping("/")
    public String formationList(Model model) {
        List<Formation> formations = formationService.getAll();
        model.addAttribute("formations", formations);
        return "showFormation";
    }

    @GetMapping("/")
    public String formationForm(Model model) {
        Formation formation = new Formation();
        model.addAttribute("formation", formation);
        return "formFormation";
    }

    @PostMapping("/")
    public String addAddress(@ModelAttribute Formation formation) {
        formationService.saveFormation(formation);
        return "redirect:/center";
    }

    @GetMapping("/{id}")
    public String getFormationById(Model model, @RequestParam Long id) {
        Formation formation = formationService.getFormationById(id);
        model.addAttribute("formations", formation);
        return "showFormationId";
    }

    @PutMapping("/{id}")
    public Formation updateFormation(@PathVariable Long id, @RequestBody Formation formation) {
         Formation current = formationService.updateFormationById(formation,id);
         return  current;
    }
}
