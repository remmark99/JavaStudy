package secondHomework;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0) return -1;

        int result = -1;
        int copy = number;

        for (int i = 2; i <= copy; i++) {
            if (copy % i == 0) {
                result = i;
                copy /= i;
                i--;
            }
        }

        return result;
    }
}
