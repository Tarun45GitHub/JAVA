package seaching_sorting;

public class mergeSort {
    public static void merge(int arr[],int s,int mid,int e){
        int i=s,j=mid+1;
        int newarr[]=new int[e-s+1];
        int x=0;
        while(i<=mid&&j<=e){
            if(arr[i]<arr[j]) newarr[x++]=arr[i++];
            else               newarr[x++]=arr[j++];
        }
        while(i<=mid){
            newarr[x++]=arr[i++];
        }
        while(j<=e){
            newarr[x++]=arr[j++];
        }
       for(int p=0,q=s;p<x;p++,q++){
            arr[q]=newarr[p];
       }
    }
    public static void devide(int arr[],int s,int e){
        if(s>=e) return ;
        int mid=s+(e-s)/2;
        devide(arr, s, mid);
        devide(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    public static void main(String[] args) {
      int arr[]={7,8,1,3,2};
      int n=arr.length;
      devide(arr,0,n-1);
    
      for(int i=0;i<n;i++){
        System.out.println(arr[i]);
      }

    }
}
