package com.company;

public class Main {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new OperacjaA());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new StrategyContext(new OperacjaB());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
    }
}
