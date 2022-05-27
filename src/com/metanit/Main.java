package com.metanit;

import java.util.Scanner;

class Primer {
    private static Primer primer = new Primer();
    private double x, y;
    private Primer(){
    }

    public static Primer getInstance(){
        return primer;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double Example(){
        return (2 * x) + (3 / y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Primer expression = Primer.getInstance();
        System.out.print("Введите X: ");
        double x = in.nextDouble();
        System.out.print("Введите Y: ");
        double y = in.nextDouble();
        expression.setX(x);
        expression.setY(y);
        System.out.println("Результат:" + expression.Example());

    }
}
