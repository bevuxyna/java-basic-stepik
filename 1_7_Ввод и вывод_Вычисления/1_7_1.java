// Напишите программу, которая считает сумму двух целых чисел.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, second;
        first = scan.nextInt();
        second = scan.nextInt();

        System.out.println(first + second);
    }
}