package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;
import sk.tuke.oop.framework.Animation;

public class FireExtinguisher extends AbstractTool {

    public FireExtinguisher(){
        super(1);
        setAnimation(new Animation("images/extinguisher.png", 16, 16, 10));
    }

}
