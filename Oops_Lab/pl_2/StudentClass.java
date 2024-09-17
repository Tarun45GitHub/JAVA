// package oops_Lab;

public class StudentClass {
    public static class Student{
        String name;
        int[] marks=new int[5];
        void  initialMarkes(int[] number){
           for(int i=0;i<5;i++){
            marks[i]=number[i];
           }
        }
        int average() {
            int ans=0;
            for(int i=0;i<5;i++){
                ans+=marks[i];
            }
            return(ans/5);
        }
        void display(){
            System.out.println("Student name is"+name);
           for(int i=0;i<5;i++){
             System.out.println("sub "+(i+1)+" markes is "+marks[i]);
           }
            System.out.println("average markes is"+average());
        }

    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Tarun Dalbera";
        int[] number={85,69,25,48,66};
        s1.initialMarkes(number);
        s1.display();
        
    }
}
