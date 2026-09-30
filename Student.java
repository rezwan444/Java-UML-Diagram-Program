class Student{
    private int id;
    private String name;
    private double marks;


    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void addMarks(double amount){
        marks = marks + amount;
    }

    public double getMarks() {
        return marks;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(20, "Nayem", 70);
        s1.addMarks(20);
        s1.display();
    }
}