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

    public Center getCenterById(Long id) {
        return centerRepository.getById(id);
    }

    /**
     * public Center updateCenter(Center center) {
     * Center center1 = getCenterById(Center.getId());
     * center1.setName(center.getName());
     * }
     **/



}
