package fr.afpa.formations.service;

import fr.afpa.formations.model.Center;
import fr.afpa.formations.repository.CenterRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CenterService {

    private final CenterRepository centerRepository;

    public List<Center> getAll() {
        return centerRepository.findAll();
    }

    public void save(Center center) {
        centerRepository.save(center);
    }
}
