package com.elfarouki.gestionpfe.service;

import java.util.List;

import com.elfarouki.gestionpfe.entities.Etudiant;

public interface EtudiantService {

    Etudiant saveEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant, Long id);
    Boolean deleteEtudiant(Long id);
    Etudiant getEtudiant(Long id);

    List<Etudiant> getAllEtudiants();

}
