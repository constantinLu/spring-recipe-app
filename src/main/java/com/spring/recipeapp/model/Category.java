package com.spring.recipeapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity(name = "CATEGORY")
public class Category extends BaseEntity {

    @Column
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipe;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipe() {
        return recipe;
    }

    public void setRecipe(Set<Recipe> recipe) {
        this.recipe = recipe;
    }
}
