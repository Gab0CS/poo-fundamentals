package com.gabo.factories;

import java.util.Optional;

import com.gabo.models.Stone;

import lombok.extern.java.Log;

@Log
public abstract class ConfigurableStoneFactory {

    public abstract Stone createStone();

    protected boolean isSingleton(){
        final var scopeOpt = Optional.of(System.getProperty("scope"));

        final var scope = scopeOpt.orElse("singleton");
        
         log.info("scope " + scope);
        return "singleton".equals(scope) ? true : false;
    }
}
