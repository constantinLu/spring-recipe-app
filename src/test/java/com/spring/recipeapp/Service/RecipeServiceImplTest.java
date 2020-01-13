package com.spring.recipeapp.Service;

import com.spring.recipeapp.model.Recipe;
import com.spring.recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;


    @BeforeAll
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() throws Exception {
        Recipe recipe = new Recipe();
        Set<Recipe> recipeData = new HashSet<>();
        recipeData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipeData);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(), 1);

        //verify the inner mocks.
        verify(recipeRepository, times(1)).findAll();


    }
}