//animal list using scanner class:
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        List<String> animals = new ArrayList<>();//empty list
        Scanner s=new Scanner(System.in);//creating scanner class
        System.out.println("Enter animal name : ");
        
        String animal = s.nextLine();
        
        animals.add(animal);
        
         System.out.println("my animals:"+animals);
        
    }
}