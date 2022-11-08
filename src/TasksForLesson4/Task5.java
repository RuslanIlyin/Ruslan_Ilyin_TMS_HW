package TasksForLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray;
        do {
            System.out.println("Введите размер одномерного массива");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число,введите заново");
                scanner.next();
            }
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray < 0 ) {
                System.out.println("Введенное число не удовлетворяет условию");
            }
        } while (sizeOfArray < 0);
        System.out.println("Спасибо, вы ввели размер массива " + sizeOfArray);

        int [] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*1000+1);
        }System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }System.out.println(Arrays.toString(array));
    }
}
