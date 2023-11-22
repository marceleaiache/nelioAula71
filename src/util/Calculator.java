package util;

public class Calculator {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volum(double radius) {
        return 4 * PI * (Math.pow(3, radius)) / 3 ;
    }
}
