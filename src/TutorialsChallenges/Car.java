package TutorialsChallenges;

public class Car extends Vehicle  {

    private int wheels;
    private int door;
    private int gear;
    private boolean isManual;
    private int currentGear;

    public Car(String brand, String type, int wheels, int door, int gear, boolean isManual) {
        super(brand, type);
        this.wheels = wheels;
        this.door = door;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Gear Change to " +this.currentGear);
    }

    public void changeSpeed(int speed, int direction) {

        move(speed,direction);
        System.out.println("Speed "+speed+ " direction " + direction);
    }

    @Override
    public void stop() {
        super.stop();
    }
}
