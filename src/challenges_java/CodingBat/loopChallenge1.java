package challenges_java.CodingBat;

import java.util.Scanner;

public class loopChallenge1 {

    /* Java Loop Challenge2  from HackerRank. BY Chayannne */

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // amount of query

        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            //querys
            for(int x = 0; x < n; x ++) {
                 a  = a + (int)Math.pow(2,x) * b;
                System.out.print(a +" ");
            }
            System.out.println(" ");
        }

        in.close();

    }
}
