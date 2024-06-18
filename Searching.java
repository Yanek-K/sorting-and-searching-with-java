public class Searching {
  public static <T extends Comparable <T>> boolean linearSearch(T[] data, int min, int max, T target) {
    int index = min;
    boolean found = false;

    while (!found && index <= max) {
      found = data[index].equals(target);
      index++;
    }

    return found;
  }

  public static <T extends Comparable <T>> boolean binarySearch(T[] data, int min, int max, T target){
    boolean found = false;

    int midpoint = (min + max) / 2;

    if (data[midpoint].compareTo(target) == 0) {
      found = true;
    }

    else if (data[midpoint].compareTo(target) > 0) {
      if (min <= midpoint - 1){
        found = binarySearch(data, min, midpoint - 1, target);
      }
    }
     else if (midpoint + 1 <= max) {
      found = binarySearch(data, midpoint + 1, max, target);
     }

     return found;
  }
}
