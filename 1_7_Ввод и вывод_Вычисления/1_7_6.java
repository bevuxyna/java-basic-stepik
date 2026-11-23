// Вычислите стоимость товара с учетом скидки. Пользователь вводит цену товара в виде двух целых чисел через пробел (рубли копейки).
// В следующей строке он вводит размер скидки в процентах (также целое число). Цену нужно вывести так, как показано в тесте.
// Учтите, что здесь не применяется округление по правилам математики. Стоимость товара всегда учитывается в большую сторону.
// При выводе число рублей и копеек выводится в двух позициях (т.е. 00 коп., если копеек нет)

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int rub, kop, discount;

        Scanner scan = new Scanner(System.in);

        rub = scan.nextInt();
        kop = scan.nextInt();
        discount = scan.nextInt();

        int sum = rub * 100 + kop;

        int discountAmount = (sum * discount) / 100;
        int result = sum - discountAmount;

        int resultRub = result / 100;
        int resultKop = result % 100;

        System.out.printf("%02d руб. %02d коп.", resultRub, resultKop);
    }
}