package com.fstg.gestionStock.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Entreprise extends AbstractEntity {

    private static final long serialVersionUID = 23810552047963562L;
    @Column(name = "nom")
    private String nom;
    private String description;
    private String email;
    private String tel;
    @Embedded
    private Adresse adresse;
    private String codeFiscal;
    private String photo;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;


}
