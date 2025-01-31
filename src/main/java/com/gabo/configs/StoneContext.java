package com.gabo.configs;

import java.util.Map;
import java.util.function.Consumer;

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
import com.gabo.services.GaunletService;
import com.gabo.services.GaunletServiceImpl;

import lombok.extern.java.Log;

@Log
public class StoneContext {
    public GaunletService setContext(
        Consumer<Void> preConstruct,
        Consumer<Void> postConstruct
    ){
        log.info("ioc set scope");
        System.setProperty("scope", "singleton");
        
        log.info("Executing preconstruct");
        preConstruct.accept(null);

        //IoC
        log.info("Creating factories");
        var mindFactory = new MindStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var realityFactory = new RealityStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var timeFactory = new TimeStoneFactory();
        var spaceFactory = new SpaceFactory();

        log.info("ioc instance objects");
        MindStone mind = (MindStone) mindFactory.createStone();
        PowerStone power =  (PowerStone) powerFactory.createStone();
        RealityStone reality = (RealityStone) realityFactory.createStone();
        SoulStone soul = (SoulStone) soulFactory.createStone();
        TimeStone time = (TimeStone) timeFactory.createStone();
        SpaceStone space = (SpaceStone) spaceFactory.createStone();

        log.info("loading gaunletServiceImpl in container");
        final var gaunletService = new GaunletServiceImpl();


        Map<String, Stone> instances = Map.of(
            "mind", mind,
            "power", power,
            "reality", reality,
            "soul", soul,
            "time", time,
            "space", space
        );
        
        log.info("ioc DI on GaunletServideImpl");
        gaunletService.setStones(instances);

        log.info("ioc executing post construct");
        postConstruct.accept(null);

        return gaunletService;
    }
}
