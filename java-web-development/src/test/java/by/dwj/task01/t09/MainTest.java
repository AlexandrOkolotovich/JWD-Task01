package by.dwj.task01.t09;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    final double p = 3.14;

    @Test
    public void lengthPositiveTest01(){
        double x = 4;

        Double actual;
        Double expected = 25.12;

        actual = Main.countLength(x, p);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void squarePositiveTest01(){
        double x = 4;

        Double actual;
        Double expected = 50.24;

        actual = Main.countSquare(x, p);

        Assert.assertEquals(actual, expected);
    }
}
