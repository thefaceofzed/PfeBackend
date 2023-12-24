package com.elfarouki.gestionpfe.service;

import java.util.List;

import com.elfarouki.gestionpfe.entities.Encadrant;

public interface EncadrantService {

    Encadrant saveEncadrant(Encadrant encadrant);
    Encadrant updateEncadrant(Encadrant encadrant, Long id);
    Boolean deleteEncadrant(Long id);
    Encadrant getEncadrant(Long id);

    List<Encadrant> getAllEncadrants();
}
