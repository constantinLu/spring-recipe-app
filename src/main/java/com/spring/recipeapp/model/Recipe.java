package com.spring.recipeapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Recipe extends BaseEntity {

    @Lob
    private String description;

    private Integer prepTime;

    private Integer cookTime;

    private Integer servings;

    private String source;

    private String url;

    @Lob
    private String directions;


    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @Lob
    //large object storage
    //Blob type in sql.
    private Byte[] image;


    @OneToOne(cascade = CascadeType.ALL)
    //cascade here (if we delete the recipe, delete the recipe)
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    // the mapping on the child class will be recipe. (Target property in the ingridient class).
    private Set<Ingredient> ingredients = new HashSet<>();

    // specify a JoinTable for the category relationship
    @ManyToMany
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();


}
