package com.fstg.gestionStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

    private Integer id;
    private String roleName;
    private String description;
    private UtilisateurDto utilisateurDto;
}
