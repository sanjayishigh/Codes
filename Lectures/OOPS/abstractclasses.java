// File: Animal.java
abstract class Animal {
    String color;

    // Constructor for the abstract class
    Animal() {
        this.color = "brown";
        System.out.println("Animal constructor called");
    }

    // Concrete method (has an implementation)
    void eat() {
        System.out.println("This animal eats.");
    }

    // Abstract method (no implementation, must be overridden by subclasses)
    abstract void walk();
}

// File: Horse.java
class Horse extends Animal {

    // Horse constructor
    Horse() {
        // super() is called implicitly here, invoking the Animal constructor
        System.out.println("Horse constructor called");
    }

    // Implementation of the abstract method from Animal
    @Override
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

// File: Mustang.java
class Mustang extends Horse {

    // Mustang constructor
    Mustang() {
        // super() is called implicitly here, invoking the Horse constructor
        System.out.println("Mustang constructor called");
    }
}

// File: Main.java
public class abstractclasses {
    public static void main(String[] args) {
        // You cannot do this: Animal a = new Animal(); // Error: Animal is abstract

        System.out.println("--- Creating a Mustang object ---");
        Mustang myHorse = new Mustang(); // This will trigger the chain of constructor calls

        System.out.println("\n--- Calling methods ---");
        myHorse.eat();  // Calling a non-abstract method from the Animal class
        myHorse.walk(); // Calling an abstract method implemented in the Horse class
    }
}