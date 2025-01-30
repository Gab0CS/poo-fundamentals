package com.gabo.prototypes;

import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.SoulStone;
import com.gabo.models.SpaceStone;
import com.gabo.models.TimeStone;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {
    
    public static StonePrototype<MindStone> mindPrototype = stone -> stone.getPrototype();
    public static StonePrototype<PowerStone> powerPrototype = stone -> stone.getPrototype();
    public static StonePrototype<RealityStone> realityPrototype = stone -> stone.getPrototype();
    public static StonePrototype<SoulStone> soulPrototype = stone -> stone.getPrototype();
    public static StonePrototype<SpaceStone> spacePrototype = stone -> stone.getPrototype();
    public static StonePrototype<TimeStone> timePrototype = stone -> stone.getPrototype();

}
