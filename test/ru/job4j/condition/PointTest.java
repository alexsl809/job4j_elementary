package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int [] in = {5, 2, 3, 0};
        double expected = 2.82;
        double out = Point.distance(in[0], in[1], in[2], in[3]);
        Assert.assertEquals(expected, out, 0.01);
    }
}