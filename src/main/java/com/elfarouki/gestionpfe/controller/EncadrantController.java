package com.elfarouki.gestionpfe.controller;


import com.elfarouki.gestionpfe.entities.Encadrant;
import com.elfarouki.gestionpfe.service.EncadrantService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/encadrants")
@CrossOrigin(origins = "http://localhost:4200")
public class EncadrantController {

    private final EncadrantService encadrantService;


    @PostMapping
    public Encadrant saveEncadrant(@RequestBody Encadrant encadrant){
        return encadrantService.saveEncadrant(encadrant);
    }


    @PutMapping("/{id}")
    public Encadrant updateEncadrant(@RequestBody Encadrant encadrant,@PathVariable Long id){
        return encadrantService.updateEncadrant(encadrant, id);
    }


    @DeleteMapping("/{id}")
    public Boolean deleteEncadrant(@PathVariable Long id){
        return encadrantService.deleteEncadrant(id);
    }


    @GetMapping("/{id}")
    public Encadrant getEncadrant(@PathVariable Long id){
        return encadrantService.getEncadrant(id);
    }

    @GetMapping
    public List<Encadrant> getAllEncadrants(){
        return encadrantService.getAllEncadrants();
    }


}
