package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.Biome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiomeRepository extends JpaRepository<Biome, Integer> {
    Biome findByName(String biomeName);
}
