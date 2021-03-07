package com.fstg.gestionStock.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class CommandeClient extends AbstractEntity {

    private static final long serialVersionUID = 5114723197271315949L;
    @Column(name = "ref")
    private String ref;
    @Column(name = "dateCommande")
    private Date dateCommande;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClient;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
