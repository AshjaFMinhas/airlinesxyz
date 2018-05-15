package com.capgemini.airlinesxyz.model;

public class Airplane {

    public String id;
    public boolean flying = true;
    public int currentFuel;
    public int maximumFuel = 500000;

    public Airplane() {}
    // Lege constructor

    public Airplane(String id, boolean flying, int currentFuel, int maximumFuel) {
        this.id = id;
        this.flying = flying;
        this.currentFuel = currentFuel;
        this.maximumFuel = maximumFuel;
    }

    public int getMaximumFuel() {
        return maximumFuel;
    }

    public void setMaximumFuel(int maximumFuel) {
        this.maximumFuel = maximumFuel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;

        if(flying) {
            currentFuel = currentFuel - 200000;
        }
    }
    // Als mijn vliegtuig vliegt, dan gaat er altijd 200.000 aan brandstof eraf.

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public void extraFuel(int fuelToFill) {
        currentFuel = currentFuel + fuelToFill;

        if (currentFuel == maximumFuel) {
            extraFuel(0);
        }
        // Als mijn vliegtuig currentfuel gelijk is aan maximumfuel dan kan er niks bij.

    }
}
