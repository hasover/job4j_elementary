package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when52to36then4dot47() {
        double expected = 4.47;
        int x1 = 5;
        int y1 = 2;
        int x2 = 3;
        int y2 = 6;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to11then1() {
        double expected = 1;
        int x1 = 2;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to21then1dot41() {
        double expected = 1.41;
        int x1 = 3;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void test3D() {
        double expected = 5;
        int x1 = 5;
        int y1 = 6;
        int x2 = 1;
        int y2 = 3;
        int z1 = 7;
        int z2 = 7;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}