package challenges_java;

import java.util.Scanner;

public class datatypeChallenges {


    /* java dataType challenges: By chayanne */
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        try {
            long n = sc.nextLong();
            System.out.println(n+ " Can;t fitted in: ");

            if (n >= -128 && n <= 127) System.out.println("* byte");

        } catch (Exception e) {

            System.out.println(sc.next() + "can't be found anywhere.");
        }


    }
}
