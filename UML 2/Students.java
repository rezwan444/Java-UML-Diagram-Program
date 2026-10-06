// Practice: Multilevel Inheritance --> UML Diagram
//                                                 ┌─────────────────────────┐
//                                                 │         Person          │
//                                                 ├─────────────────────────┤
//                                                 │ - name : String         │
//                                                 │ - age : int             │
//                                                 ├─────────────────────────┤
//                                                 │ + displayPerson() : void│
//                                                 └───────────▲─────────────┘
//                                                             │
//                                                             │ extends
//                                                 ┌───────────┴─────────────┐
//                                                 │         Student         │
//                                                 ├─────────────────────────┤
//                                                 │ - studentId : int       │
//                                                 │ - department : String   │
//                                                 ├─────────────────────────┤
//                                                 │ + displayStudent():void │
//                                                 └───────────▲─────────────┘
//                                                             │
//                                                             │ extends
//                                                 ┌───────────┴─────────────┐
//                                                 │    GraduateStudent      │
//                                                 ├─────────────────────────┤
//                                                 │ - thesisTitle : String  │
//                                                 ├─────────────────────────┤
//                                                 │ + displayGraduate():void│
//                                                 └─────────────────────────┘


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age " + age + " Years old");
    }
}

class Student extends Person {
    private int studentId;
    private String department;

    public Student(String name, int age, int studentId, String department) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentId);
        System.out.println("Department: " + department);
    }
}

class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int age, int studentId, String department, String thesisTitle){
        super(name, age, studentId, department);
        this.thesisTitle = thesisTitle;
    }

    public void displayGraduate() {
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class Students {

    public  static void main(String[] args) {
        System.out.println("-------------------------");

        System.out.println("Information is here:");

        GraduateStudent g = new GraduateStudent(
                    "M R H Nayem", 23, 20, "CSE", 
                    "Artificial Intelligence");

        g.displayPerson();
        g.displayStudent();
        g.displayGraduate();

        System.out.println("-------------------------");
    }
}