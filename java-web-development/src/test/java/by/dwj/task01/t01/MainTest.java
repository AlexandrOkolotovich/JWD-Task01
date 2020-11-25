package by.dwj.task01.t01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void squarePositiveTest01(){
        int x = 20;

        int actual;
        int expected = 0;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest02(){
        int x = 21;

        int actual;
        int expected = 1;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest03(){
        int x = 23;

        int actual;
        int expected = 9;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest04(){
        int x = 24;

        int actual;
        int expected = 6;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest05(){
        int x = 25;

        int actual;
        int expected = 5;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest06(){
        int x = 26;

        int actual;
        int expected = 6;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest07(){
        int x = 27;

        int actual;
        int expected = 9;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest08(){
        int x = 28;

        int actual;
        int expected = 4;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest09(){
        int x = 29;

        int actual;
        int expected = 1;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }

    @Test
    public void squarePositiveTest10(){
        int x = -22;

        int actual;
        int expected = 4;

        actual = Main.lastDigitSquare(x);

        assertEquals(expected, actual);
    }
}
