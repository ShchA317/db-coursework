package com.coursework.webapp.data.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
@Table(name = "craft_recipe")
public class CraftRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    protected Thing result;
}
