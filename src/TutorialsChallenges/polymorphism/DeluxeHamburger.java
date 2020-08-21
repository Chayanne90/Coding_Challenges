package TutorialsChallenges.polymorphism;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("White", "Double meet", "Deluxe", 15.60);
        super.addAddition1("Chipps",3.00);
        super.addAddition2("Drinks", 2.00);
    }

    @Override
    public void addAddition1(String addition1, double price) {
        System.out.println(addition1 + " Cannot be added");
    }

    @Override
    public void addAddition2(String addition2, double price) {
        System.out.println(addition2 + " Cannot be added");
    }

    @Override
    public void addAddition3(String addition3, double price) {
        System.out.println(addition3 + " Cannot be added");
    }

    @Override
    public void addAddition4(String addition4, double price) {
        System.out.println(addition4 + " Cannot be added");
    }
}
