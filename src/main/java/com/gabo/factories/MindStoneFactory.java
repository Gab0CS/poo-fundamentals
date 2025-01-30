package com.gabo.factories;
import com.gabo.models.MindStone;
import com.gabo.models.Stone;
import com.gabo.prototypes.Prototypes;
import com.gabo.singletons.MindStoneSingleton;

public class MindStoneFactory extends ConfigurableStoneFactory{
    
    @Override
    public Stone createStone(){
        if(super.isSingleton()){
            return MindStoneSingleton.getInstance();
        } else {
            return Prototypes.mindPrototype.buildPrototype(new MindStone());
        }
    }
}
