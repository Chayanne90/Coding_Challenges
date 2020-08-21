package TutorialsChallenges.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String rollType;
    private String meat;
    private String name;
    private double price;

    private String addition1;
    private double price1;
    private String addition2;
    private double price2;
    private String addition3;
    private double price3;
    private String addition4;
    private double price4;

    public Hamburger(String rollType, String meat, String name, double price) {

        this.rollType = rollType;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addAddition1(String addition1, double price) {
        this.addition1 = addition1;
        this.price1 = price;
    }

    public void addAddition2(String addition2, double price) {
        this.addition2 = addition2;
        this.price2 = price;
    }

    public void addAddition3(String addition3, double price) {
        this.addition3 = addition3;
        this.price3 = price;
    }

    public void addAddition4(String addition4, double price) {
        this.addition4 = addition4;
        this.price4 = price;
    }

    public double itemizeHamburger() {

        double burgerPrice = this.price;

        System.out.println(this.name + " hamburger " + "on a" + this.rollType + " roll price is "+ this.price );

        if (this.addition1 != null) {
            burgerPrice += this.price1;
            System.out.println("Added "+ this.addition1+" for extra " + this.price1);
        }

        if (this.addition2 != null) {
            burgerPrice += this.price2;
            System.out.println("Added "+ this.addition2+" for extra " + this.price2);
        }

        if (this.addition3 != null) {
            burgerPrice += this.price3;
            System.out.println("Added "+ this.addition3+" for extra " + this.price3);
        }

        if (this.addition4 != null) {
            burgerPrice += this.price4;
            System.out.println("Added "+ this.addition4+" for extra " + this.price4);
        }

        return burgerPrice;

    }


















    /*
    public String getOrderDescription(){

    }
    */

}
