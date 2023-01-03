package com.coursework.webapp.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.CascadeType;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Biome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private boolean type;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "biome_block",
            joinColumns = @JoinColumn(name = "biome_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "block_id", referencedColumnName = "id"))
    @JsonIgnoreProperties(value = "biomes")
    private List<Block> blocks;
}
