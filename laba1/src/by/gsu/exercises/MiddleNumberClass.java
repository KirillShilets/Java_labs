package by.gsu.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleNumberClass {
    public static int findMiddleNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        return numbers[1];
    }
}
