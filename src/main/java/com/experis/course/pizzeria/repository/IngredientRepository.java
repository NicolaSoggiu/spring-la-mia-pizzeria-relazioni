package com.experis.course.pizzeria.repository;

import com.experis.course.pizzeria.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
