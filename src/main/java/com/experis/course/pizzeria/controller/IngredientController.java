package com.experis.course.pizzeria.controller;

import com.experis.course.pizzeria.model.Ingredient;
import com.experis.course.pizzeria.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("ingredientList", ingredientService.getAll());
        model.addAttribute("ingredientObj", new Ingredient());
        return "ingredients/index";
    }
}
