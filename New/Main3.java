class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);

        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog Name: " + getName());
        System.out.println("Dog Age: " + getAge() + " Years");
        System.out.println("Dog Breed: " + breed);
        System.out.println("The dog is barking");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);

        this.color = color;
    }

    public void meow() {
        System.out.println("Cat Name: " + getName());
        System.out.println("Cat Age: " + getAge() + " Years");
        System.out.println("Cat Color: " + color);
        System.out.println("The cat is meowing");
    }
}

public class Main3{
    public static void main(String [] args) {
        Dog d1 = new Dog("Bengal Kutta", 2, "Bengal");
        Cat c1 = new Cat("Mishu", 1, "Brown");

        d1.bark();
        d1.sleep();
        d1.eat();

    System.out.println();

        c1.meow();
        c1.sleep();
        c1.eat();
    }
}