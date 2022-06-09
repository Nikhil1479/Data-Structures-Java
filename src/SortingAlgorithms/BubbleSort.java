package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("unsorted Array");
        printArray(array);

        bubbleSort(array);
        System.out.println("\nSorted array");
        printArray(array);
    }

    public static void bubbleSort(int[] array){
        for(int lastSortedIndex = array.length-1; lastSortedIndex > 0; lastSortedIndex--){
            for(int i = 0; i < lastSortedIndex; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
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