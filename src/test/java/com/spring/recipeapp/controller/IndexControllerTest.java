package com.spring.recipeapp.controller;

import com.spring.recipeapp.Service.RecipeService;
import com.spring.recipeapp.model.Recipe;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;


    @BeforeAll
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new IndexController(recipeService);
    }

    //TESTING SPRING MVC CONTEXT.
    @Test
    public void testMockMVC() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));

    }

    @Test
    void showRecipes() {

        //given
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());
        recipes.add(new Recipe());

        when(recipeService.getRecipes()).thenReturn(recipes);

//        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
//
//        String viewName = controller.getIndexPage(model);
//        assertEquals("index", viewName);
//
//        //verify the mocks
////        verify(recipeService, times(1)).getRecipes();
//          verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
//          Set<Recipe> setIntController = argumentCaptor.getValue();
//          assertEquals(2, setIntController.size());
//    }
    }
}