package seaching_sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[small]>arr[j]) 
                    small=j;
            }
            int temp= arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

//T.C=O(n^2)
