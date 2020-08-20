package TutorialsChallenges.encapsulation;

public class Printer {

    /* Instance Varaibles */
    private int inklevel = 100;
    private int amountPagesPrinted;
    private boolean duplex;

    public Printer(int inklevel, boolean duplex) {

        if (this.inklevel >-1 && this.inklevel<=100) {
            this.inklevel = inklevel;
        } else {
            this.inklevel = -1;
        }
        this.duplex = duplex;
        this.amountPagesPrinted = 0;
    }

    /* Getters */
    public int getAmountPagesPrinted() {

        return amountPagesPrinted;
    }

    public int addInk(int amount) {

        if(amount > 0 && amount <= 100) {
            if (this.inklevel + amount > 100){
                return -1;
            }
            this.inklevel += amount;
            return this.inklevel;

        } else {
            return -1;
        }
    }

    public int printing(int pages) {

        int pagesPrint = pages;
        if (this.duplex) {
            pagesPrint = (pages/2) + (pages %2);
            System.out.println("Printing in duplex mode");
        }
        this.amountPagesPrinted += pagesPrint;
        return pagesPrint;
    }
}
