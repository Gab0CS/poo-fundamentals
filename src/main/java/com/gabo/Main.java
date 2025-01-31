package com.gabo;

import java.util.Map;

import com.gabo.configs.StoneContext;
import com.gabo.factories.MindStoneFactory;
import com.gabo.factories.PowerStoneFactory;
import com.gabo.factories.RealityStoneFactory;
import com.gabo.factories.SoulStoneFactory;
import com.gabo.factories.SpaceFactory;
import com.gabo.factories.TimeStoneFactory;
import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.SoulStone;
import com.gabo.models.SpaceStone;
import com.gabo.models.Stone;
import com.gabo.models.TimeStone;
import com.gabo.prototypes.Prototypes;
import com.gabo.services.GaunletServiceImpl;
import com.gabo.singletons.MindStoneSingleton;
import com.gabo.singletons.RealityStoneSingleton;

public class Main {
    public static void main(String[] args) {
        

        final var gaunletService = StoneContext.setContext(
        pre->System.out.println("Do something"),
        post->System.out.println("Do something 2"));

        gaunletService.useFullPower();
        StoneContext.destroyContext(gaunletService);

    }
}
  