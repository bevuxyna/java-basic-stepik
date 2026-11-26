// Введите значения трех переменных: имени (может состоять из нескольких слов), возраста (целое) и размера скидки (вещественное).
// Выведите на консоль рекламное предложение в формате, показанном в примере теста.

import java.util.Scanner;

class Task_1_7_2 {
    public static void main(String[] args) {
        String name;
        int age;
        double discount;

        Scanner scan = new Scanner(System.in);

        name = scan.nextLine();
        age = scan.nextInt();
        discount = scan.nextDouble();

        System.out.println("С днем рождения, " + name + "!" + " Сегодня Вам " + age + "!");
        System.out.println("По этому поводу дарим Вам скидку " + discount + "%");
        System.out.println("на весь ассортимент нашего сайта!");
    }
}