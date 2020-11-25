package by.dwj.task01.t02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void amountPositiveTest01(){
        int x = 2000;
        int y = 1;

        int actual;
        int expected = 31;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest02(){
        int x = 2000;
        int y = 2;

        int actual;
        int expected = 29;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest03(){
        int x = 2000;
        int y = 3;

        int actual;
        int expected = 31;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest04(){
        int x = 2000;
        int y = 4;

        int actual;
        int expected = 30;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest05(){
        int x = 2001;
        int y = 2;

        int actual;
        int expected = 28;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest06(){
        int x = 2004;
        int y = 2;

        int actual;
        int expected = 29;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest07(){
        int x = -2000;
        int y = 2;

        int actual;
        int expected = 0;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest08(){
        int x = 2000;
        int y = 13;

        int actual;
        int expected = 0;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest09(){
        int x = 2000;
        int y = -2;

        int actual;
        int expected = 0;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest10(){
        int x = -2000;
        int y = -2;

        int actual;
        int expected = 0;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest11(){
        int x = 2000;
        int y = 7;

        int actual;
        int expected = 31;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest12(){
        int x = 2000;
        int y = 8;

        int actual;
        int expected = 31;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest13(){
        int x = 2000;
        int y = 9;

        int actual;
        int expected = 30;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void amountPositiveTest14(){
        int x = 2000;
        int y = 12;

        int actual;
        int expected = 31;

        actual = Main.amountDays(x, y);

        assertEquals(expected, actual);
    }
}
