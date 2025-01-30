package com.gabo.factories;

import com.gabo.models.Stone;
import com.gabo.models.TimeStone;
import com.gabo.prototypes.Prototypes;
import com.gabo.singletons.TimeStoneSingleton;

public class TimeStoneFactory extends ConfigurableStoneFactory {
    
    @Override
    public Stone createStone(){
        if(super.isSingleton()){
            return TimeStoneSingleton.getInstance();
        } else {
            return Prototypes.timePrototype.buildPrototype(new TimeStone());
        }
    }
}
