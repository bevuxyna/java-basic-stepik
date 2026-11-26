// Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
// Если число не является трехзначным, вывести "ERROR".
// Если нечетных цифр нет, то вывести "NO".

import java.util.Scanner;

class Task_2_1_3 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        number = Math.abs(scan.nextInt());
        boolean isThreeDigits = number >= 100 && number <= 999;

        if(!isThreeDigits){
           System.out.println("ERROR");
           return;
        }

        int a, b, c; // цифры числа

        a = number / 100;
        b = number / 10 % 10;
        c = number % 10;

        int sum = 0;

        if(a % 2 != 0){
            sum = sum + a;
        }
        if(b % 2 != 0){
            sum = sum + b;
        }
        if(c % 2 != 0){
            sum = sum + c;
        }

        if(sum == 0){
           System.out.println("NO");
           return;
        }

        System.out.println(sum);
    }
}