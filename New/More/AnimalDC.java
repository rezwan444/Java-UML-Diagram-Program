// Problem : Solve the java uml Diagram:
//                   ┌──────────────────┐
//                     │      Animal      │
//                     ├──────────────────┤
//                     │ - name : String  │
//                     │ - age : int      │
//                     ├──────────────────┤
//                     │ + eat() : void   │
//                     │ + display() :void│
//                     └────────┬─────────┘
//                              △
//                    ┌─────────┴─────────┐
//                    │                   │
//           ┌────────┴────────┐ ┌────────┴────────┐
//           │      Dog        │ │       Cat       │
//           ├─────────────────┤ ├─────────────────┤
//           │ - breed:String  │ │ - color:String │
//           ├─────────────────┤ ├─────────────────┤
//           │ + bark():void   │ │ + meow():void   │
//           └─────────────────┘ └─────────────────┘

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal eats water, milk");
    }

    public void display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age + " Year old");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);

        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog Breed: " + breed);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);

        this.color = color;
    }

    public void meow() {
        System.out.println("Cat Color: " + color);
    }
}

public class AnimalDC {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("The Dog information is here: ");

        Dog d1 = new Dog(":Lalu", 2, "Bengal");
        d1.display();
        d1.bark();
        d1.eat();

        System.out.println("------------------------------------------");
        System.out.println("The Cat information is here: ");

        Cat c1 = new Cat("Mishu", 1, "Brown");
        c1.display();
        c1.meow();
        c1.eat();

        System.out.println("------------------------------------------");
    }
}