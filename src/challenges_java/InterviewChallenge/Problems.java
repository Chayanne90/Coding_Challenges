package challenges_java.InterviewChallenge;

import java.util.HashMap;

public class Problems {

    public static void welshOrder (String [] arr) {

        String [] welshAlphabet = {"a","b","c","ch","d","dd","e","f","ff"
                                  ,"g","ng","h","i","l","ll","m","n","o","p","ph"
                                  ,"r","rh","s","t","th","u","w","y"};

        HashMap<String, String> welshMap = new HashMap<>();
        String [] newArr = new String[arr.length];

        for (int i = 0; i < welshAlphabet.length; i++) {
            welshMap.put(welshAlphabet[i],welshAlphabet[i]);
        }
        
        String oneLetter ="";
        //String secondChar = "";

        int temp = 0;

        for (int j = 0; j < arr.length; j++) {
            oneLetter = arr[j].substring(0,2);

            System.out.println(arr[j]);
            for (int x = 0; x < welshAlphabet.length; x++) {

                if((welshMap.containsValue(oneLetter))&& oneLetter.equals(welshAlphabet[x])) {
                    System.out.println("positiopn in alphabet - >"+x);
                } else if ((welshMap.containsValue(arr[j].substring(0,1)))&& arr[j].substring(0,1).equals(welshAlphabet[x])){
                    //System.out.println("positiopn in alphabet - >"+x);
                }


               /* if((welshMap.containsValue(oneLetter))&& oneLetter.equals(welshAlphabet[x])) {
                    System.out.println("positiopn in alphabet - >"+x);
                } else if ((welshMap.containsValue(arr[j].substring(0,1)))&& arr[j].substring(0,1).equals(welshAlphabet[x])){
                    System.out.println("positiopn in alphabet - >"+x);
                }*/
            }

        }
    }



    public static void main(String[] args) {

        String [] Arr = {"nah","dea","dd","ngah","ddr"};

        welshOrder(Arr);


    }
}
