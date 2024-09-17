// package oops_Lab.PL-1;

import java.util.Scanner;

public class Find_gcd {
    public static void printGCD(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        System.out.println(a);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printGCD(a,b);
        sc.close();
    }

}
