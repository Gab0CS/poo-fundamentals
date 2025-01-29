package com.gabo.singletons;

import com.gabo.models.MindStone;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log

//Private Constructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MindStoneSingleton {

    private static volatile MindStone mindStoneInstance;

    public static MindStone getInstance() {
        if(mindStoneInstance == null){
            log.info("Creating first instance " + MindStoneSingleton.class);
            synchronized(MindStoneSingleton.class){
                //Must ask twice to verify because maybe two threads 
                //Can get at the same time 
                if(mindStoneInstance == null){
                    mindStoneInstance = new MindStone();
                }
            }
        }
        return mindStoneInstance;
    }

}
