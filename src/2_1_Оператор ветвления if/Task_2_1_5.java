// Две команды студентов участвовали в олимпиаде по программированию. В первой команде было два человека, а во второй - четыре.
// Баллы, которые набрал каждый студент, вводятся с консоли (сначала две оценки первой команды, а потом - четыре оценки второй).
// В командном зачете сравниваются средние баллы каждой команды.
// Если средний балл первой команды больше, то нужно вывести слово "First",
// если больше средний балл второй команды, то слово "Second",а если эти средние баллы равны - то слово "Draw".

import java.util.Scanner;

class Task_2_1_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 1 1 1 1 1 2

        int first1 = scan.nextInt();
        int first2 = scan.nextInt();
        int second1 = scan.nextInt();
        int second2 = scan.nextInt();
        int second3 = scan.nextInt();
        int second4 = scan.nextInt();

        double midFirst = (first1 + first2) / 2.0;
        double midSecond = (second1 + second2 + second3 + second4) / 4.0;

        if (midFirst == midSecond) {
            System.out.println("Draw");
        } else if (midFirst > midSecond) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}