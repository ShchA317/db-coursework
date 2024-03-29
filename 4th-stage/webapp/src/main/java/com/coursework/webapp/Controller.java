package com.coursework.webapp;

import com.coursework.webapp.data.model.*;
import com.coursework.webapp.data.repository.BiomeRepository;
import com.coursework.webapp.services.BlockService;
import com.coursework.webapp.services.RecipeService;
import com.coursework.webapp.services.ThingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/controller")
public class Controller {
    @Autowired
    private ThingService thingService;
    @Autowired
    private BlockService blockService;
    @Autowired
    private BiomeRepository biomeRepository;
    @Autowired
    private RecipeService recipeService;

    @GetMapping("api/things")
    public List<Thing> getAllThings() {
        return thingService.findAll();
    }

    @GetMapping("/api/blocksByBiome")
    @ResponseBody
    public List<Block> getAllBlocksInBiome(@RequestParam String biomeName){
        log.info("получен запрос на получение блоков из биома \"{}\"", biomeName);
        return blockService.getBlocksInBiome(biomeName);
    }

    @GetMapping("/api/blocks")
    public List<Block> getAllBlocks(){
        log.info("получен запрос на получение всех блоков");
        return blockService.getAllBlocks();
    }

    @GetMapping("/api/biomes")
    public List<Biome> getAllBiomes(){
        log.info("получен запрос на получение всех биомов");
        return biomeRepository.findAll();
    }

    @GetMapping("/api/craftRecipes")
    public List<CraftRecipe> getAllCraftRecipe(){
        log.info("получен запрос на получение всех крафт-рецептов");
        return recipeService.findAllCraftRecipe();
    }

    @GetMapping("/api/bakingRecipes")
    public List<BakingRecipe> getAllBakingRecipe(){
        log.info("получен запрос на получение всех рецептов выпекания");
        return recipeService.findAllBackingRecipe();
    }

    @GetMapping("/api/forgingRecipes")
    public List<ForgingRecipe> getAllForgingRecipe(){
        log.info("получен запрос на получение всех рецептов ковки");
        return recipeService.findAllForgingRecipe();
    }

    @GetMapping("/api/allRecipesByResult")
    public List<Pair<?, String>> getAllRecipes(@RequestParam int recipeResultId){
        log.info("получен запрос на получение всех рецептов по результату");
        return recipeService.getAllRecipesByResult(recipeResultId);
    }
}
