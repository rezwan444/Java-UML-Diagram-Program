class Account{
    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }
}

class Savings extends Account{
    private double interest = 5;

    public Savings(int accountNo, double balance) {
        super(accountNo, balance);
    }

    public void addInterest(){
        double interestAmount = getBalance() * interest / 100;
        deposit(interestAmount);
    }
}

    class Current extends Account{
        private double overdraft = 1000;

    public Current(int accountNo, double balance){
        super(accountNo, balance);
    }

    public void checkLimit(){
        if (getBalance() >= overdraft){
            System.out.println("Within overdraft limit");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class Bank{
    public static void main(String[] args){
        System.out.println("Saving Account Here");
        Savings s1 = new Savings(1001, 20000);
        s1.deposit(2500);

        System.out.println("Balance: " + s1.getBalance());

        s1.withdraw(2550);
        System.out.println("Balance after withdraw: " + s1.getBalance());

        s1.addInterest();
        System.out.println("Balance after interest: " + s1.getBalance());

        System.out.println();

        System.out.println("Current Account Here");
        Current c1 = new Current(2001, 30000);

        c1.deposit(10000);

        System.out.println("Balance: " + c1.getBalance());

        c1.withdraw(42000);
        System.out.println("Balance after withdraw: " + c1.getBalance());

        c1.checkLimit();
    }
}