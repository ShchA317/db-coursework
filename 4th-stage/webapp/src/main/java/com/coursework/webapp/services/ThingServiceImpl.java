package com.coursework.webapp.services;

import com.coursework.webapp.data.repository.ThingRepository;
import com.coursework.webapp.data.model.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingServiceImpl implements ThingService{
    @Autowired
    private ThingRepository thingRepository;

    @Override
    public List<Thing> findAll() {
        return thingRepository.findAll();
    }
}
