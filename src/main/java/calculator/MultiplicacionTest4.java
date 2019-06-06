package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacionTest4 {
    @Test
    void operar()throws Exception {
        Multiplicacion multiplicacion= new Multiplicacion();
        float  result = multiplicacion.operar(new Float (0), new Float(0.0));
        if (result < 0 || result > 0) {
            Assert.fail();
        }
    }

}