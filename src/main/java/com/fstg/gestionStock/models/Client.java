package com.fstg.gestionStock.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
@Builder
@Entity
public class Client  extends AbstractEntity{

	private static final long serialVersionUID = -8923886227464494872L;
	@Column(name = "nom",length = 20)
	private String nom;
	
	@Column(name="prenom",length = 20)
	private String prenom;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="email",length = 50)
	private String email;
	
	@Column(name="numTel",length = 20)
	private String numTel;
	
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;
	
	@Embedded
	private Adresse adresse;

}
