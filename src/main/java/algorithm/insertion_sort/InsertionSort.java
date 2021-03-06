package algorithm.insertion_sort;

public class InsertionSort {
    public static int[] sort(int[] inputArray){
        for (int j = 1; j < inputArray.length; j++) {
            int key = inputArray[j];
            int i  = j - 1;
            while(i >= 0 && inputArray[i] > key){
                inputArray[i + 1] = inputArray[i];
                i--;
                inputArray[i + 1] = key;
            }
        }
        return inputArray;
    }
}
