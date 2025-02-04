// abstraction
abstract class Animal {
    public abstract void dog();//abstract method
}
class Name extends Animal{
    public void dog(){//normal method
        System.out.println("mellow");
    }
}
class Breed extends Animal{
    public void dog(){
        System.out.println("lab");
    }
}
class Price extends Animal{
    public void dog(){
        System.out.println("30000");
    }
}
class Location extends Animal{
    public void dog(){
        System.out.println("sangepalli");
    }
}
class Owner_details extends Animal{
    public void dog(){
        System.out.println("akash.v");
    }
}
public class Main{
    public static void main(String[]args){

        Name a=new Name();
        Breed b=new Breed();
        Price c=new Price();
        Location d=new Location();
        Owner_details e=new Owner_details();
        a.dog();
        b.dog();
        c.dog();
        d.dog();
        e.dog();


}}