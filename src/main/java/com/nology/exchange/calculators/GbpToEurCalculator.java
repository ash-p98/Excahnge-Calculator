package com.nology.exchange.calculators;

public class GbpToEurCalculator implements ExchangeRateCalculator {

    private double exchangeRate = 1.17;

    @Override
    public String fromCurrency() {
        return GBP;
    }

    @Override
    public String toCurrency() {
        return EUR;
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