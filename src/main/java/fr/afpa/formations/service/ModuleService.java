package fr.afpa.formations.service;

import fr.afpa.formations.model.Module;
import fr.afpa.formations.repository.ModuleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ModuleService {
    private final ModuleRepository moduleRepository;

    public List<Module> getAllModule() {
        return moduleRepository.findAll();
    }
    public void saveModule(Module module){
        moduleRepository.save(module);
    }

}
