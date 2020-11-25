package by.dwj.task01.t08;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void functionPositiveTest01(){
        double x = 4;

        Double actual;
        Double expected = 5.0;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void functionPositiveTest02(){
        double x = 3;

        Double actual;
        Double expected = 9.0;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void functionPositiveTest03(){
        double x = 2;

        Double actual;
        Double expected = 0.5;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void functionPositiveTest04(){
        double x = 1;

        Double actual;
        Double expected = -0.2;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void functionPositiveTest05(){
        double x = 0;

        Double actual;
        Double expected = -0.16666666666666666;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void functionPositiveTest06(){
        double x = -1;

        Double actual;
        Double expected = -0.14285714285714285;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void functionPositiveTest07(){
        double x =1000000000;

        Double actual;
        Double expected = -9.99999997E17;

        actual = Main.functionValue(x);

        Assert.assertEquals(actual, expected);
    }
}
