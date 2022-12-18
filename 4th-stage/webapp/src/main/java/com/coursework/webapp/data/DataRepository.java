package com.coursework.webapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Thing, Integer> {
}
