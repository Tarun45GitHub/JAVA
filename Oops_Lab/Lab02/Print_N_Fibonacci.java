// package Learn_to_create_class;

import java.util.Scanner;  


public class Print_N_Fibonacci {
    public static void print_fibonacci(int n){
          int a=0,b=1,c=0;
          System.out.println(a);
         while (n-2>=0) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n--;
         }
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        int n=sc.nextInt();
        print_fibonacci(n);
        sc.close();
    }
}
