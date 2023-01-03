package com.coursework.webapp.data.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "craft_recipe")
public class CraftRecipe {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "a1")
    private int a1;

    @Column(name = "a2")
    private int a2;
    @Column(name = "a3")
    private int a3;
    @Column(name = "a4")
    private int a4;
    @Column(name = "a5")
    private int a5;
    @Column(name = "a6")
    private int a6;
    @Column(name = "a7")
    private int a7;
    @Column(name = "a8")
    private int a8;
    @Column(name = "a9")
    private int a9;
    @Column(name = "result")
    private int result;
}
