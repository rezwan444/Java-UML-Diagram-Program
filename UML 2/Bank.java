// Practice 4: Bank System — Multilevel Inheritance
//                                                 ┌─────────────────────────────┐
//                                                 │           Account           │
//                                                 ├─────────────────────────────┤
//                                                 │ - accountNo : int           │
//                                                 │ - holderName : String       │
//                                                 ├─────────────────────────────┤
//                                                 │ + displayAccount() : void   │
//                                                 └──────────────▲──────────────┘
//                                                             │
//                                                             │ extends
//                                                 ┌──────────────┴──────────────┐
//                                                 │        SavingsAccount       │
//                                                 ├─────────────────────────────┤
//                                                 │ - interestRate : double     │
//                                                 ├─────────────────────────────┤
//                                                 │ + calculateInterest():double│
//                                                 └──────────────▲──────────────┘
//                                                             │
//                                                             │ extends
//                                                 ┌──────────────┴──────────────┐
//                                                 │       StudentAccount        │
//                                                 ├─────────────────────────────┤
//                                                 │ - studentId : int           │
//                                                 ├─────────────────────────────┤
//                                                 │ + displayStudent(): void    │
//                                                 └─────────────────────────────┘

class Account {
    private int accountNo;
    private String holderName;

    public Account(int accountNo, String holderName) {
        this.accountNo = accountNo;
        this.holderName = holderName;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder Name: " + holderName);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNo, String holderName, double interestRate) {
        super(accountNo, holderName);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        double balance = 10000;
        return balance * interestRate / 100;
    }
}

class StudentAccount extends  SavingsAccount {
    private int studentId;

    public StudentAccount(int accountNo, String holderName, double interestRate, int studentId) {
        super(accountNo, holderName, interestRate);
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

public class Bank{
    public static void main(String[] args) {
        System.out.println("----------------------------");

        System.out.println("Account Information is Here: ");

        StudentAccount s = new StudentAccount(101020, "M R H Nayem", 5, 20);
        s.displayAccount();
        System.out.println("Interest Rate: 5.0%");
        System.out.println("Interest: " + s.calculateInterest() +" BDT");

        System.out.println("----------------------------");
    }
}