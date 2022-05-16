package fr.afpa.formations.controller;

import fr.afpa.formations.model.Formation;
import fr.afpa.formations.service.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/formation")
public class FormationController {
    private final FormationService formationService;

    @GetMapping("/")
    List<Formation> formationList() {
        return formationService.getAllFormation();
    }

    @PostMapping("/")
    public Formation addAddress(@RequestBody Formation formation) {
        return formationService.saveFormation(formation);
    }

    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable Long id, @RequestBody Formation formation) {
        formationService.deleteFormationById(id);
    }

    @PutMapping("/{id}")
    public Formation updateFormation(@PathVariable Long id, @RequestBody Formation formation) {
        Formation current = formationService.updateFormationById(formation, id);
        return current;
    }
}
