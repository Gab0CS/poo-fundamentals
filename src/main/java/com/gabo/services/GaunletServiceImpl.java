package com.gabo.services;

import com.gabo.models.RealityStone;
import com.gabo.models.Stone;
import com.gabo.singletons.RealityStoneSingleton;

import lombok.Setter;
import lombok.extern.java.Log;

@Log
@Setter
public class GaunletServiceImpl implements GaunletService {

    private Stone reality;

     public GaunletServiceImpl(){

     }

    @Override
    public void useGaunlet(String stoneName){
        switch (stoneName) {
            case "reality":
                log.info("Use stone " + reality);   
                break;
            
            default:
                throw new IllegalArgumentException("Invalid name");
        }
    }
    public void useFullPower(){

    }
}
