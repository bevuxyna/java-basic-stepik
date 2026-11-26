// Пользователь вводит с клавиатуры денежную сумму в рублях и копейках (рубли и копейки вводятся в разные переменные).
// Программа должна откорректировать введенную сумму в правильную форму.
// Например, если пользователь ввел 22 и 978 , то программа должна вывести 31 р. 78 к.
// Если количество копеек меньше 10, то при выводе нужно дополнить слева незначащим нулем. Для вывода рублей этого не требуется: 3 р. 05 к.

import java.util.Scanner;

class Task_1_7_3 {
    public static void main(String[] args) {
        int rub, kop;

        Scanner scan = new Scanner(System.in);

        rub = scan.nextInt();
        kop = scan.nextInt();

        int resultRub, resultKop;

        resultRub = rub + kop / 100;
        resultKop = kop % 100;

        System.out.println(resultRub + " р. " + resultKop + " к.");

    }
}