package source.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyFractionsTest {
    @Test
    public void differentDenominators() {
        assertEquals(new Fraction(1, 5), new Fraction(1, 2).times(new Fraction(2, 5)));
        assertEquals(new Fraction(3, 16), new Fraction(1, 3).times(new Fraction(9, 16)));
        assertEquals(new Fraction(10, 3), new Fraction(2, 3).times(new Fraction(5, 1)));
        assertEquals(new Fraction(12, 35), new Fraction(2, 5).times(new Fraction(6, 7)));
        assertEquals(new Fraction(1, 6), new Fraction(1, 4).times(new Fraction(2, 3)));
    }
}
