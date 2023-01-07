package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.ForgingRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForgingRecipeRepository extends JpaRepository<ForgingRecipe, Integer> {
}
