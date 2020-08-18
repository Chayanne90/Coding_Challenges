package TutorialsChallenges.composition;

public class main {

    public static void main (String [ ] args) {
    /*
        Dimensions dimensions = new Dimensions(14,50, 20);
        Case theCase = new Case("NZXT-510", "NZXT","240", dimensions);
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));
        motherboard theMotherboard = new motherboard("B550 Tomahack", "MSI",4, 5,"V2.0");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();*/

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,"Grey");
        Bed bed = new Bed("Moderm",4,2,1,1);
        AirConditioner ac = new AirConditioner("8,000","Cool", 60);
        Lamp lamp = new Lamp("Classic", 5,true);


        Room myRoom = new Room(lamp,wall1,wall2,wall3,wall4,ceiling,ac,bed);
        myRoom.acOnorOff(true);
        myRoom.makeBed();
        myRoom.getLamp().turnOn();



    }
}
