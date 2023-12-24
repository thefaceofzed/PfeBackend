package com.elfarouki.gestionpfe.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entreprise;
    private String status;

    @ManyToMany
    @JsonIgnore
            @JoinTable(name = "offre_etudiant",
                    joinColumns = @JoinColumn(name = "offre_id",referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn(name = "etudiant_id",referencedColumnName = "id"))
    List<Etudiant> etudiants = new ArrayList<>();;
}
