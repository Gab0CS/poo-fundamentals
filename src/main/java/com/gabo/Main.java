package com.gabo;

import com.gabo.factories.PowerStoneFactory;
import com.gabo.factories.RealityStoneFactory;
import com.gabo.factories.TimeStoneFactory;
import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.Stone;
import com.gabo.prototypes.Prototypes;
import com.gabo.services.GaunletServiceImpl;
import com.gabo.singletons.MindStoneSingleton;
import com.gabo.singletons.RealityStoneSingleton;

public class Main {
    public static void main(String[] args) {
        System.setProperty("scope", "singleton");
        
        final var gaunletService = new GaunletServiceImpl();
        var realityFactory = new RealityStoneFactory();

        gaunletService.setReality(realityFactory.createStone());
        gaunletService.useGaunlet("reality");
    }
}
  