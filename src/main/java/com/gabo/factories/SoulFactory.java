package com.gabo.factories;

import com.gabo.models.SoulStone;
import com.gabo.models.Stone;
import com.gabo.prototypes.Prototypes;
import com.gabo.singletons.SoulStoneSingleton;

public class SoulFactory extends ConfigurableStoneFactory {
    
    @Override
    public Stone createStone(){
        if(super.isSingleton()){
            return SoulStoneSingleton.getInstance();
        } else {
            return Prototypes.soulPrototype.buildPrototype(new SoulStone());
        }
    }
}
