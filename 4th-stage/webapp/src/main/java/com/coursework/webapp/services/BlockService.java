package com.coursework.webapp.services;

import com.coursework.webapp.data.model.Block;
import com.coursework.webapp.data.repository.BiomeRepository;
import com.coursework.webapp.data.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockService {
    @Autowired
    private BlockRepository blockRepository;
    @Autowired
    private BiomeRepository biomeRepository;

    public List<Block> getBlocksInBiome(String biomeName){
        return biomeRepository.findByName(biomeName).getBlocks().stream().toList();
    }

    public List<Block> getAllBlocks() {
        return blockRepository.findAll();
    }
}
