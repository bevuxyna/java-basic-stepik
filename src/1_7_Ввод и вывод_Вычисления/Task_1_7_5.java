// На вход программы подается размер интервала времени в секундах.
// Переведите это в часы, минуты и секунды и выведите согласно примеру теста.

import java.util.Scanner;

class Task_1_7_5 {
    public static void main(String[] args) {
        int input, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();

        hours = input / 3600;
        minutes = (input - hours * 3600) / 60;
        seconds = input - hours * 3600 - minutes * 60;

        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}