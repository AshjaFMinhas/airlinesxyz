package com.capgemini.airlinesxyz.controller;

import com.capgemini.airlinesxyz.repository.IAirplaneInterface;
import com.capgemini.airlinesxyz.repository.IAirportInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airport")
public class AirportController {

    @Autowired
    IAirportInterface airportInterface;
    // Dependancy Injection


}
