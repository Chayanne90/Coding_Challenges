package data_structure.Search_Algorithms;

public class BinarySearch {

    public static int binary_Search(int [] a, int x){

        int p = 0;
        int r = a.length-1;

        while (p <= r) {
            int q = (p+r)/2;
            if (a[q] == x)  return q;
            if (a[q] > x) r = q-1;
            else p  = q+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a = {10,20,55,61,45,100,122,125,200,500};
        System.out.println(binary_Search(a,12));
    }


}
