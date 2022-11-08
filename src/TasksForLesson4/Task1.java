package TasksForLesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        boolean found = false;
        int x = 5;
        int[] newArray;

        int[] array = new int[x];
        for (int i =0; i <  array.length; i++) {
            array[i] = (int) (Math.random() * 100+1);
        }
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное целое число от 1 до 100 включительно");
        int number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);

        for (int k : array)
            if (number == k) {
                found = true;
                break;
            }
        if (found) {
            System.out.println("Введенное число " + number + " входит в массив");
        }  else {
            System.out.println("Введенное число " + number + " не входит в массив");
            }

            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    newArray = new int[array.length - 1];
                    for (int index = 0; index < i; index++) {
                        newArray[index] = array[index];
                    }
                    for (int j = i; j < array.length - 1; j++) {
                        newArray[j] = array[j + 1];
                    }
                    System.out.println("Новый массив без введенного числа "+ Arrays.toString(newArray));
                    break;
                }
            }
    }
}
