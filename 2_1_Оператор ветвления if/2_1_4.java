// Пользователь вводит с клавиатуры целое положительное шестизначное число.
// Нужно определить, является ли число счастливым, и вывести YES, если это так,  и NO в противном случае.
// Счастливым считается шестизначное число, у которого сумма первых трех цифр равна сумме последних трех цифр.
// Если число не шестизначное, то нужно вывести ERROR.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isSixDigits = number >= 100000 && number <= 999999;

        if (!isSixDigits) {
            System.out.println("ERROR");
            return;
        }

        int f = number % 10;
        number = number / 10;
        int e = number % 10;
        number = number / 10;
        int d = number % 10;
        number = number / 10;
        int c = number % 10;
        number = number / 10;
        int b = number % 10;
        int a = number / 10;

        int sum1 = a + b + c;
        int sum2 = d + e + f;

        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}