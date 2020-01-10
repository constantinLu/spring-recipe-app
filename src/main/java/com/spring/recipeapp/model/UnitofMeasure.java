package com.spring.recipeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "UNIT_OF_MEASURE")
public class UnitofMeasure extends  BaseEntity {

    @Column
    private String description;

    @OneToOne
    private Ingredient ingredient;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
