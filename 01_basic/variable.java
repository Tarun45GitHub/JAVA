public class variable {
    public static void main(String args[]){
        //primitive=>byte (1 byte= 8 bits),char(2 byte),bool(1 byte),int (4 byte),long(8 byte),float(4 byte),double(8byte)
        int a= 10;
        int b=5;
        int sum= a+b;
        System.out.println(sum);
        int ans= a*b/a-b; //is not follow BODMAS ,it slove left to right
        int ans2=(a*b)/(a-b);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
