package seaching_sorting;

public class quickSort {
    public static int partitation(int arr[],int s,int e){
        int pivot=arr[e];
        int ind=s-1;
        for(int i=s;i<e;i++){
            if(arr[i]<pivot){
                ind++;
                int temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
            }
        }
        ind++;
        int temp=arr[ind];
        arr[ind]=pivot;
        arr[e]=temp;
        return ind;
    }
   public static void Quicksort(int arr[],int s,int e){
    if(s<e){
        int pindx=partitation(arr,s,e);

        Quicksort(arr, s, pindx-1);
        Quicksort(arr, pindx+1, e);
    }
   }
    public static void main(String[] args) {
        int arr[]={7,8,1,3,2};
        int n=arr.length;
        Quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
