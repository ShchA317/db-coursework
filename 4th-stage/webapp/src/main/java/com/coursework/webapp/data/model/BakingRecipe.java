package com.coursework.webapp.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "baking_recipe")
public class BakingRecipe {
    @EmbeddedId
    private BakingRecipeId id;
    @Column(insertable=false, updatable=false)
    private int in;
    @Column(insertable=false, updatable=false)
    private int out;

    @Embeddable
    public static class BakingRecipeId implements Serializable {
        @ManyToOne(optional = false)
        @JoinColumn(name = "in")
        private Thing input;

        @ManyToOne(optional = false)
        @JoinColumn(name = "out")
        private Thing output;
    }
}



