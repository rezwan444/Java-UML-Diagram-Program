class BankAccount2{
    private int accountNo;
    private double balance;

    public BankAccount2(int no, double balance) {
        this.accountNo = no;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account no: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}