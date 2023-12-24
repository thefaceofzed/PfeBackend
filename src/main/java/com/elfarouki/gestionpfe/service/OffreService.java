package com.elfarouki.gestionpfe.service;

import java.util.List;

import com.elfarouki.gestionpfe.entities.Offre;

public interface OffreService {

    Offre saveOffre(Offre offre);
    Offre updateOffre(Offre offre, Long id);
    Boolean deleteOffre(Long id);
    List<Offre> getAllOffres();
    Offre getOffre(Long id);
}
