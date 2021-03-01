package ru.geekbrains;

public class VariableSwapper {
    public static void main(String[] args) {
        swap1(-2, 7);
        swap2(-2, 7);
        swap3(-2, 7);
    }

    public static void swap1(int a, int b) {
        System.out.printf("a = %d, b = %d; ", a, b);
        int c = b;
        b = a;
        a = c;
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public static void swap2(int a, int b) {
        System.out.printf("a = %d, b = %d; ", a, b);
        a += b;
        b = a - b;
        a -= b;
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public static void swap3(int a, int b) {
        System.out.printf("a = %d, b = %d; ", a, b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.printf("a = %d, b = %d\n", a, b);
    }
}


