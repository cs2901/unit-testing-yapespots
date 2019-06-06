package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest4 {

    @Test
    void operar()throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float (-0.1), new Float(0.1));
        if (result < 0 || result > 0) {
            Assert.fail();
        }
    }
}