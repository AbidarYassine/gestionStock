package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.LigneVente;
import lombok.Builder;
import lombok.Data;

import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VenteDto {
    private Integer id;
    private String code;
    private List<LigneVenteDto> ventesDto;
    private Instant dateTime;
    private String commentaire;
}
