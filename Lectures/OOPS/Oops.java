public class Oops {
    public static void main(String[] args) {
        Pen myPen = new Pen();
        myPen.color = "Blue";
        myPen.type = "Gel";

        Pen officePen = new Pen();
        officePen.color = "Black";
        officePen.type = "Ballpoint";

        myPen.write();      // Output: Writing with a Blue Gel pen.
        officePen.write();  // Output: Writing with a Black Ballpoint pen.
    }

}

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing with a " + color + " " + type + " pen.");
    }
}
