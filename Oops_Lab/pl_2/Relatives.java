import java.util.Scanner;

public class Relatives {
    String Name;
    String Address;
    void input(){
        Scanner sc= new Scanner(System.in);
        this.Name=sc.nextLine();
        this.Address=sc.nextLine();
        sc.close();
    }
    void display(){
        System.out.println(Name);
        System.out.println(Address);
    }
    public static void main(String[] args){
        Relatives Rl1= new Relatives();
        Rl1.input();
        Rl1.display();
        
    }
}
