package source.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() {
        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }

    @Test
    public void nonTrivialCommonDenominator() {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }
}
