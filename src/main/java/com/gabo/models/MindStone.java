package com.gabo.models;

import lombok.ToString;

@ToString

public class MindStone extends Stone {

    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Chitauri Specter";
    private static final int ENERGY_LEVEL = 20;

    public MindStone() {
            super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }
    
    @Override
    public void usePower() {

        System.out.println("Mind control in stone" + super.toString());
    }
}
