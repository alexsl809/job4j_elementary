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
        double man = Fit.manWeight(185);
        System.out.println("Man 185 is " + man);
        double woman = Fit.womanWeight(160);
        System.out.println("Woman 160 is " + woman);
    }

}