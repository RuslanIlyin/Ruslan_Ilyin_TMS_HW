package TasksForLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {

        boolean check = false;

        int[] array = new int[5];
        for (int i =0; i <  array.length; i++) {
        array[i] = (int) (Math.random() * 100+1);
        }System.out.println(Arrays.toString(array));
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое положительное целое число от 1 до 100 включительно");
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);

        for (int j : array) {
            if (number == j) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Введенное число " + number + " входит в массив");
        }  else {
            System.out.println("Введенное число " + number + " не входит в массив");
        }
    }
}
