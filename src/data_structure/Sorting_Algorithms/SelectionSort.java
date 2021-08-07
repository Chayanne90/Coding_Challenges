package data_structure.Sorting_Algorithms;

public class SelectionSort {

    public static int [] selectionSort(int [] Arr) {

        for (int i = 0; i < Arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < Arr.length; j++) {
                if (Arr[j] < Arr[min]) {
                    min = j;
                }
            }

            int temp = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = temp;
        }
        return Arr;
    }



    public static void main(String[] args) {

        int [] arr = selectionSort(new int[] {9,8,3,13,25,6,99});

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
