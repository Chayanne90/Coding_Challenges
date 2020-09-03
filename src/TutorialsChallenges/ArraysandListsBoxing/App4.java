package TutorialsChallenges.ArraysandListsBoxing;


import java.util.ArrayList;

class Intclass {

    private int myValue;

    public Intclass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

}

public class App4 {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("chayanne");

        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<Intclass> intclassArrayList = new ArrayList<Intclass>();
        Integer integer = new Integer(50);
        Double doubleVAlue = new Double(12.25);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <=10; i++) {
            intArrayList.add(Integer.valueOf(i) *2);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> "+ intArrayList.get(i).intValue());
        }

        Integer myIntvalue = 50;
        int myInt = myIntvalue.intValue();

        ArrayList<Double>mydouble = new ArrayList<Double>();

        for (Double dlb =0.0; dlb<= 10.0; dlb +=5){
            mydouble.add(Double.valueOf(dlb));
        }

        for (int i = 0; i <mydouble.size(); i++) {
            double value = mydouble.get(i).doubleValue();
            System.out.println(i+ " -> "+ value);
        }




    }


}