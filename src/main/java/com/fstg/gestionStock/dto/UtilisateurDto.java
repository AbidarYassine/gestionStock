package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Instant dateNaissance;
    private String password;
    private String email;
    private String photo;
    private List<RoleDto> rolesDto;
    private EntrepriseDto entrepriseDto;
}
