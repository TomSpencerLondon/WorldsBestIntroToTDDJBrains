package source.math;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        final int signOfDenominator = denominator < 0 ? -1 : 1;
        // contract: gcd() never returns 0
        final int gcd = NumberTheory.gcd(numerator, denominator) * signOfDenominator;
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    public Fraction minus(Fraction that) {
        return new Fraction(this.numerator * that.denominator - that.numerator * this.denominator, this.denominator * that.denominator);
    }

    public Fraction times(Fraction that) {
        return new Fraction(this.numerator * that.numerator, this.denominator * that.denominator);

    }

    public Fraction divideBy(Fraction that) {
        return new Fraction(this.numerator * that.denominator, this.denominator * that.numerator);
    }
}
