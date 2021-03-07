package com.fstg.gestionStock.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Role extends AbstractEntity {

    private static final long serialVersionUID = 884152122850928066L;


    @Column(length = 50)
    private String roleName;
    @Column(length = 512)
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;

}
