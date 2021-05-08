package data_structure.Search_Algorithms;

public class LinearSearch {


    /* this is a O(N) time complexity*/
    public static int linear_Search(int [] a, int x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i]==x){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int [] a = {10,20,55,61,45,100,122,125,200,500};

    }
}
