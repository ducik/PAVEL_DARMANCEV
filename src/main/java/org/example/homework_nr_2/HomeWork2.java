package org.example.homework_nr_2;

public class HomeWork2 {public static void main(String[] args) {

    /* 1 до 12 и в зависимости от числа отображает на экран месяц в году,
    например число 8 -> август
     */

    int month = 8;
    switch (month) {
        case 1:
            System.out.println("январь");
            break;
        case 2:
            System.out.println("февраль");
            break;
        case 3:
            System.out.println("март");
            break;
        case 4:
            System.out.println("апрель");
            break;
        case 5:
            System.out.println("май");
            break;
        case 6:
            System.out.println("июнь");
            break;
        case 7:
            System.out.println("июль");
            break;
        case 8:
            System.out.println("август");
            break;
        case 9:
            System.out.println("сентябрь");
            break;
        case 10:
            System.out.println("октябрь");
            break;
        case 11:
            System.out.println("ноябрь");
            break;
        case 12:
            System.out.println("декабрь");
            break;
        default:
            System.out.println("не валидное число месяца");

    /* цикл который отображает в консоль все числа от 100 до 1000 которые делятся на 5
     */

    }
    for (int i = 100; i <= 1000; i++) {
        if (i % 5 == 0) System.out.println(i);
    }

    /* цикл(ы) который(е) отображает(ют) в консоль сумму следующей серии:
    1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
     */
    double sum = 0L;
    for (double i = 1; i <= 97; i += 2) {
        sum = sum + (i / (i +=2));
    }
    System.out.println(sum);

    /* вывода на экран  фигуры "*"

     */
    for (int i = 1; i < 10; i++) {
        for (int j = i; j >= 1; j--) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}






