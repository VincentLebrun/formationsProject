package fr.afpa.formations.controller;


import fr.afpa.formations.model.Center;
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
    @GetMapping("/list")
    public List<Module > findModule() {
     return  moduleService.getAllModule();
    }
    @PostMapping("/addModule")
    public Module addModule(@RequestBody Module newModule) {
     return moduleService.saveModule(newModule);

    }
    @DeleteMapping("/delete/{id}")
    public void  deleteModule(@PathVariable Long id) {
        moduleService.deleteModuleById(id);
    }
    @PutMapping("/update/{id}")


/**   @Comment to  private Date dateIns = Date.from(new Date().toInstant());
 * to add date it's the best way
 private Instant dateInscri = Instant.now();
 **/


}
