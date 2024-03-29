package com.coursework.webapp.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
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
