package TutorialsChallenges;

import TutorialsChallenges.Car;

public class Toyota extends Car {

    private int roadService;

    public Toyota(int wheels, int door, int gear, boolean isManual, int roadService) {
        super("4Runner", "TRD", 4, 4, 6, false);
        this.roadService = roadService;
    }
}
