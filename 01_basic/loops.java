public class loops {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("hello world in for loop "+i);
        }
        int i=0;
        while (i<10) {
           System.out.println("hello world in while loop "+i); 
           i++;
        }

        int j=0;
        do {
            System.out.println("hello world in do while loop "+j);
            j++;
        } while (j<10);
    }
}
