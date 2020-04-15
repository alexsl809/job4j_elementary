package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100.00)*1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110.00)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double in = 185.00;
        double man = Fit.manWeight(in);
        System.out.println("Man 185 is " + man);
        in = 160;
        double woman = Fit.womanWeight(in);
        System.out.println("Woman 160 is " + woman);
    }

}