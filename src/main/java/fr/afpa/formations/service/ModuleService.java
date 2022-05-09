package fr.afpa.formations.service;

import fr.afpa.formations.model.Module;
import fr.afpa.formations.repository.ModuleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class ModuleService {
    private final ModuleRepository  moduleRepository;

    public List<Module> getAllModule() {
        return moduleRepository.findAll();
    }

    public Module saveModule(Module module) {
        return moduleRepository.save(module);
    }

    public void deleteModuleById(Long id) {
        moduleRepository.deleteById(id);
    }

    public Module getModuleById(Long id) {
        return moduleRepository.findById(id).orElse(null);
    }
    public Module updateModuleId(Module module) {
        return  moduleRepository.save(module);
    }


}
