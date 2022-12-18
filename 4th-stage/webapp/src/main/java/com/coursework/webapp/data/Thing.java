package com.coursework.webapp.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
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
