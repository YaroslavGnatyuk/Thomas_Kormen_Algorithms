package isertion_sort;

public class TestInsertionSort {
    private static int[] array = {5,2,4,6,1,3};

    public static void main(String[] args) {
        int[] sortArray = InsertionSort.sort(array);
        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }
    }
}
