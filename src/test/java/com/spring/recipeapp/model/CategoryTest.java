package com.spring.recipeapp.model;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CategoryTest {

    Category category;

    @BeforeAll
    public  void setUp() {
        category = new Category();

    }

    @Test
    void getDescription() throws Exception {
        String test = "This is a test";
        category.setDescription(test);
        assertEquals(test, category.getDescription());

    }
}