package TasksForLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int sizeOfArray2 = 0;

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray;
        do {
            System.out.println("Введите размер одномерного массива n: от 5 до 10 включительно");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число,введите заново");
                scanner.next();
            }
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray <= 5 || sizeOfArray > 10) {
                System.out.println("Введенное число не удовлетворяет условию");
            }
        } while (sizeOfArray <= 5 || sizeOfArray > 10);
        System.out.println("Спасибо, вы ввели размер массива " + sizeOfArray);

        int[] array = new int[sizeOfArray];
        for (int i =0; i <  array.length; i++) {
            array[i] = (int) (Math.random() * 100+1);
            if (array[i]%2 == 0) {
                sizeOfArray2++;
            }
        }
        System.out.println(Arrays.toString(array));

        int [] array2 = new int[sizeOfArray2];
        int index = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i]%2 == 0) {
                array2[index] = array[i];
                index++;
            }
        } System.out.println("Новый массив из четных чисел первого массива :" + Arrays.toString(array2));
    }
}
