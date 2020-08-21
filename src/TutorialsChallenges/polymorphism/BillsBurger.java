package TutorialsChallenges.polymorphism;

public class BillsBurger {

    public static void main(String[] args) {

//        Hamburger hamburger = new Hamburger("white","chicken","basic", 5.00);
//        //hamburger.itemizeHamburger();
//        hamburger.addAddition1("Bacon", 2.00);
////        hamburger.addAddition2("Tomato", 1.50);
////        hamburger.addAddition3("Lettuce", 1.00);
//        hamburger.addAddition4("Cheese", 3.00);
//
//        System.out.println("the total is "+  hamburger.itemizeHamburger());
//
//        healthyBurger healthyBurger = new healthyBurger(" brown "," turky "," veggy ", 10.00);
//
//        healthyBurger.addAddition1("Lettuce", 6.80);
//        healthyBurger.addAddition2("Tomato",2.50);
//        healthyBurger.addHeathyAddition1("Bacon",3.00);
//        healthyBurger.addHeathyAddition2("lightMayo",0.50);
//        System.out.println("the total is "+  healthyBurger.itemizeHamburger());

        DeluxeHamburger dhamburger = new DeluxeHamburger();

        dhamburger.addAddition3("tomato", 2.30);
        dhamburger.addAddition1("Avocado", 1.80);
        System.out.println("You total is : "+ dhamburger.itemizeHamburger());




    }
}
