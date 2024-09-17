public class class_2Dfigure {
    int dimension1;
    int dimension2;
    public void calculateArea(int dimension1,int dimension2){
       System.out.println("calculate the area");
    }
public static void main(String[] args){
    Triangle tr1=new Triangle();
    tr1.calculateArea(5,6);
    Rectangle re1=new Rectangle();
    re1.calculateArea(8, 3);
}
}
class Triangle extends class_2Dfigure{
    public void calculateArea(int base,int height){
        System.out.println("The area of triangle "+ (base*height)/2);
    }
}
class Rectangle extends class_2Dfigure{
    public void calculateArea(int lenght,int width){
       System.out.println("The area of rectangle " + lenght*width);
    }
}
