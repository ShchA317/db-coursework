package com.coursework.webapp.data.repository;

import com.coursework.webapp.data.model.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, Integer> {
}
