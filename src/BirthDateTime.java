import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int daysInMonth = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, daysInMonth);

        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);

        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("You were born on " + year + "/" + month + "/" + day + " at " + hour + ":" + minute);
    }
}

