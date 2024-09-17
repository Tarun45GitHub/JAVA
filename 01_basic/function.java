import java.util.Scanner;

public class function {
    public static int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static int GCD(int a,int b){
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0) 
            gcd=i;
        }
        return gcd;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=GCD(a, b);
        System.out.println(gcd);
        sc.close();
    }
}
