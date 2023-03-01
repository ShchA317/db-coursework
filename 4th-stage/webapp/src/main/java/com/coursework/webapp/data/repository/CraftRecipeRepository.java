package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.CraftRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CraftRecipeRepository extends JpaRepository<CraftRecipe, Integer> {
    @Query("select cr from CraftRecipe cr where cr.result.id = ?1")
    List<CraftRecipe> findByResult(int recipeResult);
}
