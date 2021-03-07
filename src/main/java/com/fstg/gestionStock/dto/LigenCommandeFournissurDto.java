package com.fstg.gestionStock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigenCommandeFournissurDto {
    private Integer id;
    private CommandeFournisseurDto commandFournisseurDto;
    private ArticleDto articledto;
    private BigDecimal quantity;
    private BigDecimal prixUnitaire;
}
