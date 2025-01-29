package com.gabo.models;

import lombok.ToString;

@ToString
public class RealityStone extends Stone {

    private static final String COLOR = "Red";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "Aether";
    private static final int ENERGY_LEVEL = 15;

    public RealityStone() {
            super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }
    
    @Override
    public void usePower() {
        System.out.println("Altering reality" + super.toString());
    }
}
