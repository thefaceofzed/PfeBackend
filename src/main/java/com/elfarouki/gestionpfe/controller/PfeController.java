package com.elfarouki.gestionpfe.controller;


import com.elfarouki.gestionpfe.entities.Pfe;
import com.elfarouki.gestionpfe.service.PfeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pfes")
public class PfeController {

    private final PfeService pfeService;

    @PostMapping
    public Pfe savePfe(@RequestBody Pfe pfe){
        return pfeService.savePfe(pfe);
    }


    @PutMapping("/{id}")
    public Pfe updatePfe(@RequestBody Pfe pfe,@PathVariable Long id){
        return pfeService.updatePfe(pfe, id);
    }


    @DeleteMapping("/{id}")
    public Boolean deletePfe(@PathVariable Long id){
        return pfeService.deletePfe(id);
    }


    @GetMapping("/{id}")
    public Pfe getPfe(@PathVariable Long id){
        return pfeService.getPfe(id);
    }


    @GetMapping
    public List<Pfe> getAllPfes(){
        return pfeService.getAllPfes();
    }
}
