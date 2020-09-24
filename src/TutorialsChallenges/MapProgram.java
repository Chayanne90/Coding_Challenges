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


        System.out.println("==================================================================");

        if (languages.remove("Python", "an Interpreted, Object Oriented language")){

            System.out.println("python remove");
        } else {
            System.out.println("python not remove because the key/value dont match");
        }

        for (String key: languages.keySet()) {
            System.out.println("Key: "+key+ " Values: " + languages.get(key));
        }

        // replace(key, old value, new value)  for the replace method to work properly the
        // the old value have to match if is not then replace() will return false otherwise true
        System.out.println("==================================================================");
        if (languages.replace("Basic", "Biginners All purposes Symbolic Instruction Code", " Senior All purposes Symbolic Instruction Code")){

            System.out.println("Basic was replace");
        } else {
            System.out.println("basic was not replaced");
        }

        for (String key: languages.keySet()) {
            System.out.println("Key: "+key+ " Values: " + languages.get(key));
        }









    }
}
