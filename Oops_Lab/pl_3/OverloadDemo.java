// package oops_Lab.PL-3;

public class OverloadDemo {
    void multiplication(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    void multiplication(double a,double b){
       
        System.out.println(a*b);
    }
    public static void main (String[] args){
        OverloadDemo v1=new OverloadDemo();
        v1.multiplication(5, 7);
        v1.multiplication(5.5,7.7);
        
    }
}
