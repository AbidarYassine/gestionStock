package com.fstg.gestionStock.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Utilisateur extends AbstractEntity {

    private static final long serialVersionUID = -4257462925671219123L;
    private String nom;
    private String prenom;
    @Embedded
    private Adresse adresse;
    private Instant dateNaissance;
    private String password;
    private String email;
    private String photo;
    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;


}
