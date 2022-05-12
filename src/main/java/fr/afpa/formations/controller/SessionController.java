package fr.afpa.formations.controller;

import fr.afpa.formations.model.Session;
import fr.afpa.formations.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/session")
public class SessionController {
    private final SessionService sessionService;

    @GetMapping("/")
    public List<Session> sessionList() {
        return sessionService.getAllSession();
    }

    @PostMapping("/")
    public Session addSession(@RequestBody Session session) {
        return sessionService.saveSession(session);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Long id) {
        sessionService.deleteSessionById(id);
    }

    @PutMapping("/{id}")
    public Session updateSession(@PathVariable Long id, @RequestBody Session session) {
         Session current = sessionService.updateSessions(session, id);
        return  current;
    }


}
