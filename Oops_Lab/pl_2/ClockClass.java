public class ClockClass {
    public static class clock1{
        int H;
        int M;
        clock1(){
            H=0;M=0;
        }
        void read(int h,int m){
            H=h;
            M=m;
        }
        void show(){
            System.out.println(H+":"+M);
        }
    }
    public static class clock2{
        int H;
        int M;
        clock2(){
            H=0;M=0;
        }
        void read(int h,int m){
            H=h;
            M=m;
        }
        void show(){
            System.out.println(H+":"+M);
        }
    }
    void diff(){
       
    }
    
    public static void main(String[] args){
        clock1 c1=new clock1();
        c1.read(5,20);
        clock2 c2=new clock2();
        c2.read(3, 40);
       

    }
}
