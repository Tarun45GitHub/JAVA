// package oops_Lab.PL-1;

import java.util.Scanner;

public class Sort_an_Array {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[15];
        for(int i=0;i<15;i++){
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<15;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
