package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.Vente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;
    private VenteDto venteDto;
    private BigDecimal quantity;
    private BigDecimal prixUnitaire;
}
