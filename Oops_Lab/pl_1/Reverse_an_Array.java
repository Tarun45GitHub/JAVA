// package oops_Lab.PL-1;

import java.util.Scanner;

public class Reverse_an_Array {
    
    public static void main(String[] args){
        int[] arr=new int[20];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<20;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
           int temp=arr[i];
           arr[i]=arr[19-i];
           arr[19-i]=temp;
        }
        for(int i=0;i<20;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
