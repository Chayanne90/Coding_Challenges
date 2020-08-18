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

    public void turnOnAC(boolean status) {
        if (status == true){

            System.out.println("Ac -> on...");
        }else if (status == false){
            System.out.println("Ac -> off...");
        }
    }
}
