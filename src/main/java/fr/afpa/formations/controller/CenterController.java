package fr.afpa.formations.controller;

import fr.afpa.formations.model.Center;

import fr.afpa.formations.repository.CenterRepository;
import fr.afpa.formations.service.CenterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/center")
public class CenterController {
    private final CenterService centerService;
    private final CenterRepository centerRepository;


    @GetMapping("/all")
    List<Center> findCenter() {

        return centerService.getAllCenter();

    }

    @PostMapping("/add")
    public Center addCenter(@RequestBody Center center) {
        return centerService.saveCenter(center);
        //attention toujours via les services !!
    }

    @DeleteMapping("delete/{id}")
    public void deleteCenter(@PathVariable Long id) {
        centerService.deleteCenterById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateCenter(@PathVariable Long id, @RequestBody Center center) {
        Center currentCenter = centerService.getCenterById(id);
        currentCenter.setAddress(center.getAddress());
        currentCenter.setForm(center.getForm());
        currentCenter.setName(currentCenter.getName());
        return ResponseEntity.ok(currentCenter);
    }
}
