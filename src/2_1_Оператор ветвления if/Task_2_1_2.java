// Пользователь вводит координаты двух точек на плоскости (в первой строке через пробел - координата X и координата Y первой точки,
// затем во второй строке также через пробел координаты второй точки).
// Нужно определить, какая из точек ближе к началу координат.
// Выводится одно из сообщений: "Первая точка ближе", "Вторая точка ближе", "Точки на равных расстояниях".

import java.util.Scanner;

class Task_2_1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float x1, y1, x2, y2;

        x1 = scan.nextFloat();
        y1 = scan.nextFloat();
        x2 = scan.nextFloat();
        y2 = scan.nextFloat();

        double d1 = Math.sqrt(x1 * x1 + y1 * y1);
        double d2 = Math.sqrt(x2 * x2 + y2 * y2);

        if(d1==d2){
            System.out.println("Точки на равных расстояниях");
        }else if(d1>d2){
            System.out.println("Вторая точка ближе");
        }else{
            System.out.println("Первая точка ближе");
        }
    }
}