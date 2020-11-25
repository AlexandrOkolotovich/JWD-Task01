package by.dwj.task01.t06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void calculatePositiveTest01(){
        int x = 0;

        String actual;
        String expected = "0 hours 0 minutes 0 seconds have passed";

        actual = Main.calculateTime(x);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest02(){
        int x = 60;

        String actual;
        String expected = "0 hours 1 minutes 0 seconds have passed";

        actual = Main.calculateTime(x);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest03(){
        int x = 3600;

        String actual;
        String expected = "1 hours 0 minutes 0 seconds have passed";

        actual = Main.calculateTime(x);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest04(){
        int x = 14625;

        String actual;
        String expected = "4 hours 3 minutes 45 seconds have passed";

        actual = Main.calculateTime(x);

        assertEquals(expected, actual);
    }

    @Test
    public void calculatePositiveTest05(){
        int x = -60;

        String actual;
        String expected = "ERROR";

        actual = Main.calculateTime(x);

        assertEquals(expected, actual);
    }
}
