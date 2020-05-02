package secondHomework;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || secondNumber < 10) return -1;

        int gcd = 1;

        for (int i = 2; i < firstNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) gcd = i;
        }

        return gcd;
    }
}
