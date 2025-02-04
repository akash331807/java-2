// abstraction
 abstract class Animal {
    public abstract void sound();//abstract method
}
class Dog extends Animal{
   public void sound(){//normal method
       System.out.println("im converted abstart method to normal method");
   }
}
public class Main{
    public static void main(String[]args){
        Dog obj = new Dog();
        obj.sound();
    }
}