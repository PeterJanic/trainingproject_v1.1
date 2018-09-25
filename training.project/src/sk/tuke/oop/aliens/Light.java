package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;
import sk.tuke.oop.framework.Animation;

public class Light extends AbstractActor {

    private Animation lightOn;
    private Animation lightOff;
    private boolean isOn;
    private boolean isPowered;

    public Light() {
        lightOff = new Animation("images/light_off.png", 16, 16, 10);
        lightOn = new Animation("images/light_on.png", 16, 16, 10);
        isOn = false;
        setAnimation(lightOff);


    }

    public void toggle() {
        if(isOn)
            isOn = false;
        else
            isOn = true;
        updateAnimation();
    }

    public void setElectricityFlow(boolean logic) {
        isPowered = logic;
        updateAnimation();
    }

    private void updateAnimation()
    {
        if (isOn && isPowered)
            setAnimation(lightOn);
        else
            setAnimation(lightOff);
    }


}
