package com.experis.course.pizzeria.service;

import com.experis.course.pizzeria.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;
}
