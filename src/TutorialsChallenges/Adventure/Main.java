package TutorialsChallenges.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location>  locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning java"));
        locations.put(1, new Location(1, "You are getting better with coding"));
        locations.put(2, new Location(2, "This is Magic"));
        locations.put(0, new Location(0, "Testing this mapping thing"));

        int loc = 1;
        while (true) {

            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            loc = in.nextInt();
            if (!locations.containsKey(loc)) {
                System.out.println("You cannot got iun that direction");
            }
        }
    }
}
