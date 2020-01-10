package com.spring.recipeapp.repositories;

import com.spring.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Similar with the Dao
 */
public interface RecipeRepository extends CrudRepository<Recipe,  Long> {

}
