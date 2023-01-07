package com.coursework.webapp.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "craft_recipe")
public class CraftRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "a1")
    private Integer a1;
    @Column(name = "a2")
    private Integer a2;
    @Column(name = "a3")
    private Integer a3;
    @Column(name = "a4")
    private Integer a4;
    @Column(name = "a5")
    private Integer a5;
    @Column(name = "a6")
    private Integer a6;
    @Column(name = "a7")
    private Integer a7;
    @Column(name = "a8")
    private Integer a8;
    @Column(name = "a9")
    private Integer a9;
    @Column(name = "result")
    private Integer result;
}
