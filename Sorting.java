import java.util.Arrays;

public class Sorting {
  public static <T extends Comparable<T>> void selectionSort(T[] data) {
    int min; 

    for (int index = 0; index < data.length - 1; index++){
      min = index;
      for (int scan = index + 1; scan < data.length; scan ++){
        if (data[scan].compareTo(data[min]) < 0) {
          min = scan;
        }
      }
      swap(data, min, index);
    }
  }

  public static <T extends Comparable<T>> void insertionSort(T[] data) {

    for (int index = 1; index < data.length; index++) {
      T key = data[index];
      int position = index;

      while (position > 0 && data[position - 1].compareTo(key) > 0) {
        data[position] = data[position - 1];
        position--;
      }
      data[position] = key;
    }
  }

  public static <T extends Comparable<T>> void bubbleSort(T[] data){
    int position, scan; 

    for (position = data.length - 1; position >= 0; position --){
      for (scan = 0; scan <= position - 1; scan++){
        if (data[scan].compareTo(data[scan + 1]) > 0){
          swap(data, scan, scan + 1);
        }
      }
    }
  }

  public static <T extends Comparable<T>> void quickSort2(T[] array, int lowIndex, int highIndex){

    if (lowIndex >= highIndex) {
      return;
    }

    T pivot = array[highIndex];

    int leftPointer = partition(array, lowIndex, highIndex, pivot);

    quickSort2(array, lowIndex, leftPointer - 1);
    quickSort2(array, leftPointer + 1, highIndex);
  }

  private static <T extends Comparable<T>> int partition(int[] array, int lowIndex, int highIndex, T pivot) {

    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while (leftPointer < rightPointer) {
      while (array[leftPointer].compareTo(pivot) < 0 && leftPointer < rightPointer) {
        leftPointer++;
      }

      while (array[rightPointer].compareTo(pivot) >= 0 && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(array, leftPointer, rightPointer);
    }

    swap(array, leftPointer, highIndex);
  }

  private static <T extends Comparable<T>> void swap(T[] data, int a, int b) {
    T temp = data[a];
    data[a] = data[b];
    data[b] = temp;
  }
  
}
