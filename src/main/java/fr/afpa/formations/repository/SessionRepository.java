package fr.afpa.formations.repository;

import fr.afpa.formations.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
