package data_structure.Sorting_Algorithms;

public class MergeSort {


    public void printArray(int [] array){
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int [] mergeSort(int [] array) {

        if (array.length <= 1) {
            return array;
        }

        int midPoint = array.length / 2;
        int [] left = new int[midPoint];

        /*
        To make sure that the right array which is the second part
        of the given array will work correctly when the size of the
        given array is even or not even
        */
        int [] right = new int[array.length - midPoint];

        /* In here we populate the left array and the right array from the given array */

        for (int i = 0; i < midPoint; i++) {  // The left array is populate by from the 0 index to the midPoint index of the given array
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) { // The right array is populate from the midPoint index to the last index of the given array
            right[j] = array[midPoint+j];
        }

        int [] result  = new int [array.length];

        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);

        return result;
    }

    public int [] merge(int [] left, int [] right ) {

        int [] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {

            if(leftPointer < left.length && rightPointer < right.length ) {

                if (left[leftPointer] < right[rightPointer]) {

                    result[resultPointer++] = left[leftPointer++];
                } else {

                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {

                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {


                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }



    public static void main(String[] args) {

    }
}
