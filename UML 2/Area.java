// Practice 3: Shape → Circle + Rectangle
// Hierarchical Inheritance + Method/Calculation
//                                             ┌──────────────────────┐
//                                             │        Shape         │
//                                             ├──────────────────────┤
//                                             │ - name : String      │
//                                             ├──────────────────────┤
//                                             │ + displayName():void │
//                                             └──────────┬───────────┘
//                                                         │
//                                         ┌─────────────┴─────────────┐
//                                         │                           │
//                                         ▼                           ▼
//                             ┌───────────────────┐       ┌────────────────────┐
//                             │       Circle      │       │      Rectangle      │
//                             ├───────────────────┤       ├────────────────────┤
//                             │ - radius : double │       │ - length : double  │
//                             │                   │       │ - width : double   │
//                             ├───────────────────┤       ├────────────────────┤
//                             │ + area(): double  │       │ + area(): double   │
//                             └───────────────────┘       └────────────────────┘

class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Shape Name: " + name);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area(){
        return 3.1416 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class Area {
    public static void main(String[] args) {
        System.out.println("------------------------------");

        System.out.println("Result Of Area: ");

        Circle c = new Circle("Circle", 10);
        c.displayName();
        System.out.println("Area: " + c.area() + " Square Unit");

        System.out.println("------------------------------");

        Rectangle r = new Rectangle("Rectangle", 10.2, 20.1);
        r.displayName();
        System.out.println("Area: " + r.area() + " Square Unit");

        System.out.println("------------------------------");
    }
}