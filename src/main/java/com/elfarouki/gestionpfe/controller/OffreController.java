package com.elfarouki.gestionpfe.controller;


import com.elfarouki.gestionpfe.entities.Offre;
import com.elfarouki.gestionpfe.service.OffreService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/offres")
public class OffreController {

    private final OffreService offreService;

    @PostMapping
    public Offre saveOffre(@RequestBody Offre offre){
        return offreService.saveOffre(offre);
    }

    @PutMapping("/{id}")
    public Offre updateOffre(Offre offre, Long id){
        return offreService.updateOffre(offre, id);
    }


    @DeleteMapping("/{id}")
    public Boolean deleteOffre(@PathVariable Long id){
        return offreService.deleteOffre(id);
    }


    @GetMapping("/{id}")
    public Offre getOffre(@PathVariable Long id){
        return offreService.getOffre(id);
    }

    @GetMapping
    public List<Offre> getAllOffres(){
        return offreService.getAllOffres();
    }

}
