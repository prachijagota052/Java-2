class Account{
    double balance;
    Account(double balance){
        this.balance=balance;
        double b=calculateInterest();
        System.out.println("Interest for Account: "+b); 
    }
    double calculateInterest(){
        return balance*0.02;
    }
}

class SavingsAccount extends Account{
    SavingsAccount(double balance){
        super(balance);
    }
    @Override
    double calculateInterest() {
        if(balance<=50000){
            return balance*0.04;
        }
        return 500+(balance*0.04);
    }
}
class FixedDeposit extends SavingsAccount{
    FixedDeposit(double balance){
        super(balance);
    }
    @Override
    double calculateInterest() {
        double balance=super.calculateInterest();
        return balance+(super.balance*0.02);
    }
}
public class Main {
    public static void main(String[] args) {
        Account SavingsAccount=new SavingsAccount(10000);
        Account SavingsAccount2=new SavingsAccount(60000);
        Account fixedDeposit=new FixedDeposit(60000);
        


    }
}
