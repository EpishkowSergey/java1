package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        String result = "";

        while(number > 0) {
            result = result + number % 10;
            number = number / 10;
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(789));
    }
}
