package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest2 {

    @Test
    public void operar() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float (2.00000000000000000000000000000001), new Float(2));
        if (result < 4.00000000000000000000000000000001 || result > 4.00000000000000000000000000000001) {
            Assert.fail();
        }
    }
}