package com.fstg.gestionStock.dto;

import lombok.Builder;
import lombok.Data;



import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private Integer id;
    private String nom;
    private String description;
    private String email;
    private String tel;
    private AdresseDto adresse;
    private String codeFiscal;
    private String photo;
    private List<UtilisateurDto> utilisateursDto;
}
