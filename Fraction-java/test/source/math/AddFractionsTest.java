package source.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {

        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }
}
