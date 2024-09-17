package Experiment1;
abstract class GeometricObject{
    String color;
    double weight;
    GeometricObject(){
        color="white";
        weight=1.0;
    }
     public String getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
    abstract double findArea(int base,int height);
    abstract double findCircumference(int length1,int lenght2,int lenght3);
     public static void main(String[] args){
          
       
    }
}
 class triangle extends GeometricObject{
        double findArea( int base,int height){
            return (base*height)/2;
        }
        double findCircumference(int length1,int lenght2,int lenght3){
            return length1+lenght2+lenght3;
        }
    }
    

