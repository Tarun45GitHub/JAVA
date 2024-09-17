public class Building {
    int room=5;
    int floor=3;
    double area=700.0;
    public static void main(String[] args){
        Building B1=new Building();
        House H1=new House();
        Office Of1=new Office();
        System.out.println(B1.area);
        H1.area=500.0;
        System.out.println(H1.area);
        System.out.println(Of1.area);

    }
}
class House extends Building{
    int bedroom=3;
    int bathroom=3;
}
class Office extends Building{
    int chair=40;
    int table=15;
    int telephone=5;
}
