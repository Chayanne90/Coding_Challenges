package TutorialsChallenges.polymorphism;

public class healthyBurger extends Hamburger {

    public healthyBurger(String rollType, String meat, String name, double price) {
        super(rollType, meat, name, price);

    }

    private String healthyburgarAdditon1;
    private double healthyBurgerAdditioniprice1;

    private String healthyburgarAdditon2;
    private double healthyBurgerAdditioniprice2;

    public void addHeathyAddition1(String healthyburgarAdditon1, double price) {
        this.healthyburgarAdditon1 = healthyburgarAdditon1;
        this.healthyBurgerAdditioniprice1 = price;
    }

    public void addHeathyAddition2(String healthyburgarAdditon2, double price) {
        this.healthyburgarAdditon2 = healthyburgarAdditon2;
        this.healthyBurgerAdditioniprice2 = price;
    }

    @Override
    public double itemizeHamburger() {

        double healthyBurgerPrice = getPrice();


        if (this.healthyburgarAdditon1 != null) {
            healthyBurgerPrice += this.healthyBurgerAdditioniprice1;
            setPrice(healthyBurgerPrice);
            System.out.println("Added "+ this.healthyburgarAdditon1+" for extra " + this.healthyBurgerAdditioniprice1);
        }

        if (this.healthyburgarAdditon2 != null) {
            healthyBurgerPrice += this.healthyBurgerAdditioniprice2;
            setPrice(healthyBurgerPrice);
            System.out.println("Added "+ this.healthyburgarAdditon2+" for extra " + this.healthyBurgerAdditioniprice2);
        }

        return super.itemizeHamburger();
    }
}
