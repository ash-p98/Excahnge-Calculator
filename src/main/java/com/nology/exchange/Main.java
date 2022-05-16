package com.nology.exchange;

import com.nology.exchange.calculators.ExchangeRateCalculator;
import com.nology.exchange.calculators.GbpToUsdCalculator;
import com.nology.exchange.calculators.UsdToGbpCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ExchangeRateCalculator calculator = new UsdToGbpCalculator(); //the pointer variable can also be of interface type that the class of the object stored implements.
//        This is useful for creating common variables.
        System.out.println(calculator.fromCurrency() + " " + calculator.toCurrency());
        System.out.println(calculator.calculate(60));

        com.nology.exchange.ExchangeRateApp app = new com.nology.exchange.ExchangeRateApp();
        app.run();
    }
}