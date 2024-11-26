import by.gsu.exercises.*;

public class Main {
    public static void main(String[] args) {
        FizzBuzzClass.printFizzBuzz();
        System.out.println();

        System.out.println(ReverseStringClass.reverseString("Hello"));

        for (int i = 0; i < 15; i++) {
            System.out.print(FibonacciClass.fibonacci(i) + " ");
        }

        System.out.print(FactorialClass.factorial(5));

        System.out.println();
        int result = MiddleNumberClass.findMiddleNumber();
        System.out.println(result);
    }
}