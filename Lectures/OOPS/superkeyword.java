public class superkeyword {
    public static void main(String args[]){
        Horse h = new Horse();
        // System.out.println(h.color);
    }
}

class Animal {
    // String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super.color = "brown";
        super(); // This line calls the Animal() constructor.
        System.out.println("horse constructor is called");
    }
}
