package com.coursework.webapp.services;

import com.coursework.webapp.data.DataRepository;
import com.coursework.webapp.data.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingServiceImpl implements ThingService{
    @Autowired
    private DataRepository dataRepository;

    @Override
    public List<Thing> findAll() {
        return dataRepository.findAll();
    }
}
