package com.fstg.gestionStock.dto;


import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {
    private Integer id;

    private String ref;

    private Instant dateCommande;

    private List<LigneCommandeClientDto> ligneCommandeClientDto;


    private ClientDto clientDto;
}
