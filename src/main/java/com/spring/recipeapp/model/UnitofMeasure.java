package com.spring.recipeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class UnitofMeasure extends  BaseEntity {

    @Column
    private String uom;

    @Column
    @OneToOne
    private Ingredient ingredient;


    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
