package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("unsorted Array");
        printArray(array);

        insertionSort(array);
        System.out.println("\nSorted array");
        printArray(array);
    }

    public static void insertionSort(int[] array){
        for(int i = 0; i  <array.length; i++){
            int temp = array[i];
            int j= i-1;

            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printArray(int[] array){
        System.out.print("[ ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(" ]");
    }
}