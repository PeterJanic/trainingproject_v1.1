package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;

public abstract class AbstractTool extends AbstractActor {

    private int possibleUses;

    public AbstractTool(int possibleUses) {
        this.possibleUses = possibleUses;
    }

    public void use(){
        this.possibleUses--;
        if (this.possibleUses == 0) {
            getWorld().removeActor(this);
        }
    }

    public int getUsage() {
        return this.possibleUses;
    }

}
