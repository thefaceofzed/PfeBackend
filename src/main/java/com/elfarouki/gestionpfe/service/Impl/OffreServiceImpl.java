package com.elfarouki.gestionpfe.service.Impl;

import com.elfarouki.gestionpfe.entities.Offre;
import com.elfarouki.gestionpfe.repository.OffreRepository;
import com.elfarouki.gestionpfe.service.OffreService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class OffreServiceImpl implements OffreService {


    private final OffreRepository offreRepository;


    @Override
    public Offre saveOffre(Offre offre) {
        return offreRepository.save(offre);
    }

    @Override
    public Offre updateOffre(Offre offre, Long id) {

        Offre o=getOffre(id);
        if(o!=null){

            o.setEntreprise(offre.getEntreprise());
            o.setStatus(offre.getStatus());

        }


        return offreRepository.save(o);
    }

    @Override
    public Boolean deleteOffre(Long id) {
        try{
            offreRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Offre> getAllOffres() {
        return  offreRepository.findAll();
    }

    @Override
    public Offre getOffre(Long id) {
        return offreRepository.findById(id).orElse(null);
    }
}
