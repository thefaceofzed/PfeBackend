package com.elfarouki.gestionpfe.service.Impl;

import com.elfarouki.gestionpfe.entities.Etudiant;
import com.elfarouki.gestionpfe.repository.EtudiantRepository;
import com.elfarouki.gestionpfe.service.EtudiantService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EtudinatServiceImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant, Long id) {
        Etudiant e=getEtudiant(id);
    if(e!=null){
            e.setNom(etudiant.getNom());
            e.setPrenom(etudiant.getPrenom());
            e.setEmail(etudiant.getEmail());
            e.setFiliere(etudiant.getFiliere());
            e.setTel(etudiant.getTel());
            e.setPfe(etudiant.getPfe());
        }
    return  etudiantRepository.save(e);
    }

    @Override
    public Boolean deleteEtudiant(Long id) {
        try{
            etudiantRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return  etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
