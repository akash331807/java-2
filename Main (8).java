interface Animal{ //creating a interface
     void sound();
}
class Cat implements Animal{
    public void sound(){ //non static Method
     System.out.println("Meow Meow");
  }
}
class Main {
  public static void sound(){
    System.out.println("Meow Meow ---Main class");
  }

  public static void main(string[] args) {
     Cat d = new Cat();   //Requried object for implementation class
     d.sound();
     sound();  //Directly We call static method is in main class
    }
}