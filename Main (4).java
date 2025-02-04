//Implementation-3 using flowers deatils for Abstraction:
abstract Class flowers{
    string flowers_name ;
    public abstract void flowers_deatils(); //abstract method 
 }
 Class rose extends flowers {
   public void flowers_deatils (){ //normal method
   this.flowers_name = "Rose"; //using this key word
   this.flowers_colour="Red";
   this.flowers_price="50";
   this.flowers_size="small";
   this.flowers_smell="Rose smell";
   System.out.println("FLOWERS_DEATILS");
   System.out println("---------------");
   System.out.println("Flowers name is : +this.flowers_name");
   System.out.println("Flowers colour is : +this.flowers_colour");
   System.out.println("Flowers price is : +this.flowers_price");
   System.out.println("Flowers sizeis : +this.flowers_size");
   System.out.println("Flowers smell is : +this.flowers_smell");
   }
 