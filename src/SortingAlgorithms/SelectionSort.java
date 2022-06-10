package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("unsorted Array");
        printArray(array);

        selectionSort(array);
        System.out.println("\nSorted array");
        printArray(array);
    }

    public static void selectionSort(int[] array){

        for(int lastSortedIndex = array.length-1; lastSortedIndex > 0; lastSortedIndex--){

            int largest =0;
            for(int i = 1; i < lastSortedIndex; i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastSortedIndex);
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
