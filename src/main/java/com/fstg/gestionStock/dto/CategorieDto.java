package com.fstg.gestionStock.dto;

import com.fstg.gestionStock.models.Categorie;
import lombok.Data;
import lombok.Builder;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class CategorieDto {
    private Integer id;
    private String code;
    private String designation;
    private List<ArticleDto> articlesDto;
    // TODO use Model Mapper

}
