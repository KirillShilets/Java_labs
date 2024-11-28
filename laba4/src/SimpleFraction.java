import java.util.Objects;

class SimpleFraction {
    private Number numerator;
    private Number denominator;

    public SimpleFraction(double numerator, double denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = new Number(numerator);
        this.denominator = new Number(denominator);
    }

    public Number getNumerator() {
        return numerator;
    }

    public Number getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleFraction that = (SimpleFraction) o;
        return Objects.equals(numerator, that.numerator) && Objects.equals(denominator, that.denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator.getValue() + "/" + denominator.getValue();
    }

    public SimpleFraction add(SimpleFraction other) {
        double newNumerator = this.numerator.getValue() * other.denominator.getValue() +
                this.denominator.getValue() * other.numerator.getValue();
        double newDenominator = this.denominator.getValue() * other.denominator.getValue();
        return new SimpleFraction(newNumerator, newDenominator);
    }

    public SimpleFraction subtract(SimpleFraction other) {
        double newNumerator = this.numerator.getValue() * other.denominator.getValue() -
                this.denominator.getValue() * other.numerator.getValue();
        double newDenominator = this.denominator.getValue() * other.denominator.getValue();
        return new SimpleFraction(newNumerator, newDenominator);
    }

    public SimpleFraction multiply(SimpleFraction other) {
        double newNumerator = this.numerator.getValue() * other.numerator.getValue();
        double newDenominator = this.denominator.getValue() * other.denominator.getValue();
        return new SimpleFraction(newNumerator, newDenominator);
    }

    public SimpleFraction divide(SimpleFraction other) {
        if (other.numerator.getValue() == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        double newNumerator = this.numerator.getValue() * other.denominator.getValue();
        double newDenominator = this.denominator.getValue() * other.numerator.getValue();
        return new SimpleFraction(newNumerator, newDenominator);
    }
}