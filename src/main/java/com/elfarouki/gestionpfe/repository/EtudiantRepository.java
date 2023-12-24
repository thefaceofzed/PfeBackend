package com.elfarouki.gestionpfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elfarouki.gestionpfe.entities.Etudiant;

public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
}
