package com.coursework.webapp.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
