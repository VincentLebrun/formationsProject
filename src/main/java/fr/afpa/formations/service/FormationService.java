package fr.afpa.formations.service;

import fr.afpa.formations.model.Formation;
import fr.afpa.formations.repository.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {
    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    // show all formations
    public List<Formation> getAll() {
        return formationRepository.findAll();
    }

    public void saveFormation(Formation formation) {
        formationRepository.save(formation);
    }

    public Formation getFormationById( Long id) {
        return  formationRepository.getById(id);
    }


}
