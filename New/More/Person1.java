//   1. Solve the java UML diagram
//    ┌──────────────────────┐
//               │       Person         │
//               ├──────────────────────┤
//               │ - name : String      │
//               │ - age : int          │
//               ├──────────────────────┤
//               │ + displayInfo() : void│
//               └──────────┬───────────┘
//                          △
//                          │
//               ┌──────────┴───────────┐
//               │       Student        │
//               ├──────────────────────┤
//               │ - id : int           │
//               │ - department:String  │
//               ├──────────────────────┤
//               │ + displayStudent()   │
//               │   : void             │
//               └──────────────────────┘
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int id;
    private String department;

    public Student(String name, int age, int id, String department){
        super(name, age);

        this.id = id;
        this.department = department;
    }

    public void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

public class Person1 {
    public static void main(String[] args) {
        Person p1 = new Person("Rezwan", 23);
        Student s1 = new Student("Rezwan", 23, 20, "CSE");

        System.out.println("The output is here");
        p1.displayInfo();
        s1.displayStudent();
    }
}