package com.fstg.gestionStock.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Adresse {
	@Id
	private long id;
	@Column(name="addresse1",length = 50)
	private String addresse1;
	@Column(name="addresse2",length = 50)
	private String addresse2;
	@Column(name="ville",length = 20)
	private String ville;
	@Column(name="codePostal",length = 10)
	private String codePostal;
	@Column(name="pays",length = 20)
	private String pays;
	

}
