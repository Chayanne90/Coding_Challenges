package TutorialsChallenges.encapsulation;

public class main {

    public static void main(String[] args) {

        /*Player player = new Player("Chayanne", 200,"knife");
        System.out.println("Player health: "+ player.getPoints());*/

        Printer printer = new Printer(50,false);
        System.out.println("Initial page count " + printer.getAmountPagesPrinted());
        int pagesPrinted = printer.printing(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getAmountPagesPrinted());
        pagesPrinted = printer.printing(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getAmountPagesPrinted());

    }
}
