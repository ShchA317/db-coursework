package com.coursework.webapp.services;

import com.coursework.webapp.data.model.BakingRecipe;
import com.coursework.webapp.data.model.CraftRecipe;
import com.coursework.webapp.data.model.ForgingRecipe;
import com.coursework.webapp.data.repository.BakingRecipeRepository;
import com.coursework.webapp.data.repository.CraftRecipeRepository;
import com.coursework.webapp.data.repository.ForgingRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<BakingRecipe> findAllBackingRecipe() {
        return bakingRecipeRepository.findAll();
    }

    public List<ForgingRecipe> findAllForgingRecipe() {
        return forgingRecipeRepository.findAll();
    }
}
