// В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
// Требуется определить, на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
// Пользователь вводит три целых числа (три зарплаты в рублях). Программа выводит разность зарплат в рублях.
// Используйте тернарную операцию!

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int first, second, third;

        Scanner scan = new Scanner(System.in);

        first = scan.nextInt();
        second = scan.nextInt();
        third = scan.nextInt();

        int min = (first < second) ? (first < third ? first : third) : (second < third ? second : third);

        int max = (first > second) ? (first > third ? first : third) : (second > third ? second : third);

        System.out.println(max - min);
    }
}