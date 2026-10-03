class Student{
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void displayInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Id: " + id);
        System.out.println("Student CGPA: " + cgpa + " Out of 4.00");
    }

    public static void main(String[] args){

            Student s1 = new Student("Rezwan", 20, 3.54);

            s1.displayInfo();
    }
}