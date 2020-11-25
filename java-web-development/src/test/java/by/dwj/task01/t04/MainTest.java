package by.dwj.task01.t04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void checkPositiveTest01(){
        int x = 20;
        int y = 22;
        int z = 24;
        int o = 26;

        String actual;
        String expected = "TRUE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest02(){
        int x = 20;
        int y = 22;
        int z = 24;
        int o = 25;

        String actual;
        String expected = "TRUE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest03(){
        int x = 20;
        int y = 22;
        int z = 23;
        int o = 25;

        String actual;
        String expected = "TRUE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest04(){
        int x = 20;
        int y = 21;
        int z = 23;
        int o = 25;

        String actual;
        String expected = "FALSE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest05(){
        int x = 19;
        int y = 21;
        int z = 23;
        int o = 25;

        String actual;
        String expected = "FALSE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest06(){
        int x = 0;
        int y = 0;
        int z = 23;
        int o = 25;

        String actual;
        String expected = "FALSE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest07(){
        int x = 0;
        int y = 0;
        int z = 24;
        int o = 26;

        String actual;
        String expected = "TRUE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest08(){
        int x = 0;
        int y = 0;
        int z = 0;
        int o = 0;

        String actual;
        String expected = "FALSE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest09(){
        int x = -4;
        int y = -6;
        int z = -10;
        int o = 2;

        String actual;
        String expected = "FALSE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }

    @Test
    public void checkPositiveTest10(){
        int x = -2;
        int y = -6;
        int z = 2;
        int o = 4;

        String actual;
        String expected = "TRUE";

        actual = Main.checkTwoEven(x, y, z, o);

        assertEquals(expected, actual);
    }
}
