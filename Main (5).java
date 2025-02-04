// Implementation 4: using Flowers deatils (parameters)
abstract class Flowers{ 
    
   public abstract void flower_deatils( String flower_name,
                                  String flower_colour,
                                  String flower_price,
                                  String flower_size,
                                  String flower_smell );   //abstract method 
                                  
}
class Lilly extends Flowers{
    public void flower_deatils( String flower_name,
                                String flower_colour,
                                String flower_price,
                                String flower_size,
                                String flower_smell ) { //normal method
    
       System.out.println("FLOWER_DEATILS");
       System.out.println("--------------");
       System.out.println("FLOWER name: "+flower_name);
       System.out.println("flower colour:"+flower_colour);
       System.out.println("flower price:"+flower_price );
       System.out.println("flower size:"+ flower_size);
       System.out.println("flower smell:"+flower_smell);
   } 
}
class Main {
  public static void main(String[] args) {
    Lilly obj = new Lilly();
    obj.flower_deatils("Lilly","White","15Rc","small","Amazing");
  }
}