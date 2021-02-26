package ru.geekbrains;

public class CharCounter {

    public static void main(String[] args) {
        CharCounter counter = new CharCounter();
        int[] chars = counter.count("aaazAz1b11bb4bAz");
        for (char i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                System.out.println(i + " встретилось " + chars[i] + " раза");
            }
        }
    }

    public int[] count(String sentence) {
        int[] c = new int[127];
        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            c[ch]++;
        }
        return c;
    }
}
