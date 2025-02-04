// abstraction
 abstract class Animal {
    public abstract void sound();//abstract method
}
class Cat extends Animal{
   public void sound(){//normal method
       System.out.println("meow meow.....!!");
   }
}
public class Main{
    public static void main(String[]args){
        Cat obj = new Cat();
        obj.sound();
    }
}