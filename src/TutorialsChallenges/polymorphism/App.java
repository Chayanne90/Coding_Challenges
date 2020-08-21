package TutorialsChallenges.polymorphism;
import TutorialsChallenges.composition.Case;

class Car {

    private boolean Engiene;
    private int Cylender;
    private String name;

    public Car(int cylender, String name) {
        this.Engiene = true;
        this.Cylender = cylender;
        this.name = name;
    }

    public int getCylender() {
        return Cylender;
    }

    public String getName() {
        return name;
    }

    public void StartEngiene(){
        System.out.println(" Is on");
    }

    public void accelerate(){
        System.out.println("Car acelerating");
    }
    public void brake(){
        System.out.println("Car Braking...");
    }
}

class Toyota extends Car {

    public Toyota(int cylender, String name) {
        super(cylender, name);
    }

    @Override
    public void accelerate() {
        System.out.println("4Runner is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("4Runner Braking....");
    }
}

class MercedezBenz extends Car {

    public MercedezBenz(int cylender, String name) {
        super(cylender, name);
    }

    @Override
    public void accelerate() {
        System.out.println("CL 500 is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("CL 500 Braking....");
    }
}

public class App {

    public static void main(String[] args) {

        Toyota toyota = new Toyota(4, "4Runner");
        System.out.print(toyota.getName());
        toyota.StartEngiene();
        toyota.accelerate();
        toyota.brake();

        Nissan nissan = new Nissan(6, "Murano");
        System.out.print(nissan.getName());
        nissan.StartEngiene();
        nissan.accelerate();
        nissan.brake();

    }
}
