package com.elfarouki.gestionpfe.service.Impl;

import com.elfarouki.gestionpfe.entities.Encadrant;
import com.elfarouki.gestionpfe.repository.EncadrantRepository;
import com.elfarouki.gestionpfe.service.EncadrantService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EncadrantServiceImpl  implements EncadrantService {

    private final EncadrantRepository encadrantRepository;

    @Override
    public Encadrant saveEncadrant(Encadrant encadrant) {
        return encadrantRepository.save(encadrant);
    }

    @Override
    public Encadrant updateEncadrant(Encadrant encadrant, Long id) {

        Encadrant e=getEncadrant(id);
        if(e!=null){
            e.setNom(encadrant.getNom());
            e.setPrenom(encadrant.getPrenom());
            e.setSpecialite(encadrant.getSpecialite());
            e.setType(encadrant.getType());
            e.setTel(encadrant.getTel());
            e.setPfe(encadrant.getPfe());
        }
        return encadrantRepository.save(e);
    }

    @Override
    public Boolean deleteEncadrant(Long id) {
        try{
            encadrantRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Encadrant getEncadrant(Long id) {
        return encadrantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Encadrant> getAllEncadrants() {
        return encadrantRepository.findAll();
    }


}
