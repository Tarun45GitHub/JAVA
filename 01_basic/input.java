import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String name= sc.next(); //take a single word input
        System.out.println(name);
        String fullname=sc.nextLine();
        System.out.println(fullname);

        int a=sc.nextInt();//take int type data type
        System.out.println(a);
        sc.close();
    }
}
