package fr.afpa.formations.service;
// import model

import fr.afpa.formations.model.Center;
//import repository
import fr.afpa.formations.repository.CenterRepository;
import org.springframework.stereotype.Service;
//import tools
import java.util.List;


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

    public void deleteCenterById(Long id) {
        centerRepository.deleteById(id);
    }

    public Center getCenterById(Long id) {
        return centerRepository.findById(id).get();
    }


}
