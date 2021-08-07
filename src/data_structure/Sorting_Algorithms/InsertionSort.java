package data_structure.Sorting_Algorithms;

public class InsertionSort {

    public static int [] insertionSort(int [] arr) {

        for (int i = 1; i < arr.length-1; i++) {
            int item = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > item){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr = insertionSort(new int[] {9,8,5,13,25,6,99});

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
