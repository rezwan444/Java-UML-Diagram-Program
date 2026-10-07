// UML Practice: Employee Management System
//                                     ┌──────────────────────────┐
//                                     │        Employee          │
//                                     ├──────────────────────────┤
//                                     │ - name : String          │
//                                     │ # salary : double        │
//                                     ├──────────────────────────┤
//                                     │ + displayEmployee():void │
//                                     └─────────────▲────────────┘
//                                                 │
//                                                 │ extends
//                                     ┌─────────────┴────────────┐
//                                     │        Manager           │
//                                     ├──────────────────────────┤
//                                     │ - department : String    │
//                                     │ # bonus : double         │
//                                     ├──────────────────────────┤
//                                     │ + calculateSalary():void │
//                                     │ + displayManager():void  │
//                                     └──────────────────────────┘

class Employee {
    private String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary + " BDT");
    }
}

class Manager extends Employee {
    private String department;
    protected double bonus;

    Manager(String name, double salary, String department, double bonus) {
        super(name, salary);

        this.department = department;
        this.bonus = bonus;
    }

    public void calculateSalary() {
       double totalSalary = salary + bonus;
       System.out.println("Total Salry: " + totalSalary + " BDT");
    }

    public void displayManager() {
        System.out.println("Department: " + department);
    }
}

class EmpMS {
    public  static void main(String[] args) {
        System.out.println("------------------------------");

        System.out.println("Employee Information is Here:");
        System.out.println("------------------------------");
        Manager m = new Manager("M R H Nayem", 25000.0, "IT", 10000 );
        m.displayEmployee();
        m.displayManager();
        m.calculateSalary();
        System.out.println("------------------------------");
        Manager m1 = new Manager("Abdur Rahim", 20000.0, "Sales", 8000 );
        m1.displayEmployee();
        m1.displayManager();
        m1.calculateSalary();

        System.out.println("------------------------------");
    }
}