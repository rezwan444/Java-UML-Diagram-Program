// UML 1


class BankAccount{
    private int accountNumber;
    private String holderName;
    private double balance;

public BankAccount (int accountNumber, String holderName, double balance) {
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
}

public void deposit (double amount){
    balance = balance + amount;
}

public void withdraw(double amount){
    balance = balance - amount;
}

public double getBalance(){
    return balance;
}

public void display(){
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Holder Name: " + holderName);
    System.out.println("Balance: " + balance);
  }

public static void main(String[] args){
    BankAccount account1 = new BankAccount(101, "Rezwan", 5000);
    account1.deposit(2000);
    account1.withdraw(1000);
    account1.display();
}
}