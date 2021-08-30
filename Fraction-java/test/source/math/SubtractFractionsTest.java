package source.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractFractionsTest {
    @Test
    public void sameDenominator() {
        assertEquals(new Fraction(1, 2), new Fraction(3, 4).minus(new Fraction(1, 4)));
    }

    @Test
    public void differentDenominator() {
        assertEquals(new Fraction(1, 3), new Fraction(1, 2).minus(new Fraction(1, 6)));
        assertEquals(new Fraction(16, 35), new Fraction(6, 7).minus(new Fraction(2, 5)));
        assertEquals(new Fraction(1, 15), new Fraction(9, 10).minus(new Fraction(5, 6)));
    }

}
