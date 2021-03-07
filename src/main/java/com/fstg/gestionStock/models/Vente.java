package com.fstg.gestionStock.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Vente extends AbstractEntity {

    private static final long serialVersionUID = 8481196936510836568L;
    private String code;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ventes;
    private Instant dateTime;
    private String commentaire;


}
