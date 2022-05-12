package fr.afpa.formations.controller;

import fr.afpa.formations.model.Center;

import fr.afpa.formations.repository.CenterRepository;
import fr.afpa.formations.service.CenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/center")
public class CenterController {
    private final CenterService centerService;
    private final CenterRepository centerRepository;


    @GetMapping("/")
    List<Center> findCenter() {
        return centerService.getAllCenter();
    }

    @PostMapping("/")
    public Center addCenter(@RequestBody Center center) {
        return centerService.saveCenter(center);
        //attention toujours via les services !!
    }

    @DeleteMapping("/{id}")
    public void deleteCenter(@PathVariable Long id) {
        centerService.deleteCenterById(id);
    }

    @PutMapping("/{id}")
    public Center updateCenter(@PathVariable Long id, @RequestBody Center center) {
       Center currentCenter = centerService.updateCenterById(center, id);
       return currentCenter;

    }
}
