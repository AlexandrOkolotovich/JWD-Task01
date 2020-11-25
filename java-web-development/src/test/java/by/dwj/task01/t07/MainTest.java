package by.dwj.task01.t07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void searchPositiveTest01(){
        double x1=0;
        double y1=0;
        double x2=1;
        double y2=1;

        String actual;
        String expected = "Point A is closer";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest02(){
        double x1=1;
        double y1=1;
        double x2=2;
        double y2=2;

        String actual;
        String expected = "Point A is closer";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest03(){
        double x1=-1;
        double y1=-1;
        double x2=2;
        double y2=2;

        String actual;
        String expected = "Point A is closer";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest04(){
        double x1=-1;
        double y1=1;
        double x2=2;
        double y2=2;

        String actual;
        String expected = "Point A is closer";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest06(){
        double x1=1;
        double y1=-1;
        double x2=2;
        double y2=2;

        String actual;
        String expected = "Point A is closer";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest07(){
        double x1=2;
        double y1=2;
        double x2=1;
        double y2=1;

        String actual;
        String expected = "Point B is closer";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest08(){
        double x1=1;
        double y1=1;
        double x2=1;
        double y2=1;

        String actual;
        String expected = "Equal distance";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest09(){
        double x1=-1;
        double y1=1;
        double x2=1;
        double y2=1;

        String actual;
        String expected = "Equal distance";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest10(){
        double x1=1;
        double y1=-1;
        double x2=1;
        double y2=1;

        String actual;
        String expected = "Equal distance";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }

    @Test
    public void searchPositiveTest11(){
        double x1=-1;
        double y1=-1;
        double x2=1;
        double y2=1;

        String actual;
        String expected = "Equal distance";

        actual = Main.searchCloser(x1, y1, x2, y2);

        assertEquals(expected, actual);
    }
}
