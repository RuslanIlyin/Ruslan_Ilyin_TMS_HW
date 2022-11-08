package TasksForLesson4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[5];
        int[] array1 = new int[5];
        int sum = 0;
        int sum1= 0;
        float srSumOfArray;
        float srSumOfArray1;

        for (int i =0; i <  array.length; i++) {
            array[i] = (int) (Math.random() * 100+1);
        }
        System.out.println(Arrays.toString(array));

        for (int j =0; j <  array1.length; j++) {
            array1[j] = (int) (Math.random() * 100+1);
        }
        System.out.println(Arrays.toString(array1));

        for (int i : array) {
            sum += i;
        }
        srSumOfArray = (float) sum/array.length;
        System.out.println("Cреднее арифметическое массива 1 = " + srSumOfArray);

        for (int i : array1) {
            sum1 += i;
        }
        srSumOfArray1 = (float) sum1/array1.length;
        System.out.println("Cреднее арифметическое массива 2 = " + srSumOfArray1);

        if (srSumOfArray1 < srSumOfArray) {
            System.out.println("Cреднее арифметическое массива 2 меньше среднего арифметического массива 1");
        } else if (srSumOfArray1 > srSumOfArray) {
            System.out.println("Cреднее арифметическое массива 2 больше среднего арифметического массива 1");
        } else {
            System.out.println("Cреднее арифметическое массива 2 равно среднему арифметическому массива 1");
        }
    }
}
