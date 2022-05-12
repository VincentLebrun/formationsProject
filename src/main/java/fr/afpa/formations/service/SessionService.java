package fr.afpa.formations.service;

import fr.afpa.formations.model.Session;
import fr.afpa.formations.repository.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;

    public List<Session> getAllSession() {
        return sessionRepository.findAll();

    }

    public Session saveSession(Session session) {
        return sessionRepository.save(session);
    }

    public void deleteSessionById(Long id) {
        sessionRepository.deleteById(id);
    }

    public Session getSessionById(Long id) {
        return sessionRepository.findById(id).get();
    }

    public Session updateSessions(Session session, Long id) {
        Session currentSession = getSessionById(id);
        currentSession.setFinishDate(session.getFinishDate());
        currentSession.setInternList(session.getInternList());
        currentSession.setModuleList(session.getModuleList());
        currentSession.setPlace(session.getPlace());
        currentSession.setStartDate(session.getStartDate());
        currentSession.setFormation(session.getFormation());
        currentSession.setModuleList(session.getModuleList());
        return currentSession;
    }

}
