package com.gabo.factories;

import com.gabo.models.Stone;
import com.gabo.prototypes.Prototypes;
import com.gabo.singletons.RealityStoneSingleton;

public class RealityStoneFactory extends ConfigurableStoneFactory {
    
    @Override
    public Stone createStone(){
        if (super.isSingleton()) {
            return RealityStoneSingleton.getInstance();
        } else {
            return Prototypes.realityPrototype.buildPrototype(new com.gabo.models.RealityStone());
        }
    }
}
