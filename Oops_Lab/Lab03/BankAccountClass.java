public class BankAccountClass {
    public static class Account{
        String HolderName;
        String number;
        String type;
        int amount;
        Account(){
            HolderName="";
            number="";
            type="";
            amount=0;
        }
        void depositMoney(int amu){
            amount+=amu;
            System.out.println("your Deposit is sucessfull");
            System.out.println("your Current Blance is "+amount);
        }
        void withdrawl(int amu){
            if((amount-amu)>=1000){
                amount-=amu;
                System.out.println("your withdrawl is sucessfull");
                System.out.println("your remain amount is "+amount);
            }
            else{
                 System.out.println("Insufficient blance");
            }
        }
        void display(){
             System.out.println("Account Holdername "+HolderName);
             System.out.println("Account Number "+number);
             System.out.println("Account Type "+type);
             System.out.println("Account Blance "+amount);

        }
    }
    public static void main(String[] args){
        Account person1=new Account();
        person1.HolderName="person1";
        person1.number="1";
        person1.type="S";
        person1.depositMoney(5000);
        person1.withdrawl(1000);
        person1.display();
        person1.withdrawl(4000);
    }
}
