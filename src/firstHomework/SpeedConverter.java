package firstHomework;

public class SpeedConverter {


    public static void main(String[] args) {
        printConversion(10);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1L;

        return Math.round(kilometersPerHour / 1.609d);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1) {
            System.out.println("Invalid value!");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
