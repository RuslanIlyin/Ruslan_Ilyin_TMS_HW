package TasksForLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int sizeOfArray;
        int amount = 0;
        float averageValue;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива");
        sizeOfArray = scanner1.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i =0; i <  array.length; i++) {
            array[i] = (int) (Math.random() * 100+1);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for (int j: array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальное число массива = " + max);

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Mинимальное число массива = " + min);

        for (int i : array) {
            amount += i;
        }
        averageValue = (float) amount/sizeOfArray;
        System.out.println("Cреднее арифметическое массива = " + averageValue);
    }
}
