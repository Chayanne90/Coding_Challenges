package TutorialsChallenges.composition;

public class Lamp {

    private String style;
    private int globRating;
    private boolean battery;

    public Lamp(String style, int globRating, boolean battery) {
        this.style = style;
        this.globRating = globRating;
        this.battery = battery;
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }
    public void turnOn(){
        System.out.println("Lamp-> turn on..");
    }
}
