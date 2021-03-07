package com.fstg.gestionStock.models;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class CommandFournisseur extends AbstractEntity {

    private static final long serialVersionUID = -459013765328475512L;
    @Column(name = "code", length = 30)
    private String code;

    @Column(name = "dateCommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;


    // f one to many kayn mappedBy
    // f MantToOne kanzido Join Column
}
