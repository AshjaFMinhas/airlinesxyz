package com.capgemini.airlinesxyz.airplanetest;

import com.capgemini.airlinesxyz.model.Airplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

    private Airplane airplane;

    @Before
    public void setAirplane() {                         // Eerst een nieuwe Airplane opzetten.
        this.airplane = new Airplane();
    }

    @Test                                               // Simpele test om te zien dat fueltofull 5 ton is.
    public void correctLimitFuel() {
        int actual = this.airplane.extraFuel(500000);

        int expected = 500000;

        Assert.assertEquals(expected, actual);
    }
    @After                                              // Na de test weer Airplane resetten.
    public void destroyEverything() {
        this.airplane = null;
    }
}
