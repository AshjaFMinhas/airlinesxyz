package com.capgemini.airlinesxyz.controller;

import com.capgemini.airlinesxyz.model.Airplane;
import com.capgemini.airlinesxyz.repository.IAirplaneInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airplane")                            // Starten met airplane
public class AirplaneController {

    @Autowired
    IAirplaneInterface airplaneInterface;
    // Dependancy Injection

//    @GetMapping("/all")                                    // Alle airplanes laten zien
//    public Iterable<Airplane> getAirplanes() {}


}
