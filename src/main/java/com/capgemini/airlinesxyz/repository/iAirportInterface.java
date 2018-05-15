package com.capgemini.airlinesxyz.repository;

import com.capgemini.airlinesxyz.model.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Maakt lijst van Airports

@Repository
public interface IAirportInterface extends CrudRepository<Airport, String> {
}
