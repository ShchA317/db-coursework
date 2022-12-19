package com.coursework.webapp.services;

import com.coursework.webapp.data.ThingRepository;
import com.coursework.webapp.data.Thing;
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
