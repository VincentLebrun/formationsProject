package fr.afpa.formations.controller;

import fr.afpa.formations.model.Tutor;
import fr.afpa.formations.repository.TutorRepository;
import fr.afpa.formations.service.TutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/tutor")
public class TutorController {
    private final TutorService tutorService;

    @GetMapping("/")
    List<Tutor> findTutor() {
        return tutorService.getAllTutor();
    }

    @PostMapping("/")
    public Tutor addTutor(@RequestBody Tutor tutor) {
        return tutorService.saveTutor(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteTutor(@PathVariable Long id) {
        tutorService.getTutorById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateTutor(@PathVariable Long id, @RequestBody Tutor tutor) {
        Tutor currentTutor = tutorService.getTutorById(id);
        currentTutor.setBirthDate(tutor.getBirthDate());
        currentTutor.setMail(tutor.getMail());
        currentTutor.setName(tutor.getName());
        currentTutor.setStartDate(tutor.getStartDate());
        currentTutor.setSurname(tutor.getSurname());
        currentTutor.setFormModule(tutor.getFormModule());
        return ResponseEntity.ok(currentTutor);

    }

}
