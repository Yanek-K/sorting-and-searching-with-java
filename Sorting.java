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
        System.out.println("here");
      }
      data[position] = key;
      System.out.println("Here now");
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

  public static <T extends Comparable<T>> void quickSort(T[] data, int min, int max){
    if (min < max) {
      // Create Partitions

      int indexOfPartition = partition(data, min, max);
      
      // Sort the left partition
      quickSort(data, min, indexOfPartition - 1);

      // Sort the right partition
      quickSort(data, indexOfPartition + 1, max);
    }
  }

  private static <T extends Comparable<T>> int partition(T[] data, int min, int max){

    T partitionElement;
    int left, right;
    int middle = (min + max) / 2;

    partitionElement = data[middle];

    swap(data, middle, min);
    left = min; 
    right = max;

    while (left < right){
      while (left < right && data[left].compareTo(partitionElement) <= 0)
        left++;
      
      while (data[right].compareTo(partitionElement) > 0)
        right--;

      if (left < right)
        swap(data, left, right);
    }

    swap (data, min, right);
    return right;
  }

  private static <T extends Comparable<T>> void swap(T[] data, int a, int b) {
    T temp = data[a];
    data[a] = data[b];
    data[b] = temp;
  }
  
}
