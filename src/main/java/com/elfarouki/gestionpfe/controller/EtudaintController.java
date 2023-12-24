package com.elfarouki.gestionpfe.controller;


import com.elfarouki.gestionpfe.entities.Etudiant;
import com.elfarouki.gestionpfe.service.EtudiantService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiants")
@CrossOrigin(origins = "http://localhost:4200")
public class EtudaintController {

    private final EtudiantService etudiantService;

    @PostMapping
    public Etudiant saveEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.saveEtudiant(etudiant);
    }


    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant,@PathVariable Long id){
        return etudiantService.updateEtudiant(etudiant, id);
    }


    @DeleteMapping("/{id}")
    public Boolean deleteEtudiant(@PathVariable Long id){
        return etudiantService.deleteEtudiant(id);
    }


    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable Long id){
        return etudiantService.getEtudiant(id);
    }

    @GetMapping
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.getAllEtudiants();
    }

}
