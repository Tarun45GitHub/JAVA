package oops;
class student{   //student is user define class that is a blueprint of realtime object
    String name;
    int age;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age); //this reffers to cuuenr object
    }
}
public class class_object {
    public static void main(String[] args) {
        student s1= new student();   //object s1 is a instance of clases and a real time entity
        s1.name="Tarun";
        s1.age=20;

        student s2= new student();
        s2.name="Barun";
        s2.age=21;

        s1.print();
        s2.print();
    }
    
}
