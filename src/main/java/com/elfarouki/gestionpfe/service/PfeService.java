package com.elfarouki.gestionpfe.service;

import java.util.List;

import com.elfarouki.gestionpfe.entities.Pfe;

public interface PfeService {

    Pfe savePfe(Pfe pfe);
    Pfe updatePfe(Pfe pfe, Long id);
    Boolean deletePfe(Long id);
    Pfe getPfe(Long id);

    List<Pfe> getAllPfes();
}
