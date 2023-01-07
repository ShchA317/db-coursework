package com.coursework.webapp.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
@Table(name = "craft_recipe")
public class CraftRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "a1", referencedColumnName = "id")
    private Thing a1;
    @OneToOne
    @JoinColumn(name = "a2", referencedColumnName = "id")
    private Thing a2;
    @OneToOne
    @JoinColumn(name = "a3", referencedColumnName = "id")
    private Thing a3;
    @OneToOne
    @JoinColumn(name = "a4", referencedColumnName = "id")
    private Thing a4;
    @OneToOne
    @JoinColumn(name = "a5", referencedColumnName = "id")
    private Thing a5;
    @OneToOne
    @JoinColumn(name = "a6", referencedColumnName = "id")
    private Thing a6;
    @OneToOne
    @JoinColumn(name = "a7", referencedColumnName = "id")
    private Thing a7;
    @OneToOne
    @JoinColumn(name = "a8", referencedColumnName = "id")
    private Thing a8;
    @OneToOne
    @JoinColumn(name = "a9", referencedColumnName = "id")
    private Thing a9;
    @OneToOne
    @JoinColumn(name = "result", referencedColumnName = "id")
    private Thing result;
}
