package TasksForLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int sizeOfArray;

        Scanner scanner = new Scanner(System.in);
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

        String[] array = new String[sizeOfArray];
        for (int i = 0; i <sizeOfArray; i++) {
            Scanner scanName = new Scanner(System.in);
            System.out.println("Введите имя ");
            array[i] = scanName.next();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив по алфавиту: " + Arrays.toString(array));
    }
}
