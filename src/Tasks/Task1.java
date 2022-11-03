package Tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("Введите любое положительное целое число ");
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
        String banderOstap = "Вы прямо герой труда";

        if (number > 0 && number < 15) {
            System.out.println("Группа " + ++num);
        } else if (number >= 15 && number < 30) {
            num+=2;
            System.out.println("Группа " + num);
        } else if (number >= 30) {

            num+=3;
            System.out.println("Группа " + num);
        }
        else {
            System.out.println("Вы ввели невереное число ");
        }
        if (num == 1) {
            System.out.println(banderOstap);
        } else if (num == 2) {
            for (int i = 0; i < num; i++) {
                System.out.println(banderOstap);
            }
                } else if (num ==3) {
            for (int i = 0; i < num; i++) {
                System.out.println(banderOstap);
            }
        }
    }
}
