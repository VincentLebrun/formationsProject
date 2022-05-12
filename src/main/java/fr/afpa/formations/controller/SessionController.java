package fr.afpa.formations.controller;

import fr.afpa.formations.model.Session;
import fr.afpa.formations.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/session")
public class SessionController {
    private final SessionService sessionService;

    @GetMapping("/list")
    public List<Session> sessionList() {
        return sessionService.getAllSession();
    }

    @PostMapping("/add")
    public Session addSession(@RequestBody Session session) {
        return sessionService.saveSession(session);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSession(@PathVariable Long id) {
        sessionService.deleteSessionById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateSession(@PathVariable Long id, @RequestBody Session session) {
        Session currentSession = sessionService.getSessionById(id);
        currentSession.setFinishDate(session.getFinishDate());
        currentSession.setInternList(session.getInternList());
        currentSession.setModuleList(session.getModuleList());
        currentSession.setPlace(session.getPlace());
        currentSession.setStartDate(session.getStartDate());
        currentSession.setFormation(session.getFormation());
        currentSession.setModuleList(session.getModuleList());
        return  ResponseEntity.ok(currentSession);
    }


}
