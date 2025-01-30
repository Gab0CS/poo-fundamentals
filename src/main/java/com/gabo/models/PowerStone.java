package com.gabo.models;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString
@Log
public class PowerStone extends Stone {

    private static final String COLOR = "Purple";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Orb";
    private static final int ENERGY_LEVEL = 19;

    public PowerStone() {
            super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }
    
    @Override
    public void usePower() {
        System.out.println("Increase power and energy" + super.toString());
    }

    public PowerStone getPrototype(){
        try(
            //Convert object into byte
            final var bos = new ByteArrayOutputStream();
            final var oos = new ObjectOutputStream(bos);
        ) {
            
            //Serialize and clone
            oos.writeObject(this);
            oos.flush();

            try (
                final var bis = new ByteArrayInputStream(bos.toByteArray());
                final var ois = new ObjectInputStream(bis);
            ) {
                return (PowerStone) ois.readObject();
            } 
        } catch (IOException | ClassNotFoundException e) {
            // TODO: handle exception
            log.warning("Can't cast or read class: ");
            throw new RuntimeException(e.getMessage());
        }
    }
}
