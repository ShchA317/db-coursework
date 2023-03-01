package com.coursework.webapp.data.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
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
