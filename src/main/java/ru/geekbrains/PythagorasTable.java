package ru.geekbrains;

public class PythagorasTable {
    public static void main(String[] args) {
        final PythagorasTable pythagorasTable = new PythagorasTable();
        pythagorasTable.print();
    }

    private void print() {
        System.out.print("   ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%3d", i);
            for (int j = 1; j < 11; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}
