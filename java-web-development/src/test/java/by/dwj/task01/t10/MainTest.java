package by.dwj.task01.t10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void calculatePositiveTest01(){
        int x = 0;
        int y = 10;
        int z = 2;

        String actual;
        String expected = " 0.0 | 0.0\n" +
                " 2.0 | -2.185039863261519\n" +
                " 4.0 | 1.1578212823495775\n" +
                " 6.0 | -0.29100619138474915\n" +
                " 8.0 | -6.799711455220379\n" +
                " 10.0 | 0.6483608274590866\n";

        actual = Main.calculateFunction(x, y, z);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest02(){
        int x = -2;
        int y = 8;
        int z = 2;

        String actual;
        String expected = " -2.0 | 2.185039863261519\n" +
                " 0.0 | 0.0\n" +
                " 2.0 | -2.185039863261519\n" +
                " 4.0 | 1.1578212823495775\n" +
                " 6.0 | -0.29100619138474915\n" +
                " 8.0 | -6.799711455220379\n";

        actual = Main.calculateFunction(x, y, z);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest03(){
        int x = 10;
        int y = 2;
        int z = 2;

        String actual;
        String expected = "ERROR";

        actual = Main.calculateFunction(x, y, z);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest04(){
        int x = 2;
        int y = 10;
        int z = 9;

        String actual;
        String expected = "ERROR";

        actual = Main.calculateFunction(x, y, z);

        assertEquals(expected, actual);
    }


}
