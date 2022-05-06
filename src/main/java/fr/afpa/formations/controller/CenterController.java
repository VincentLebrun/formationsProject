package fr.afpa.formations.controller;

import fr.afpa.formations.model.Center;

import fr.afpa.formations.repository.CenterRepository;
import fr.afpa.formations.service.CenterService;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/center")
public class CenterController {
    private final CenterService centerService;
    private final CenterRepository centerRepository;


    public CenterController(CenterService centerService, CenterRepository centerRepository) {
        this.centerService = centerService;
        this.centerRepository = centerRepository;
    }

    @GetMapping("/all")
    List<Center> findCenter() {

        return centerService.getAllCenter();

    }

    @PostMapping("/add")
    public Center addCenter(@RequestBody Center center) {
        return centerService.saveCenter(center);
        //attention toujours via les services !!
    }


    /**
     @PutMapping("/update") public Center updateCenter(Model model, @RequestBody Center center) {

     }
     **/


}
