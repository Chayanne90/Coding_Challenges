package TutorialsChallenges.composition;

public class Room {

    private Lamp lamp;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private AirConditioner ac;
    private Bed bed;

    public Room(Lamp lamp, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, AirConditioner ac, Bed bed) {
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.ac = ac;
        this.bed = bed;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed(){

        bed.make();
    }

    public void acOnorOff(boolean status){
        //System.out.println("Ac turn " + status);
        ac.turnOnAC(status);
    }



}
