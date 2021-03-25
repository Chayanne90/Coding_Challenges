package TutorialsChallenges.Colletions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        /*Hash map*/
        Map<String, String> myMap = new HashMap<>();
        myMap.put("c","hello");
        myMap.put("b","hello");
        myMap.put("a", "");

        /*Hash set*/
        Set<String> mySet = new HashSet<>();
        mySet.add("hello");
        mySet.add("miguel");
        mySet.add(null);


        System.out.println(mySet);
    }








}
