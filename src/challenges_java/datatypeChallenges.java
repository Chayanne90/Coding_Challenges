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
                System.out.println(n+ " Can fitted in: ");

                if (n >= -128 && n <= 127) System.out.println("* byte");

                if (n >= -32768 && n <= 32767) System.out.println("* short");

                int num1 = (int)Math.pow(2,31)-1;

                if (n >= -(int)Math.pow(2,31) &&  n <= num1) System.out.println("* int");

                int num2 = (int)Math.pow(2,63)-1;

                if (n >= -(int)Math.pow(2,63) &&  n <= num2) System.out.println("* long");


            } catch (Exception e) {

                System.out.println(sc.next() + "can't be found anywhere.");
            }

        }
    }
}
