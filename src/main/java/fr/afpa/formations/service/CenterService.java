package fr.afpa.formations.service;
// import model

import fr.afpa.formations.model.Center;
//import repository
import fr.afpa.formations.repository.CenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import tools
import java.util.List;


@Service
@RequiredArgsConstructor
public class CenterService {

    private final CenterRepository centerRepository;

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

    public Center updateCenterById(Center center, Long id) {
        Center currentCenter = getCenterById(id);
        currentCenter.setAddress(center.getAddress());
        currentCenter.setForm(center.getForm());
        currentCenter.setName(currentCenter.getName());
        return  saveCenter(currentCenter);
    }


}
