package com.spring.recipeapp.controller;

import com.spring.recipeapp.Service.RecipeService;
import com.spring.recipeapp.model.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Set;


@Controller
public class IndexController {

    private final RecipeService recipeService;


    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        return "index";
    }


    @RequestMapping("/recipes")
    public String showRecipes(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
