package com.spring.recipeapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes extends BaseEntity {

    @Column
    @Lob
    //more than 255 chars.
    private String notes;

    @OneToOne
    //no cascade here (if we delete the notes , do not delete the recipe)
    private Recipe recipe;

    public Notes() {
    }
}
