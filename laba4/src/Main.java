public class Main {
    public static void main(String[] args) {
        SimpleFraction fraction1 = new SimpleFraction(1, 2);
        SimpleFraction fraction2 = new SimpleFraction(3, 4);

        System.out.println("Сложение: " + fraction1.add(fraction2));
        System.out.println("Вычитание: " + fraction1.subtract(fraction2));
        System.out.println("Умножение: " + fraction1.multiply(fraction2));
        System.out.println("Деление: " + fraction1.divide(fraction2));
    }
}