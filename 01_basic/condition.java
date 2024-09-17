import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        int button=sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("green");
                break;
            case 2:
                System.out.println("red");
                break;
            default:
                System.out.println("yellow");
                break;
        }
        sc.close();
    }
}
