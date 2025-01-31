package com.gabo.services;

import java.lang.reflect.Field;
import java.util.Map;

import com.gabo.factories.MindStoneFactory;
import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.SoulStone;
import com.gabo.models.SpaceStone;
import com.gabo.models.Stone;
import com.gabo.models.TimeStone;
import com.gabo.singletons.RealityStoneSingleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor  
@NoArgsConstructor
public class GaunletServiceImpl implements GaunletService {

    // private final Stone mind;
    // private final Stone power;
    // private final Stone reality;
    // private final Stone soul;
    // private final Stone space;
    // private final Stone time;

    //Qualifier para solucionar el problema en Spring
    private MindStone mind;
    private PowerStone power;
    private RealityStone reality;
    private SoulStone soul;
    private SpaceStone space;
    private TimeStone time;

    @Override
    public void useGaunlet(String stoneName){
        switch (stoneName) {
            case "mind":
                log.info("Use stone " + this.mind);   
                break;
            case "power":
                log.info("Use stone " + this.power);   
                break;
            case "reality":
                log.info("Use stone " + this.reality);   
                break;
            case "soul":
                log.info("Use stone " + this.soul);   
                break;
            case "space":
                log.info("Use stone " + this.space);   
                break;
            case "time":
                log.info("Use stone " + this.time);   
                break;
            default:
                throw new IllegalArgumentException("Invalid name");
        }
    }
    public void useFullPower(){
        if(
            this.mind != null 
            && this.power != null 
            && this.reality != null 
            && this.soul !=null 
            && this.space != null 
            && this.time != null){
            log.info("Using all power");
        } else {
            throw new IllegalStateException("Can't be using full power if some fields are null");
        }
    }
    public void setStones(Map<String, Stone> stones){
        stones.forEach((fieldName, stoneDependency) -> {
            try {
                Field field = this.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(this,stoneDependency);//DI via reflection
                log.info("Dependency injection by field " + fieldName);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                // TODO: handle exception
                log.warning("Error on DI by fields");
            }
        });
    }
}
