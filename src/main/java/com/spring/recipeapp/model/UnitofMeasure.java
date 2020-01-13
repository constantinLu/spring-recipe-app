package com.spring.recipeapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity(name = "UNIT_OF_MEASURE")
public class UnitofMeasure extends  BaseEntity {

    @Column
    private String description;

    @OneToOne
    private Ingredient ingredient;


}
