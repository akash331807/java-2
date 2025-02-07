interface Car{
    void start();// interface method
}
class Car1 implements Car{//impliment interface class
    public void start(){
        System.out.println("car is staring....!!");
    }
}
class Main{
    public static void main(String[]args){
        Car1 a=new Car1();
        a.start();
    }
}