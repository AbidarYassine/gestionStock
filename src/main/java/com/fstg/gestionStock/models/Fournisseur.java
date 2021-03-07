package com.fstg.gestionStock.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Fournisseur extends AbstractEntity {

    private static final long serialVersionUID = -5472665839808449918L;

    @Column(name = "nom", length = 20)
    private String nom;

    @Column(name = "prenom", length = 20)
    private String prenom;

    @Column(name = "photo", nullable = true)
    private String photo;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "numTel", length = 20)
    private String numTel;


    @OneToMany(mappedBy = "fournisseur")
    private List<CommandFournisseur> commandFournisseur;

    @Embedded
    private Adresse adresse;

}
