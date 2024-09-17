import java.util.*;
public class stringBulder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("tarun");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        //set char
       sb.setCharAt(2,'o' );
        System.out.println(sb);

        //insert
        sb.insert(2,'p');
        System.out.println(sb);

        //delete
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        sb.append('s');
        sb.append('i');
        System.out.println(sb);
    }
}
