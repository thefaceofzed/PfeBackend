package com.elfarouki.gestionpfe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Pfe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ref;
    private String entreprise;
    private String sujet;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateFin;

    @OneToOne
    @JsonIgnore
    private Etudiant etudiant;

    @OneToMany(mappedBy = "pfe")
    @JsonIgnore
    private List<Encadrant> encadrants = new ArrayList<>();;
}
