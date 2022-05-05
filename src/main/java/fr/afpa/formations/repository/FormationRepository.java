package fr.afpa.formations.repository;
//Imports model
import fr.afpa.formations.model.Formation;
//Import tool jpa
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {
    @Override
    Formation getById(Long aLong);
}
