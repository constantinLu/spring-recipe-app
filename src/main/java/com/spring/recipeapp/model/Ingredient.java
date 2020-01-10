package com.spring.recipeapp.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
public class Ingredient extends BaseEntity {

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
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private UnitofMeasure unitofMeasure;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


}
