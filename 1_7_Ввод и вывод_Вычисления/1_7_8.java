// Ввести значение вещественного аргумента a и вычислить значения двух функций
// Вывести на консоль сначала z, а потом y, разделив их пробелом. Значения представить с пятью знаками после десятичной точки.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();

        // z функция
        double firstOperand = Math.pow(Math.sin(3 * Math.PI - 2 * a),2);
        double secondOperand = Math.pow(Math.cos(5 * Math.PI + 2 * a),2);
        double z = 2 * firstOperand * secondOperand;

        // y функция
        double y = (1.0 / 4.0) - (1.0 / 4.0) * Math.sin((5.0 / 2.0) * Math.PI - 8 * a);

        System.out.printf("%8.5f%8.5f", z, y);
    }
}