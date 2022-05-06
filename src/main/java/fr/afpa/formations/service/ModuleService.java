package fr.afpa.formations.service;

import fr.afpa.formations.model.Module;
import fr.afpa.formations.repository.ModuleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ModuleService {
    private final ModuleRepository moduleRepository;

    public List<Module> getAllModule() {
        return moduleRepository.findAll();
    }
    public Module saveModule(Module module){
       return moduleRepository.save(module);
    }
    public void  deleteModuleById( Long id) {
        moduleRepository.deleteById(id);
    }
    public Module

}
