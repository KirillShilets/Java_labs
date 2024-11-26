package by.gsu.exercises;

public class FizzBuzzClass {
    public static void printFizzBuzz() {
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("fizzbuzz ");
            } else if (i % 5 == 0) {
                System.out.print("fizz ");
            } else if (i % 7 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

