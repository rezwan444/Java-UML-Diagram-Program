class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int id;
    private String deparment;

    public Student(String name, int age, int id, String deparment){
        super(name, age);

        this.id = id;
        this.deparment = deparment;
    }

    public void study() {
            System.out.println("Student ID: " + id);
            System.out.println("Students Department: " + deparment);
        }
}

class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age ,double salary, String subject) {
        super(name, age);

        this.salary = salary;
        this.subject = subject;
    }

    public void teach(){
        System.out.println("Teacher Salary: " + salary);
        System.out.println("Teacher Subject: " + subject);
    }
}

public class Main2{
    public static void main(String [] x) {
        Student s1 = new Student("Nayem", 23, 20, "CSE");
        Teacher t1 = new Teacher("Nahid Hasna", 30, 20000, "Java");

        s1.study();
        s1.display();

        t1.teach();
        t1.display();
    }
}