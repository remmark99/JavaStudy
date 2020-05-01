package firstHomework;

public class BarkingDog {
    public static void main(String[] args) {
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        return hourOfDay >= 0 && hourOfDay <= 23 && isBarking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
