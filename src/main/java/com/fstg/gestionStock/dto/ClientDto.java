package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.Adresse;
import com.fstg.gestionStock.models.CommandeClient;
import lombok.Builder;
import lombok.Data;


import javax.persistence.Embedded;

import java.util.List;

@Data
@Builder
public class ClientDto {
    private Integer id;
    private String nom;


    private String prenom;

    private String photo;


    private String email;


    private String numTel;


    private List<CommandeClientDto> commandeClientsDto;

    private AdresseDto adresseDto;
}
