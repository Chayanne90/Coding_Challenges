package TutorialsChallenges;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        // put is used to insert items to the map
        // if you try to put an item with tha same key it will override the
        // old value with the new one.
//
//        System.out.println();
        languages.put("Python", "an Interpreted, Object Oriented language");
        languages.put("JavaScript", "Script language");
        languages.put("Basic", "Biginners All purposes Symbolic Instruction Code");

        // get(key) by passing the key as parameter the get() method will return the value.
        //System.out.println(languages.get("Python"));
        languages.put("Java"," Object Oriented language");

        // containsKey(key) return true or false if the key(as parameters) exists in the HasMap
       /* if (languages.containsKey("Java")) {

            System.out.println("Java exists");
        } else {

            languages.put("Java"," Object Oriented language");
            System.out.println("Java added Successfully");
        }*/


        // keySet() it return all the key in the hashMap
        for (String key: languages.keySet()) {
            System.out.println("Key: "+key+ " Values: " + languages.get(key));
        }









    }
}
