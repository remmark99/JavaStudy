package secondHomework;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;

            return firstNumberLastDigit == secondNumberLastDigit ||
                    firstNumberLastDigit == thirdNumberLastDigit ||
                    secondNumberLastDigit == thirdNumberLastDigit;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return number > 9 && number < 1001;
    }
}
