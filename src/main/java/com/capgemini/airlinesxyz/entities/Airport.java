package com.capgemini.airlinesxyz.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Airport {

    @OneToMany(mappedBy = "Airport", cascade = CascadeType.ALL)
    public List<Airplane> airplaneList;
    // Een airport moet meerdere airplanes bevatten.

    public Airport() {}
    // Lege constructor voor Airport.

    public List<Airplane> getAirplaneList() {
        return airplaneList;
        // List kunnen opvragen van Airplanes die op het vliegveld staan.
    }
    public void getAirplaneList(List<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }
}
