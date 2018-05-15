package com.capgemini.airlinesxyz.controller;

import com.capgemini.airlinesxyz.model.Airplane;
import com.capgemini.airlinesxyz.repository.IAirplaneInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airplane")                            // Starten met airplane
public class AirplaneController {

    // Dependancy Injection
    @Autowired
    IAirplaneInterface airplaneInterface;

    // Create new airplane
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createAirplane(@RequestBody Airplane airplane) {
        this.airplaneInterface.save(airplane);
    }

    // Find all airplanes
    @RequestMapping(value = "all", method = RequestMethod.POST)
    public Iterable<Airplane> getAllAirplanes() {
        return this.airplaneInterface.findAll();
    }

    @RequestMapping(value = "delete/{String}", method = RequestMethod.DELETE)
    public Airplane deleteAirplane(@PathVariable String name) {
        if(airplaneInterface.findById(name).isPresent()){
            airplaneInterface.deleteById(name);
        }
        return null;
    }

}
