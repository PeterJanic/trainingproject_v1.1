package sk.tuke.oop.aliens;

public class SmartCooler extends Cooler{

    private Reactor reactor;
    private boolean working;

    public SmartCooler(Reactor reactor) {
        super(reactor);
        //working = false;
    }

//    @Override
//    public void act() {
//        reactor.decreaseTemperature(1);
//    }

    //proc  to nejde sakra

    @Override
    public void act(){
        if(working)reactor.decreaseTemperature(1);

        if(!working && reactor.getTemperature() > 2000){

            working = true;
        }
        else if (working && reactor.getTemperature() < 1000){
            working = false;
        }

    }



}
