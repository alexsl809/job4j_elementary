package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean a = first > second;
        boolean b = second > third;

        int result1 = a? first : second;
        int result2 = b? second : third;

        boolean c = result1 > result2;

        int result = c? result1 : result2;

        return result;
    }
}