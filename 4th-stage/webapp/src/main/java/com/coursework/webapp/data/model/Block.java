package com.coursework.webapp.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String picture_id;
    @Column
    private String type;
    @ManyToMany(mappedBy = "blocks")
    @JsonIgnoreProperties(value = "blocks")
    private List<Biome> biomes;

    @Override
    public String toString(){
        return String.format("name = %s picture_id = %s type = %s", name, picture_id, type);
    }
}
