package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacionTest3 {
    @Test
    void operar()throws Exception {
        Multiplicacion multiplicacion= new Multiplicacion();
        float  result = multiplicacion.operar(new Float (-0.1), new Float(0.1));
        if (result < -0.01 || result > -0.01) {
            Assert.fail();
        }
    }
}