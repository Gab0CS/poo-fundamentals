package com.gabo.singletons;

import com.gabo.models.TimeStone;

import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor
public class TimeStoneSingleton {
    private static volatile TimeStone timeStoneInstance;

    public static TimeStone getInstance(){
        if(timeStoneInstance == null){
            log.info("Creating first instance: " + TimeStoneSingleton.class);
            synchronized(TimeStoneSingleton.class){
                timeStoneInstance = new TimeStone();
            }
        }
        return timeStoneInstance;
    }
    
}
