package com.fstg.gestionStock.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Categorie extends AbstractEntity {

	
	private static final long serialVersionUID = -1934635161835002640L;
	@Column(name = "code",length = 15)
	private String code;
	
	@Column(name = "designation",length = 50)
	private String designation;
	
	@OneToMany(mappedBy = "categorie")
	private List<Article>articles;

}
