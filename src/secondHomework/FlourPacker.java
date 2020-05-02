package secondHomework;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        goal -= bigCount < (goal / 5) ? bigCount * 5 : goal - goal % 5;

        return smallCount >= goal;
    }
}
