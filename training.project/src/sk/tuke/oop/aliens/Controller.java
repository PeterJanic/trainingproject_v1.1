package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;
import sk.tuke.oop.framework.Animation;

public class Controller extends AbstractActor {

    private Reactor reactor;

    public Controller(Reactor reactor) {
        this.reactor = reactor;
        setAnimation(new Animation("images/switch.png", 16, 16, 10));
    }

    public void toggle() {
        if(!reactor.isRunning())
            reactor.turnOn();
        else
            reactor.turnOff();
    }

}
