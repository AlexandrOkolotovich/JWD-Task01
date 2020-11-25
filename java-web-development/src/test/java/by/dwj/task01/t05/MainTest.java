package by.dwj.task01.t05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void sumPositiveTest01(){
        int x = 0;

        String actual;
        String expected = "FALSE";

        actual = Main.sum(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sumPositiveTest02(){
        int x = 1;

        String actual;
        String expected = "FALSE";

        actual = Main.sum(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sumPositiveTest03(){
        int x = 2;

        String actual;
        String expected = "FALSE";

        actual = Main.sum(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sumPositiveTest04(){
        int x = 6;

        String actual;
        String expected = "TRUE";

        actual = Main.sum(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sumPositiveTest05(){
        int x = 28;

        String actual;
        String expected = "TRUE";

        actual = Main.sum(x);

        assertEquals(expected, actual);
    }

    @Test
    public void sumPositiveTest06(){
        int x = -6;

        String actual;
        String expected = "FALSE";

        actual = Main.sum(x);

        assertEquals(expected, actual);
    }
}
