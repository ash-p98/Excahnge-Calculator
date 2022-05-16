package com.nology.exchange.calculators;

public interface ExchangeRateCalculator {
    //The constants declared in interfaces are final - can't be changed!!
    //Convention - constants use UPPERCASE
    String GBP = "GBP";
    String EUR = "EUR";
    String USD = "USD";
    String fromCurrency();
    String toCurrency();
    double calculate(double fromAmount);

    double getExchangeRate();
}