package by.gsu.exercises;

public class FactorialClass {
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Факториал не существует для отрицательных чисел");
        }
        if (num == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
