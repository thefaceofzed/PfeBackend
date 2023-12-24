package com.elfarouki.gestionpfe.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Encadrant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String specialite;
    private String type;
    private String tel;

    @ManyToOne
    @JsonIgnore
    private Pfe pfe;
}
