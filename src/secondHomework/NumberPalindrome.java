package secondHomework;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-222);
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int numberCopy = number;

        while (numberCopy > 0) {
            reversedNumber *= 10;
            reversedNumber += numberCopy % 10;
            numberCopy /= 10;
        }

        return reversedNumber == number;
    }
}
