public class Accessmodifiers {
    public static void main(String args[]) {
        BankAccount acc1 = new BankAccount();

        acc1.username = "Sanjay";  // ✅ public access is allowed
        System.out.println("Username: " + acc1.username);

        // ❌ Cannot access acc1.password directly since it's private
        // acc1.password = "123"; // This will cause a compile-time error

        acc1.setPass("123");  // ✅ Set password using a public setter method
        acc1.displayPassword(); // ✅ Just for learning – display password using a method
    }
}

class BankAccount {
    public String username;     // Can be accessed and modified anywhere
    private String password;    // Only accessible within this class

    // Public setter to set password securely
    public void setPass(String newPass) {
        password = newPass;
    }

    // Optional: A method to show the password
    public void displayPassword() {
        System.out.println("Password: " + password);
    }
}
