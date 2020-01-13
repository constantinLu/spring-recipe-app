package com.spring.recipeapp.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient extends BaseEntity {

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, Recipe recipe, UnitofMeasure unitofMeasure) {
        this.description = description;
        this.amount = amount;
        this.recipe = recipe;
        this.unitofMeasure = unitofMeasure;
    }

    @Column
    private String description;

    @Column
    private BigDecimal amount;

    @ManyToOne
    // no cascade here
    // only if delete recipe the ingredients will be deleted.
    // bi-directional relationship
    // target field for mapping
    private Recipe recipe;

    // its already by default as eager (but just showing how it can be done)
    @OneToOne(fetch = FetchType.EAGER)
    private UnitofMeasure unitofMeasure;


}
