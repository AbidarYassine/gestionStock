package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.Fournisseur;
import com.fstg.gestionStock.models.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;

    private String code;


    private Instant dateCommande;


    private FournisseurDto fournisseurDto;


    private List<LigenCommandeFournissurDto> ligneCommandeFournisseursDta;

}
