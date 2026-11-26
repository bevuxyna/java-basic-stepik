// Напишите программу, которая вычисляет значение функции
// Вычисляется натуральный логарифм от суммы x и произведения 7 на  корень квадратный из следующего выражения: x в четвертой степени плюс число Пи.
// При выводе значение функции представьте с четырьмя знаками после десятичной точки.

import java.util.Scanner;

class Task_1_7_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();

        double operand = 7 * Math.sqrt(Math.PI + Math.pow(x, 4));
        double result = Math.log(x + operand);

        System.out.printf("%.4f",result);
    }
}