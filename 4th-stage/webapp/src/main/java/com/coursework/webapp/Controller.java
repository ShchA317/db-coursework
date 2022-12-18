package com.coursework.webapp;

import com.coursework.webapp.services.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {
    @Autowired
    private ThingService thingService;

    @GetMapping
    public String getAllThings() {
        return thingService.findAll().toString();
    }
}
