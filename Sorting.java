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

      System.out.println("Intitial state at index " + index + ": " + Arrays.toString(data));

      while (position > 0 && data[position - 1].compareTo(key) > 0) {
        System.out.println("Before swap: position = " + position + ", Data = " + data[position] + ", data[position - 1] = " + data[position -1]);
  
        data[position] = data[position - 1];
        position--;

        System.out.println("After swap: position = " + position + ", data[position] = " + data[position]);
      }
      data[position] = key;
    }
  }


  private static <T extends Comparable<T>> void swap(T[] data, int a, int b) {
    T temp = data[a];
    data[a] = data[b];
    data[b] = temp;
  }
  
}
