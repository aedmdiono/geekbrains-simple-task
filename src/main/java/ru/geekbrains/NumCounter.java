package ru.geekbrains;

public class NumCounter {

    public static void main(String[] args) {
        NumCounter numCounter = new NumCounter();
        System.out.println(numCounter.count(234000));
        System.out.println(numCounter.recursiveCount(234000));
    }

    public int count(long num) {
        int c = 0;
        while (num != 0) {
            c += num % 10;
            num /= 10;
        }
        return c;
    }

    public int recursiveCount(long num) {
        if (num == 0) {
            return 0;
        }
        return (int) (num % 10) + recursiveCount(num / 10);
    }
}
