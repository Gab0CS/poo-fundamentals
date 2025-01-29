package com.gabo.singletons;

import com.gabo.models.SoulStone;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {
    
    private static volatile SoulStone soulStoneInstance;

    public static SoulStone getInstance(){
        if(soulStoneInstance == null){
            log.info("Creating first instance: " + SoulStoneSingleton.class);
            synchronized(SoulStoneSingleton.class){
                soulStoneInstance = new SoulStone();
            }
        }
        return soulStoneInstance;
    }
    
}
