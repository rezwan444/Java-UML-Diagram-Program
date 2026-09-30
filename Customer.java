class Customer{
    private int customerId;
    private String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name ;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Bacchu");
        BankAccount2 account1 = new BankAccount2(101020, 5000);

        c1.displayCustomer();

        account1.withdraw(1000);
        account1.deposit(2000);

        account1.display();
    }
}