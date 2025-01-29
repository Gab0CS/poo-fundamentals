package com.gabo.singletons;

import com.gabo.models.PowerStone;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class PowerStoneSingleton {

    private static volatile PowerStone powerStoneInstance;

    public static PowerStone getInstance() {
        if(powerStoneInstance == null){
            log.info("Creating first instance " + PowerStoneSingleton.class);
            synchronized(PowerStoneSingleton.class){
                //Must ask twice to verify because maybe two threads 
                //Can get at the same time 
                if(powerStoneInstance == null){
                    powerStoneInstance = new PowerStone();
                }
            }
        }
        return powerStoneInstance  ;
    }
}
