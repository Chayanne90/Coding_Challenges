package TutorialsChallenges;

public class Vehicle {


    private String brand;
    private String type;
    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String brand, String type) {

        this.brand = brand;
        this.type = type;

    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Steering at " + currentDirection + "Degrees");
    }

    public void move(int volicty, int direction){
        currentSpeed = volicty;
        currentDirection = direction;
        System.out.println("Moving at" + currentSpeed + "Indirection" + currentDirection);
    }

    public void stop() {
        this.currentSpeed = 0;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
