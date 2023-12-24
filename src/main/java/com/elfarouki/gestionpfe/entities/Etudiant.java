package com.elfarouki.gestionpfe.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Etudiant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String filiere;
    private String tel;

    @OneToOne(mappedBy = "etudiant")
    @JsonIgnore
    private Pfe pfe;

    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    private List<Offre> offres= new ArrayList<>();
}
