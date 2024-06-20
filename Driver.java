import java.util.Random;

public class Driver{
  public static void main(String[] args){
    
    Integer[] numList = new Integer[100];
    Random rand = new Random();

    for (int i = 0; i < numList.length; i++){
      numList[i] = rand.nextInt(10000);
    }

    String[] names = new String[10];
    names[0] = "Alice";
    names[1] = "Bob";
    names[2] = "Charlie";
    names[3] = "Diana";
    names[4] = "Ethan";
    names[5] = "Fiona";
    names[6] = "George";
    names[7] = "Hannah";
    names[8] = "Ian";
    names[9] = "Julia";

    Contact[] friends = new Contact[8];

    friends[0] = new Contact("John", "Smith", "123-456-7890");
    friends[1] = new Contact("Jane", "Doe", "234-567-8901");
    friends[2] = new Contact("Emil", "Brown", "345-678-9012");
    friends[3] = new Contact("Emily", "Johnson", "456-789-0123");
    friends[4] = new Contact("Michael", "Williams", "567-890-1234");
    friends[5] = new Contact("Sarah", "Jones", "678-901-2345");
    friends[6] = new Contact("David", "Miller", "789-012-3456");
    friends[7] = new Contact("James", "Brown", "235-426-1360");

    // Sorting.quickSort(numList, 0, numList.length - 1);
    Sorting.insertionSort(friends);
    // for (int num : numList){
    //   System.out.println(num);
    // }
    for (Contact friend : friends){
      System.out.println(friend);
    }

    // for (Contact friend : friends) {
    //   System.out.println(friend);
    // }


    // System.out.println(Searching.linearSearch(numList, 0, 9, 2030));
    // System.out.println(Searching.linearSearch(names, 0, 9, "Alice"));

    // Sorting.selectionSort(names);
    // for (String name : names) {
    //   System.out.println(name);
    // }

    // System.out.println(Searching.binarySearch(names, 0, 9, "Mike"));
  }
}