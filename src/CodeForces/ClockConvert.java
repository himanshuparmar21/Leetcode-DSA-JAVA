package CodeForces;

import java.util.Scanner;

public class ClockConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String time24 = scanner.nextLine();
            String time12 = convertTo12HourFormat(time24);
            System.out.println(time12);
        }
    }

    public static String convertTo12HourFormat(String time24) {
        String[] parts = time24.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        String period = (hour < 12) ? "AM" : "PM";
        hour = hour % 12;
        if (hour == 0) {
            hour = 12;
        }

        return String.format("%02d:%02d %s", hour, minute, period);
    }
}
