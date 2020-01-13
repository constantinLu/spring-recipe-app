package com.spring.recipeapp.model;


import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity(name = "CATEGORY")
@EqualsAndHashCode(exclude = {"recipe"})
public class Category extends BaseEntity {

    @Column
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipe;


}
