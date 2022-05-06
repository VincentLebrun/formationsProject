package fr.afpa.formations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.afpa.formations.model.Module;
@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
    /**
   
    Module getById(Long aLong);
    **/
}
