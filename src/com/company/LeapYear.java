package com.company;

public class LeapYear {
    public static void main(String[] args) {
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year > 0 && year < 10000) {
            if (year % 100 != 0) {
                return true;
            }

            return year % 400 == 0;
        }

        return false;
    }
}
