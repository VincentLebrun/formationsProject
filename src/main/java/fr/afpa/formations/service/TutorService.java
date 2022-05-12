package fr.afpa.formations.service;

import fr.afpa.formations.model.Tutor;
import fr.afpa.formations.repository.TutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorService {
    private final TutorRepository tutorRepository;

    public List<Tutor> getAllTutor() {
        return tutorRepository.findAll();
    }

    public Tutor saveTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public void deleteTutorById(Long id) {
        tutorRepository.deleteById(id);
    }

    public Tutor getTutorById(Long id) {
        return tutorRepository.findById(id).get();
    }
    public Tutor updateTutorById(Tutor tutor, Long id){
    Tutor currentTutor = getTutorById(id);
        currentTutor.setBirthDate(tutor.getBirthDate());
        currentTutor.setMail(tutor.getMail());
        currentTutor.setName(tutor.getName());
        currentTutor.setStartDate(tutor.getStartDate());
        currentTutor.setSurname(tutor.getSurname());
        currentTutor.setFormModule(tutor.getFormModule());
        return saveTutor(currentTutor);
    }
}
