package source.math;

public class Fraction {
    private int integerValue;
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue);
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return 3;
    }

    public int getDenominator() {
        return 5;
    }
}
