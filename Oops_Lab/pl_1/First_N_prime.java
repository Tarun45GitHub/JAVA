public class First_N_prime{
    public static void main(String[] args){
        int n=0,i=1;
        while(n<10){
            int ct=0,j=1;
            while(i>=j){
                if(i%j==0) ct++;
                j++;
            }
            if(ct==2){
                System.out.println(i);
                n++;
            }
            i++;
        }
    }
}