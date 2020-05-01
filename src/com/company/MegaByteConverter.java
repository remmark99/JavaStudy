package com.company;

public class MegaByteConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainderKilobytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKilobytes + " KB");
        }
    }
}
