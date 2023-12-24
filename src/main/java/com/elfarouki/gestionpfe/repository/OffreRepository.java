package com.elfarouki.gestionpfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elfarouki.gestionpfe.entities.Offre;

public interface OffreRepository  extends JpaRepository<Offre,Long> {
}
