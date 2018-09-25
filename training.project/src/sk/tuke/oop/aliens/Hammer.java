package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;
import sk.tuke.oop.framework.Animation;

public class Hammer extends AbstractTool {

    private Animation hammerAnimation  = new Animation("images/hammer.png", 16, 16, 10);

    public Hammer() {
        super(1);
        setAnimation(hammerAnimation);
    }

    public Hammer(int usage) {
        super(usage);
        setAnimation(hammerAnimation);
    }

}