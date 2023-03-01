package com.coursework.webapp.data.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
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
    @Column(name="name", insertable=false, updatable=false)
    private String name;

//    @Column(name="type")
//    private ThingType thingType;

    @Column(name="game_id", insertable=false, updatable=false)
    private String game_id;
}
