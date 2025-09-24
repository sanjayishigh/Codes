public class statickeyword {
    public static void main(String args[]) {
        // Create first student object
        Student s1 = new Student();
        s1.schoolName = "JMV"; // Set the static variable

        // Create second student object
        Student s2 = new Student();
        // The value is already set because it's shared
        System.out.println(s2.schoolName); 
    }
}

class Student {
    String name;  // Belongs to each object
    int roll;     // Belongs to each object

    static String schoolName; // Belongs to the class, shared by all objects

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}