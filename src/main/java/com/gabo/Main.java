package com.gabo;

import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.Stone;
import com.gabo.services.GaunletServiceImpl;

public class Main {
    public static void main(String[] args) {
        
        final var gaunletService = new GaunletServiceImpl();
        gaunletService.useGaunlet("");
    }
     
}
