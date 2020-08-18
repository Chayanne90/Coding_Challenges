package TutorialsChallenges;

import TutorialsChallenges.Car;

public class Toyota extends Car {

    private int roadService;

    public Toyota(int roadService) {
        super("4Runner", "TRD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentSpeed() + rate;

        if (newVelocity == 0){
            stop();
        }else if (newVelocity > 0 && newVelocity <=10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        }else if (newVelocity > 20 && newVelocity <=30){
            changeGear(3);
        }else {
            changeGear(4);
        }

        if (newVelocity >0) {
            changeSpeed(newVelocity, getCurrentDirection());
        }

    }
}
