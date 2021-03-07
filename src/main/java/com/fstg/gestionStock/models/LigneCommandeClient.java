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
public class LigneCommandeClient extends AbstractEntity {

    private static final long serialVersionUID = -8924376577279240632L;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "commandeClient_id")
    private CommandeClient commandeClient;

    private BigDecimal quantity;
    private BigDecimal prixUnitaire;

}
