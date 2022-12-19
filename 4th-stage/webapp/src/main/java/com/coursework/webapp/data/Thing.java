package com.coursework.webapp.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="thing")
@ToString
public class Thing {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="name")
    private String name;

//    @Column(name="type")
//    private ThingType thingType;

    @Column(name="game_id")
    private String game_id;
}
