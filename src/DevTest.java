import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString method
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt method
        int validInt = SafeInput.getInt(in, "Enter a valid integer");
        System.out.println("You entered the integer: " + validInt);

        // Test getDouble method
        double validDouble = SafeInput.getDouble(in, "Enter a valid double");
        System.out.println("You entered the double: " + validDouble);

        // Test getRangedInt method
        int rangedInt = SafeInput.getRangedInt(in, "Enter a number", 1, 10);
        System.out.println("You entered the ranged integer: " + rangedInt);

        // Test getRangedDouble method
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double value", 1.0, 10.0);
        System.out.println("You entered the ranged double: " + rangedDouble);

        // Test getYNConfirm method
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You answered: " + (confirm ? "Yes" : "No"));

        // Test getRegExString method (for example: expecting an email address format)
        String email = SafeInput.getRegExString(in, "Enter your email", "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$");
        System.out.println("You entered a valid email: " + email);
    }
}
