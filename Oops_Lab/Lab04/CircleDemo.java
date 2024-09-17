// package oops_Lab.pL_3;

 class Circle {
    double radius;
    int angle;
    Circle(double radius,int angle){
        this.radius=radius;
        this.angle=angle;
    }
    void circleCircumference(){
        System.out.println(2*3.14*radius);
    }
    void arcLength(){
        System.out.println(3.14*radius*radius);
    }
   
}
public class CircleDemo{
    public static void main(String[] args){
        Circle c1=new Circle(5, 20);
        if(c1.angle==20) c1.circleCircumference();
        if(c1.angle==90) c1.arcLength();
    }
}