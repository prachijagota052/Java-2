import java.util.ArrayList;

class Account{
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){ 
        if(amount > 0 && amount <= balance)
            { balance -= amount;
             System.out.println("Withdrew: $" + amount); }
         else {
            throw new IllegalArgumentException("Invalid withdrawal amount or insufficient funds.");
    }
    public transfer(Account toAccount, double amount){
        if(amount > 0 && amount <= balance){
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred: $" + amount + " to " + toAccount.accountHolderName);
        } else {
            throw new IllegalArgumentException("Invalid transfer amount or insufficient funds.");   
        }
    }
    public void displayAccountDetails(){ 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolderName); 
        System.out.println("Balance: $" + balance); 
    }
}

class Bank extends Account{ 
    Bank() { super(null, null, 0); }
    ArrayList<Account> accounts=new ArrayList<Account>();
    public void createAccount(String accountNumber, String accountHolderName, double initialDeposit){
        Account newAccount = new Account(accountNumber, accountHolderName, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account created for " + accountHolderName);
    } 
    public Account getAccount(String accountNumber)
    { 
        for(Account acc : accounts)
        { 
            if(acc.accountNumber.equals(accountNumber))
            { return acc; } 
        } 
        System.out.println("Account not found."); 
        return null; 
    }
    public void displayAllAccounts()
    { 
        for(Account acc : accounts) 
        { acc.displayAccountDetails(); } //make use of existing methods . CODE REUSE.
    }

class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
public class Scenario_4{
    public static void main(String[] args) 
    { 
        Bank bank = new Bank(); 
        bank.createAccount("12345", "Alice", 1000); 
        bank.createAccount("67890", "Bob", 500); 
        Account aliceAccount = bank.getAccount("12345");
        Account bobAccount = bank.getAccount("67890"); 
         try { aliceAccount.transfer(bobAccount, 200); } 
         catch (IllegalArgumentException e) 
         { System.out.println(e.getMessage()); } 
         bank.displayAllAccounts();
}

} 