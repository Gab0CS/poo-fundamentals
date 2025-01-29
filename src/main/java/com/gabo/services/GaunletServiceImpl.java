package com.gabo.services;

import com.gabo.models.RealityStone;
import com.gabo.models.Stone;
import lombok.extern.java.Log;

@Log
public class GaunletServiceImpl implements GaunletService {

    Stone reality = new RealityStone();

    @Override
    public void useGaunlet(String stoneName){
        log.info("Use stone " + reality);
    }
}
