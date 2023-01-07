package com.coursework.webapp.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "forging_recipe")
public class ForgingRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "input", referencedColumnName = "id")
    private Thing input;
    @OneToOne
    @JoinColumn(name = "output", referencedColumnName = "id")
    private Thing output;
    @OneToOne
    @JoinColumn(name = "source", referencedColumnName = "id")
    private Thing source;
    @Column
    private Integer experience;
}
