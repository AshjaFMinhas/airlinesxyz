package com.capgemini.airlinesxyz.controller;

import com.capgemini.airlinesxyz.model.Airport;
import com.capgemini.airlinesxyz.repository.IAirportInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airport")
public class AirportController {

    @Autowired
    IAirportInterface airportInterface;
    // Dependancy Injection

    // Create Airports
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createAirport (@RequestBody Airport airport) {
        this.airportInterface.save(airport);
    }

    // Find all Airports
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Iterable<Airport> getAllAirports() {
        return this.airportInterface.findAll();
    }

    // Delete Airports by String
    @RequestMapping(value = "delete/{String}", method = RequestMethod.DELETE)
    public Airport deleteAirport(@PathVariable String name) {
        if(airportInterface.findById(name).isPresent()){
            airportInterface.deleteById(name);
        }
        return null;
    }



}
