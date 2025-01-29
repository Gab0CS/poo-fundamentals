package com.gabo;

import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.Stone;

public class Main {
    public static void main(String[] args) {
        final var mind = new MindStone();

        final var power = new PowerStone();

        final var realityStone = new RealityStone();

        mind.usePower();

        System.out.println("--");

        power.usePower();
        System.out.println("--");

        realityStone.usePower();
    }
     
}
