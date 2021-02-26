package ru.geekbrains;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(6));
        System.out.println(fb.fizzBuzz(10));
        System.out.println(fb.fizzBuzz(15));
        System.out.println(fb.fizzBuzz(45));
        System.out.println(fb.fizzBuzz(8));
        System.out.println(fb.fizzBuzz(9));
    }
    public String fizzBuzz(int num) {
        String res = "";
        if (num % 3 == 0) {
            res = "Fizz";
        }
        if (num % 5 == 0) {
            res += "Buzz";
        }
        return res;
    }
}
