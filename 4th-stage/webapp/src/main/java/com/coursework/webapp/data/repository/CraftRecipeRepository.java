package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.CraftRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftRecipeRepository extends JpaRepository<CraftRecipe, Integer> {
}
