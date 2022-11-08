package TasksForLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int sizeOfArray;
        boolean isSorted = true;
        int buffer;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите размер одномерного массива");
            while (!sc.hasNextInt()) {
                System.out.println("Это не число,введите заново");
                sc.next();
            }
            sizeOfArray = sc.nextInt();
            if (sizeOfArray < 0 ) {
                System.out.println("Введенное число не удовлетворяет условию");
            }
        } while (sizeOfArray < 0);
        System.out.println("Спасибо, вы ввели размер массива " + sizeOfArray);

        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100+1);
        }System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Отсортированный массив c использованием метода  sort: " + Arrays.toString(array));
        while(isSorted) {
            isSorted = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = true;
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                }
            }
        }System.out.println("Отсортированный массив пузырьковым методом: " + Arrays.toString(array));
    }
}
