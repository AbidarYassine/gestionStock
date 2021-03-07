package com.fstg.gestionStock.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class MvtStock extends AbstractEntity {

    private static final long serialVersionUID = -4419511513225670138L;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    private BigDecimal quantity;
    private Instant dateMvt;


    private TypeMvtStk typeMvtStk;


}
