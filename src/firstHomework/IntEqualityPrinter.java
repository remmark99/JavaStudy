package firstHomework;

public class IntEqualityPrinter {
    public static void main(String[] args) {
    }

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= 0 && secondNumber >= 0 && thirdNumber >= 0) {
            if (firstNumber == secondNumber && secondNumber == thirdNumber) {
                System.out.println("All numbers are equal");
            } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}