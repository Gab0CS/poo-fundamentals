package com.gabo.factories;

import com.gabo.models.SpaceStone;
import com.gabo.models.Stone;
import com.gabo.prototypes.Prototypes;
import com.gabo.singletons.SpaceStoneSingleton;

public class SpaceFactory extends ConfigurableStoneFactory {
    
    @Override
    public Stone createStone(){
        if(super.isSingleton()){
            return SpaceStoneSingleton.getInstance();
        } else {
            return Prototypes.spacePrototype.buildPrototype(new SpaceStone());
        }
    }
}
