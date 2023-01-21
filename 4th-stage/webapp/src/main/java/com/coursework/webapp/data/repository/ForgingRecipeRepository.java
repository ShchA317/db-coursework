package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.ForgingRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ForgingRecipeRepository extends JpaRepository<ForgingRecipe, Integer> {
    @Query("select fr from ForgingRecipe fr where fr.output.id = ?1")
    List<ForgingRecipe> findByResult(int result);
}
