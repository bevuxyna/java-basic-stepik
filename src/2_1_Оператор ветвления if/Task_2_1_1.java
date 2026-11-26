// Пользователь вводит целое число. Определить, является ли оно четным.
// Если число четное, нужно вывести YES, а если нечетное NO

import java.util.Scanner;

class Task_2_1_1 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if((number % 2) == 0){
           System.out.println("YES");
        }else{
           System.out.println("NO");
        }

    }
}