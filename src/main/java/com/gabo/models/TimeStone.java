package com.gabo.models;

import lombok.ToString;

@ToString
public class TimeStone extends Stone {

    private static final String COLOR = "Green";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "Agamotto";
    private static final int ENERGY_LEVEL = 10;

    public TimeStone() {
            super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }
    
    @Override
    public void usePower() {
    // TODO Auto-generated method stub
    System.out.println("Control time" + super.toString());
    }
    
}
