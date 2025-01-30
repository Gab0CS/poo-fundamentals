package com.gabo.prototypes;

import com.gabo.models.Stone;

@FunctionalInterface
public interface StonePrototype<S extends Stone> {
    
    S buildPrototype(S stone);
    
    
}
