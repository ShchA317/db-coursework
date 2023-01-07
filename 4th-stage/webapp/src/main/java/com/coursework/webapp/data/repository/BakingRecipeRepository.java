package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.BakingRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BakingRecipeRepository extends JpaRepository<BakingRecipe, Integer> {
}
