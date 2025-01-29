package com.gabo.models;

import lombok.ToString;

@ToString

public class SpaceStone extends Stone {

    private static final String COLOR = "Blue";
    private static final String NAME = "Space Stone";
    private static final String LOCATION = "Tesseract";
    private static final int ENERGY_LEVEL = 7;

    public SpaceStone(
        String color, 
        String name, 
        String location, 
        Integer energyLevel) {

        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
        
    }

    @Override
    public void usePower() {
        System.out.println("Manipulate space" + super.toString());
    }
    
} 