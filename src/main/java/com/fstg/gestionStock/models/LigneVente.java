package com.fstg.gestionStock.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class LigneVente extends AbstractEntity {

    private static final long serialVersionUID = 7936161174992085159L;
    @ManyToOne
    @JoinColumn(name = "vente_id")
    private Vente vente;
    private BigDecimal quantity;
    private BigDecimal prixUnitaire;

}
