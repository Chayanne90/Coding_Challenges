package challenges_java;

import java.util.Scanner;

public class datatypeChallenges {


    /* java dataType challenges: By chayanne */
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {

            try {

                long n = sc.nextLong();
                System.out.println(n+ " Can fitted in:");

                if (n >= -128 && n <= 127) System.out.println("* byte");

                if (n >= -32768 && n <= 32767) System.out.println("* short");

                if (n >= -Math.pow(2,31) &&  n <= Math.pow(2,31)) System.out.println("* int");

                if (n <= -Math.pow(2,64) &&  n >= Math.pow(2,64)-1) System.out.println("* long");

            } catch (Exception e) {

                System.out.println(sc.next() + "can't be found anywhere.");
            }

        }
    }
}
