package com.nology.exchange.calculators;


public class EurToGBPCalculator implements ExchangeRateCalculator {

    private double exchangeRate = 0.85;

    @Override
    public String fromCurrency() {
        return EUR;
    }

    @Override
    public String toCurrency() {
        return GBP;
    }

    @Override
    public double calculate(double fromAmount) {
        return fromAmount * exchangeRate;
    }

    @Override
    public double getExchangeRate() {
        return this.exchangeRate;
    }
}