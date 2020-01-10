package com.spring.recipeapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Recipe extends BaseEntity {

    @Column
    private Integer prepTime;

    @Column
    private Integer cockTime;

    @Column
    private Integer servings;

    @Column
    private String source;

    @Column
    private String url;

    @Column
    private String directions;

    @Column
    @Enumerated
    private Difficulty difficulty;

    @Column
    @Lob
    //large object storage
    //Blob type in sql.
    private Byte[] image;

    @Column
    @OneToOne(cascade = CascadeType.ALL)
    //cascade here (if we delete the recipe, delete the recipe)
    private Notes notes;

    @Column
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    // the mapping on the child class will be recipe. (Target property in the ingridient class).
    private Set<Ingredient> ingredients;


    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCockTime() {
        return cockTime;
    }

    public void setCockTime(Integer cockTime) {
        this.cockTime = cockTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
