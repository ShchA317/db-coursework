package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Integer> {
}
