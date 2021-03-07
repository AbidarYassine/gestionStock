package com.fstg.gestionStock.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fstg.gestionStock.models.AbstractEntity;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

@Data
@Builder
public class ArticleDto {


    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaire;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;
    private CategorieDto categorie;


}
