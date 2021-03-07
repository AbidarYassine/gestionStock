package com.fstg.gestionStock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdresseDto {
    private Integer id;
    private String addresse1;
    private String addresse2;
    private String ville;
    private String codePostal;
    private String pays;
}
