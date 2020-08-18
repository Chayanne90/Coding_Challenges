package TutorialsChallenges.composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powerButton;
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerButton, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerButton = powerButton;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerButton() {
        return powerButton;
    }

    public void setPowerButton(String powerButton) {
        this.powerButton = powerButton;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void setDimension(Dimensions dimension) {
        this.dimension = dimension;
    }
}
