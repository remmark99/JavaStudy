package secondHomework;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / (double)count));
    }
}
