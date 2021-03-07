package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.Article;
import com.fstg.gestionStock.models.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStockDto {
    private Integer id;
    private ArticleDto articleDto;
    private BigDecimal quantity;
    private Instant dateMvt;
    private TypeMvtStk typeMvtStk;

}
