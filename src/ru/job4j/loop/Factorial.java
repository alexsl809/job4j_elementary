package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int a = 1; a <= n; a++)
            result = a * a;

        if (n == 0)
            result = 1;
        if (n == 1)
            result = 0;

        return result;
    }
}