package com.capgemini.airlinesxyz.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
public class Airplane {

    @ManyToOne(cascade = CascadeType.ALL )
    private List<Airplane> airplaneList;
    // Er moeten meerdere Airplanes in één airport kunnen

    public Airplane() {}
    // Lege constructor voor Airplane
}
