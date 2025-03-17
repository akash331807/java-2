interface Bulb{
    void start();// interface method
}
class Bulb1 implements Bulb{//impliment interface class
    public void start(){
        System.out.println("Bulb is lighting....!!");
    }
}
class Main{
    public static void main(String[]args){
        Bulb1 a=new Bulb1();
        a.start();
    }
}