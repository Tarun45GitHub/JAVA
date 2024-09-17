// package 02_arrayList;
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int [] markes=new int[4];
        markes[2]=56;
        // System.out.println(markes[4]);// out of bound
        System.out.println(markes[3]);

        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int [size];
        //input
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        //output
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
}
