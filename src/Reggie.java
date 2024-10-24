import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: MXXXXX)", "^(M|m)\\d{5}$");
        System.out.println("You entered a valid UC Student M number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O: Open, S: Save, V: View, Q: Quit]", "^[OoSsVvQq]$");
        System.out.println("You entered a valid menu choice: " + menuChoice);
    }
}

