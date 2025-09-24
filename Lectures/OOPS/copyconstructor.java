public class copyconstructor {
    public static void main(String[] args) {
        int[] marks = {90, 85, 80};
        Student s1 = new Student("Sanjay", 21, marks);

        // Create s2 using copy constructor
        Student s2 = new Student(s1);

        // Show s2's data before changing s1
        System.out.println("s2 -> Name: " + s2.name + ", Age: " + s2.age);

        // Changing s1's name (primitive type — copied by value)
        s1.name = "Vegeta";

        // Changing marks in s1
        s1.marks[0] = 0;

        // Show that s2 is not affected if deep copy is used
        System.out.println("s2 -> Name: " + s2.name + ", Age: " + s2.age);
        System.out.println("s2 -> Marks[0]: " + s2.marks[0]); // Will remain 90 if deep copy is used
    }
}

class Student {
    String name;
    int age;
    int marks[];

    // Parameterized constructor
    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

/*    // Shallow copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks; // Copies reference — SHALLOW COPY  */

    // Copy constructor (deep copy)
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        // Deep copy of marks array
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
