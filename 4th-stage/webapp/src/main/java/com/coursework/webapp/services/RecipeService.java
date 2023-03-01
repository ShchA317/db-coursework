package com.coursework.webapp.services;

import com.coursework.webapp.data.model.BakingRecipe;
import com.coursework.webapp.data.model.CraftRecipe;
import com.coursework.webapp.data.model.ForgingRecipe;
import com.coursework.webapp.data.repository.BakingRecipeRepository;
import com.coursework.webapp.data.repository.CraftRecipeRepository;
import com.coursework.webapp.data.repository.ForgingRecipeRepository;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private BakingRecipeRepository bakingRecipeRepository;
    @Autowired
    private CraftRecipeRepository craftRecipeRepository;
    @Autowired
    private ForgingRecipeRepository forgingRecipeRepository;

    public List<CraftRecipe> findAllCraftRecipe(){
        return craftRecipeRepository.findAll();
    }

    public List<CraftRecipe> findCraftRecipesByResult(int recipeResult){
        return craftRecipeRepository.findByResult(recipeResult);
    }

    public List<BakingRecipe> findAllBackingRecipe() {
        return bakingRecipeRepository.findAll();
    }

    private List<BakingRecipe> findBackingRecipesByResult(int recipeResultId) {
        return bakingRecipeRepository.findByResult(recipeResultId);
    }

    public List<ForgingRecipe> findAllForgingRecipe() {
        return forgingRecipeRepository.findAll();
    }

    private List<ForgingRecipe> findForgingRecipesByResult(int recipeResultId) {
        return forgingRecipeRepository.findByResult(recipeResultId);
    }


    public List<Pair<?, String>> getAllRecipesByResult(int resultId) {
        List<Pair<?, String>> allRecipesByResult;
        var crafts = findCraftRecipesByResult(resultId)
                .stream()
                .map(e -> Pair.of(e, "CraftRecipe"))
                .toList();
        var bakings = findBackingRecipesByResult(resultId)
                .stream()
                .map(e -> Pair.of(e, "BakingRecipe"))
                .toList();
        var forgings = findForgingRecipesByResult(resultId)
                .stream()
                .map(e -> Pair.of(e, "ForgingRecipe"))
                .toList();

        allRecipesByResult = ListUtils.union(crafts, bakings);
        allRecipesByResult = ListUtils.union(allRecipesByResult, forgings);
        return allRecipesByResult;
    }
}
