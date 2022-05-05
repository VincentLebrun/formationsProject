package fr.afpa.formations.repository;

import fr.afpa.formations.model.Center;
import fr.afpa.formations.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CenterRepository extends JpaRepository<Center, Long> {
    @Override
    Center getById(Long aLong);
}
