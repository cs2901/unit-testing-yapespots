package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacionTest {

    @Test
    void operar()throws Exception {
        Multiplicacion multiplicacion= new Multiplicacion();
        float  result = multiplicacion.operar(new Float (2.00000000000000000000000000000001), new Float(2));
        if (result < 4.00000000000000000000000000000002 || result > 4.00000000000000000000000000000002) {
            Assert.fail();
        }
    }
}