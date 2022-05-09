package fr.afpa.formations.service;
// import model

import fr.afpa.formations.model.Center;
//import repository
import fr.afpa.formations.repository.CenterRepository;
import org.springframework.stereotype.Service;
//import tools
import javax.persistence.EntityNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class CenterService {

    private final CenterRepository centerRepository;

    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public List<Center> getAllCenter() {
        return centerRepository.findAll();
    }


    public Center saveCenter(Center center) {
        return centerRepository.save(center);
    }

    public Center getCenterById(Long id) {
        return centerRepository.findById(id).get();
    }




}
