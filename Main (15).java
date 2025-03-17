// COLLECTION IN JAVA : Sets in Java
import java.util.Set;
import java.util.HashSet;
class Main {
  public static void main (String [] args) {
    Set<String> fruits = new HashSet<>(); // creating Empty fruits set
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    System.out.println("FRUITS_DEATILS");
    System.out.println("---------------"); 
    System.out.println("FRUITS :"+fruits); 
  }
}