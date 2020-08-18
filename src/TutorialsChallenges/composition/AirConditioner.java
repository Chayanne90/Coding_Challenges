package TutorialsChallenges.composition;

public class AirConditioner {

    private String capacity;
    private String mode;
    private int temperature;

    public AirConditioner(String capacity, String mode, int temperature) {
        this.capacity = capacity;
        this.mode = mode;
        this.temperature = temperature;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getMode() {
        return mode;
    }

    public int getTemperature() {
        return temperature;
    }

    public void turnOnAC() {
        System.out.println("Av on");
    }
}
