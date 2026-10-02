class Person {
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
        private int studentId;
        private String deparment;

        public Student(String name, int age, int studentId, String deparment){
            super(name, age);

            this.studentId = studentId;
            this.deparment = deparment;
        }

        public void study(){
            System.out.println("Student ID : " + studentId);
            System.out.println("Department : " + deparment);
        }
    }

    public class Main{
        public static void main(String[] args) {
            Student s1 = new Student ("Rezwan", 23, 020, "CSE");
            s1.displayInfo();
            s1.study();
        }
    }