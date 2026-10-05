// Problem 02 : Solve the UMl Diagram Bank System
//              ┌─────────────────────────┐
//              │       Account           │
//              ├─────────────────────────┤
//              │ - accountNo : int       │
//              │ - balance : double      │
//              ├─────────────────────────┤
//              │ + deposit() : void      │
//              │ + displayAccount():void │
//              └────────────┬────────────┘
//                           △
//                           │
//              ┌────────────┴────────────┐
//              │      SavingsAccount     │
//              ├─────────────────────────┤
//              │ - interestRate : double │
//              ├─────────────────────────┤
//              │ + calculateInterest()   │
//              │   : double              │
//              └─────────────────────────┘
// ----------------------------------------------------             

class Account {
    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void wihdraw(double amount) {
        balance = balance - amount;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Balance: " + balance + " BDT");
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNo, double balance, double interestRate){
        super(accountNo, balance);

        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

public class BankAS {
    public static void main(String[] args) {
        SavingsAccount sc1 = new SavingsAccount(101020, 25500, 2);

        System.out.println("------------------------------");
        System.out.println("Account Information: ");
        sc1.displayAccount();
        System.out.println("------------------------------");
        System.out.println("After Deposite: ");
        sc1.deposit(7500);
        sc1.displayAccount();
        System.out.println("------------------------------");
        System.out.println("After Withdraw: ");
        sc1.wihdraw(10000);
        sc1.displayAccount();
        System.out.println("------------------------------");
        double interest = sc1.calculateInterest();
        System.out.println("Interest: " + interest + " BDT Annuarly");
        System.out.println("------------------------------");
        
    }
}