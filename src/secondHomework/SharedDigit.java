package secondHomework;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) return false;

        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;

        int firstNumberLeadingDigit = firstNumber / 10;
        int secondNumberLeadingDigit = secondNumber / 10;

        return firstNumberLastDigit == secondNumberLastDigit ||
                firstNumberLastDigit == secondNumberLeadingDigit ||
                firstNumberLeadingDigit == secondNumberLeadingDigit ||
                firstNumberLeadingDigit == secondNumberLastDigit;
    }
}
