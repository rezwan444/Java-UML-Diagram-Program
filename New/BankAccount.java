class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
       if(amount <= balance){
            balance = balance - amount;
       } else {
        System.out.println("Insufficient Balance");
       }
    }

    public void showBalance() {
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Balance: " + balance + " BDT");
    }

     public static void main(String[] args) {

        //create object
        BankAccount b1 = new BankAccount("Rezwan", 25000);
        b1.showBalance();

        System.out.println();
        b1.deposit(8000);
        System.out.println("After Deposit: ");
        b1.showBalance();

        System.out.println();
        b1.withdraw(6000);
        System.out.println("After Withdraw: ");
        b1.showBalance();

    }
}
