package com.gabo.factories;
import com.gabo.models.PowerStone;
import com.gabo.models.Stone;
import com.gabo.prototypes.Prototypes;
import com.gabo.singletons.PowerStoneSingleton;

public class PowerStoneFactory extends ConfigurableStoneFactory{
    
    @Override
    public Stone createStone(){
        if(super.isSingleton()){
            return PowerStoneSingleton.getInstance();
        } else {
            return Prototypes.powerPrototype.buildPrototype(new PowerStone());
        }
    }
}
