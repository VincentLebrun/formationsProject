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
    public List<Formation> getAllFormation() {
        return formationRepository.findAll();
    }

    public Formation saveFormation(Formation formation) {
        formationRepository.save(formation);
        return formation;
    }

    public Formation getFormationById(Long id) {
        return formationRepository.getById(id);
    }

    public void deleteFormationById(Long id) {
         formationRepository.deleteById(id);
    }

    public Formation updateFormationById(Formation formation, Long id) {
        Formation currentFormation = getFormationById(id);
        currentFormation.setFormationName(formation.getFormationName());
        currentFormation.setSessionList(formation.getSessionList());
        currentFormation.setCenter(formation.getCenter());
        return saveFormation(currentFormation);
    }

}
