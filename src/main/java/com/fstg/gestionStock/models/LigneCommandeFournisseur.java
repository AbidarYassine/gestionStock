package com.fstg.gestionStock.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class LigneCommandeFournisseur extends AbstractEntity {

    private static final long serialVersionUID = 8350605497972239542L;


    @ManyToOne
    @JoinColumn(name = "commandFournisseur_id")
    private CommandFournisseur commandFournisseur;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;


    private BigDecimal quantity;
    private BigDecimal prixUnitaire;
}
