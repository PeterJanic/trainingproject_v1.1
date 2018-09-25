package sk.tuke.oop.aliens;

import java.util.Random;

public class DefectiveLight extends Light {


    @Override
    public void act() {
        int random = (int) (Math.random()*20) + 1;
        if (random == 1){
            this.toggle();
        }
        else
            this.setElectricityFlow(true);
    }

}
