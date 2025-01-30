package com.gabo.services;

import com.gabo.models.RealityStone;
import com.gabo.models.Stone;
import com.gabo.singletons.RealityStoneSingleton;

import lombok.extern.java.Log;

@Log
public class GaunletServiceImpl implements GaunletService {

    private final Stone reality = RealityStoneSingleton.getInstance();

    @Override
    public void useGaunlet(String stoneName){
        log.info("Use stone " + reality);
    }
}
