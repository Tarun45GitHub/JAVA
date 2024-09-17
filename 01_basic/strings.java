import java.util.*;
public class strings {
    public static void main(String[] args) {
     /* 
        Scanner sc= new Scanner(System.in);
        String name="Tarun";
        String fullanme=sc.nextLine();
        System.out.println(fullanme);
        //concatenation
        String myname=fullanme+name;
        System.out.println(myname);
        //length
        System.out.println(myname.length());
        //charAt
        for(int i=0;i<myname.length();i++){
            System.out.println(myname.charAt(i));
        }
     */
        //compare
        String str1="hello";
        String str2="hello";
        //s1>s2 : +ve
        //s1==s2 :0
        //s1<s2 :-ve
        // if(str1.compareTo(str2)==0)
        // System.out.println("strings are equal");
        // else System.out.println("string are not equal");

        if(str1==str2)
        System.out.println("strings are equal");
        else System.out.println("string are not equal");

        if(new String("tarun")==new String("Tarun"))
        System.out.println("strings are equal");
        else System.out.println("string are not equal");

        //substring(beg.index,end index)
        String str="my name is Tarun";
        System.out.println(str.substring(1,10));
        // sc.close();
    }
}

//string are immutable - cna not modified