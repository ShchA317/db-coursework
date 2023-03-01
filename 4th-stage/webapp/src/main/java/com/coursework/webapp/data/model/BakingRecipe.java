package com.coursework.webapp.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
@Table(name = "baking_recipe")
public class BakingRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "in", referencedColumnName = "id")
    private Thing input;
    @OneToOne
    @JoinColumn(name = "out", referencedColumnName = "id")
    private Thing out;
}



