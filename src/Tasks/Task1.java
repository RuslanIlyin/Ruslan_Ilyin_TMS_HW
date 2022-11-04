package Tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int score = 0;
        String banderOstap = "Вы прямо герой труда";

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое положительное целое число ");
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);

        if (number > 0 && number < 15) {
            System.out.println("Группа 1");
            score = 1;
        } else if (number >= 15 && number < 30) {
            score = 2;
            System.out.println("Группа 2");
        } else if (number >= 30) {
            score = 3;
            System.out.println("Группа 3");
        }
        else {
            System.out.println("Вы ввели неверное число ");
        }

            for (int i = 0; i < score; i++) {
                System.out.println(banderOstap);
            }
    }
}

