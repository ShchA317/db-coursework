package com.coursework.webapp.services;

import com.coursework.webapp.data.model.CraftRecipe;
import com.coursework.webapp.data.repository.CraftRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    CraftRecipeRepository craftRecipeRepository;
    public List<CraftRecipe> findAllCraftRecipe(){
        return craftRecipeRepository.findAll();
    }
}
