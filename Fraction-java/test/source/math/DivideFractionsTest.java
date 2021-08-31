package source.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideFractionsTest {
    @Test
    public void differentDenominators() {
        assertEquals(new Fraction(3, 1), new Fraction(1, 2).divideBy(new Fraction(1, 6)));
        assertEquals(new Fraction(1, 2), new Fraction(1, 8).divideBy(new Fraction(1, 4)));
        assertEquals(new Fraction(2, 15), new Fraction(2, 3).divideBy(new Fraction(5, 1)));
        assertEquals(new Fraction(12, 1), new Fraction(3, 1).divideBy(new Fraction(1, 4)));
    }
}
