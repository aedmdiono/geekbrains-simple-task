package ru.geekbrains;

public class VariableSwapper {
    public static void main(String[] args) {
        swap1(-2, 7);
        swap2(-2, 7);
        swap3(-2, 7);
    }

    public static void swap1(int a, int b) {
        System.out.print("a = " + a + ", b = " + b + "; ");
        int c = b;
        b = a;
        a = c;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap2(int a, int b) {
        System.out.print("a = " + a + ", b = " + b + "; ");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap3(int a, int b) {
        System.out.print("a = " + a + ", b = " + b + "; ");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + ", b = " + b);
    }
}


