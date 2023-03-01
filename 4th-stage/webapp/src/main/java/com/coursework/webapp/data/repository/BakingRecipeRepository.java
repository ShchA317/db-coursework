package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.BakingRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BakingRecipeRepository extends JpaRepository<BakingRecipe, Integer> {
    @Query("select br from BakingRecipe br where br.out.id = ?1")
    List<BakingRecipe> findByResult(int result);
}
