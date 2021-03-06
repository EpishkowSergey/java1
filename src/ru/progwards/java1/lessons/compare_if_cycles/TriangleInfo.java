package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < b + a;

    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;

    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
            return a == b || a == c || b == c;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,3));
        System.out.println(isTriangle(2,3,4));
        System.out.println(isRightTriangle(3,4,5));
        System.out.println(isRightTriangle(1,3,4));
        System.out.println(isIsoscelesTriangle(1,2,3));
    }
}
