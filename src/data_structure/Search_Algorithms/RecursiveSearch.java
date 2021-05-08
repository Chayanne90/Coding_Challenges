package data_structure.Search_Algorithms;

public class RecursiveSearch {

    /* Recursive Linear Search.
    * This do the same as linear search but using recursion! */

    public static int recursive_linear_Search(int [] a, int i , int x ) {

        if (i > a.length-1) return -1;
        else if (a[i] == x) return i;
        else return recursive_linear_Search(a,i+1,x);
    }

    /* Recursive Binary Search.
     * This do the same as Binary Search but using recursion! */
    public static int recursive_binary_Search(int [] a,int p, int r, int x) {

        if (p > r) return -1;
        int q = (p+r)/2;
        if (a[q] == x) return q;
        else if (a[q] > x)
            return recursive_binary_Search(a,p,q-1,x);
        else
            return recursive_binary_Search(a,q+1,r,x);
    }


    public static void main(String[] args) {
        int [] a = {10,20,55,61,45,100,122,125,200,500};
        System.out.println(recursive_binary_Search(a,0,a.length-1,45));
    }
}
