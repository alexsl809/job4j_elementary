package ru.job4j.calculator;

import java.util.*;
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
        System.out.println("Введите рост девушки:");
        Scanner s = new Scanner(System.in);
        in = s.nextDouble();
        double woman = Fit.womanWeight(in);
        System.out.println("Женщина ростом " + in + " см " + " : " + woman + " кг.");
    }

}