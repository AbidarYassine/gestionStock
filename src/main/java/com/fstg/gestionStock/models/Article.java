package com.fstg.gestionStock.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
public class Article extends AbstractEntity {


	private static final long serialVersionUID = -8779123217040991323L;
	@Column(name = "codeArticle", length = 20,nullable = false)
	private String codeArticle;
	
	@Column(name = "designation", length = 150,nullable = false)
	private String designation;
	
	
	@Column(name = "prixUnitaire",nullable = false)
	private BigDecimal prixUnitaire;
	
	@Column(name = "tauxTva",nullable = false)
	private BigDecimal tauxTva;
	
	
	@Column(name = "prixUnitaireTtc",nullable = false)
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "photo",nullable = false)
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	
	

}
