package source.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static source.math.NumberTheory.gcd;

public class GreatestCommonDivisorTest {
    @Test
    public void reflexive() {
        assertEquals(1, gcd(1, 1));
        assertEquals(2, gcd(2, 2));
        assertEquals(1, gcd(-1, -1));
    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, gcd(2, 3));
        assertEquals(1, gcd(4, 7));
        assertEquals(1, gcd(-2, -3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        assertEquals(3, gcd(3, 9));
        assertEquals(5, gcd(5, 30));
    }

    @Test
    public void commonFactor() {
        assertEquals(2, gcd(6, 8));
        assertEquals(7, gcd(49, 315));
    }

    @Test
    public void negative() {
        // I'm not sure whether I like this behaviour.
        // I probably prefer that GCD be positive at all times
        assertEquals(4, gcd(-24, 28));
        assertEquals(4, gcd(24, -28));

    }

}
