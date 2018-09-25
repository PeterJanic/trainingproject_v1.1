package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;
import sk.tuke.oop.framework.Animation;

public class Cooler extends AbstractActor {

    private Reactor reactor;
    private boolean working;

    //private Animation fan; //= new Animation("images/fan.png", 32, 32, 200);

    public Cooler(Reactor reactor) {
        this.reactor = reactor;
        working = false;
        //Animation fan = new Animation("images/fan.png", 32, 32, 200);
        this.setAnimation(new Animation("images/fan.png", 32, 32, 200));
        //turnOff(); //preco animacka stale bezi?
    }

    public void turnOn() {
        working = true;
        getAnimation().start();
    }

    public void turnOff() {
        working = false;
        getAnimation().stop();
    }

    public boolean isOn() {
        return working;
    }

    public void act() {
        //dodelat podminky, sa mi nechcelo booooring stuff :D
        reactor.decreaseTemperature(1);
    }
}
