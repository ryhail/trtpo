package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {

    @Test
    void subtract() {
        Complex a = new Complex(2,1);
        Complex b = new Complex(1, 2);

        Complex sub = a.subtract(b);

        assertEquals(sub.getReal(), 1);
        assertEquals(sub.getIm(), -1);
    }

    @Test
    void division() {
        Complex a = new Complex(2,1);
        Complex b = new Complex(1, 2);

        Complex div = a.division(b);

        assertEquals(div.getReal(), 0.8, 0.0001);
        assertEquals(div.getIm(), -0.6, 0.0001);
    }
}