package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSquare62() {
    int [] in = {6, 2};
    double expected = 2.00;
    double out = SqArea.square(in[0], in[1]);
    Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenSquare155() {
        int [] in = {15, 5};
        double expected = 5.00;
        double out = SqArea.square(in[0], in[1]);
        Assert.assertEquals(expected, out, 0.01);
    }
}