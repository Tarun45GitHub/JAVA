// package oops_Lab.PL-4;
class car extends Vehicle{
    int passengers;
}
class truck extends Vehicle{
    int loadLimit;
}
public class Vehicle {
    int speed ;
    int wheel;
    public static void main(String[] args){
        car c1=new car();
        c1.passengers=10;
        c1.speed=40;
        c1.wheel=4;
        truck t1=new truck();
        t1.loadLimit=2500;
        t1.speed=30;
        t1.wheel=10;
        if(c1.speed>t1.speed) System.out.println("faster");
        else System.out.println("slower");

    }
}
