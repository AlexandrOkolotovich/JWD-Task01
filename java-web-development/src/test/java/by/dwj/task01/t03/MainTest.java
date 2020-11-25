package by.dwj.task01.t03;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void calculatePositiveTest01(){
        double x = 4;

        Double actual;
        Double expected = 2.0;

        actual = Main.calculateAttitude(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculatePositiveTest02(){
        double x = 100;

        Double actual;
        Double expected = 2.0;

        actual = Main.calculateAttitude(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculatePositiveTest03(){
        double x = 0;

        Double actual;
        Double expected = 0.0;

        actual = Main.calculateAttitude(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculatePositiveTest04(){
        double x = -4;

        Double actual;
        Double expected = 0.0;

        actual = Main.calculateAttitude(x);

        Assert.assertEquals(actual, expected);
    }
}
